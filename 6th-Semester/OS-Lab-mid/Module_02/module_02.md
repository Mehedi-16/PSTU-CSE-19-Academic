**OS Lab 2 – Process Management (Module 2)** এর প্রতিটি কোডকে আমি চার ভাগে সাজালাম:  

1. **Code**  
2. **Mechanism (কাজের ব্যাখ্যা)**  
3. **Run করার কমান্ড**  
4. **Output কী আসবে**  

---

## 🔷 Process Controlling  

### fork()  
**Code:**  
```cpp
#include <iostream>
#include <unistd.h>
using namespace std;

int main() {
    int pid = fork();
    if (pid == 0)
        cout << "Child process  -> " << pid << endl;
    else
        cout << "Parent process -> " << pid << endl;
}
```
**Mechanism:**  
- `fork()` → নতুন child process তৈরি করে।  
- Child branch এ `pid = 0`।  
- Parent branch এ `pid = child_pid (>0)`।  
- দুজন parallel চলে, তাই order fixed না।  

**Run:**  
```bash
g++ fork_example.cpp -o fork_example
./fork_example
```  
**Output:**  
```
Parent process -> 97162
Child process  -> 0
```

---

### exec()  
**Code:**  
```cpp
#include <unistd.h>
int main() {
    execlp("ls", "ls", "-la", NULL);
    return 0;
}
```
**Mechanism:**  
- `exec()` → বর্তমান process কে নতুন program দিয়ে replace করে।  
- এখানে `ls -la` চালানো হবে।  

**Run:**  
```bash
g++ exec_example.cpp -o exec_example
./exec_example
```  
**Output:**  
👉 বর্তমান directory এর detailed listing আসবে।  

---

### wait()  
**Code:**  
```cpp
#include <iostream>
#include <unistd.h>
#include <sys/wait.h>
using namespace std;

int main() {
    int pid = fork();
    if (pid == 0) {
        sleep(5);
        cout << "Child process  -> " << pid << endl;
    } else {
        cout << "Parent process -> " << pid << endl;
        wait(NULL);
    }
}
```
**Mechanism:**  
- Parent সাথে সাথে প্রিন্ট করবে।  
- Child 5 sec পরে প্রিন্ট করবে।  
- `wait()` → Parent child শেষ না হওয়া পর্যন্ত অপেক্ষা করবে।  

**Run:**  
```bash
g++ wait_example.cpp -o wait_example
./wait_example
```  
**Output:**  
```
Parent process -> <child_pid>
Child process  -> 0   (5 sec পরে)
```

---

## 🔷 Signal Controlling  

### SIGINT  
**Code:**  
```cpp
#include <iostream>
#include <csignal>
#include <unistd.h>
using namespace std;

void sig_int(int sig_num) {
    cout << "Received signal, " << sig_num << endl;
    exit(sig_num);
}

int main() {
    signal(SIGINT, sig_int);
    while (true);
}
```
**Mechanism:**  
- Program চলতে থাকবে।  
- Ctrl+C চাপলে SIGINT যাবে।  
- Handler `sig_int()` call হবে → প্রিন্ট করবে এবং exit করবে।  

**Run:**  
```bash
g++ sigint_example.cpp -o sigint_example
./sigint_example
```
👉 তারপর **Ctrl+C চাপলে** output আসবে।  

**Output:**  
```
Received signal, 2
```

---

### SIGKILL  
**Code:**  
```cpp
#include <iostream>
#include <csignal>
#include <unistd.h>
using namespace std;

int main() {
    int target_pid = 1234;
    if (kill(target_pid, SIGKILL) == 0)
        cout << "Killed " << target_pid << endl;
    else
        cout << "Not found!" << endl;
}
```
**Mechanism:**  
- `kill(pid, SIGKILL)` → target process কে জোর করে terminate করে।  
- যদি PID valid হয় → kill হবে।  

**Run:**  
```bash
g++ sigkill_example.cpp -o sigkill_example
./sigkill_example
```
👉 এখানে `target_pid` আসল process ID দিতে হবে।  

**Output:**  
```
Killed 1234
```
অথবা  
```
Not found!
```

---

### Mini Shell  
**Code:**  
```cpp
#include <iostream>
#include <unistd.h>
#include <sys/wait.h>
#include <csignal>
using namespace std;

void sig_handle(int sig_num) {
    cout << "\nCtrl + c pressed! Exiting..." << endl;
    exit(sig_num);
}

int main() {
    signal(SIGINT, sig_handle);
    string s;
    while (true) {
        cout << "mini-shell:";
        cin >> s;
        if (s == "exit") break;

        if (fork() == 0) {
            execlp(s.c_str(), s.c_str(), NULL);
            exit(1);
        } else {
            wait(NULL);
        }
    }
}
```
**Mechanism:**  
- User input নেয়।  
- যদি `exit` → shell বন্ধ।  
- অন্য command হলে fork → exec দিয়ে চালায়।  
- Parent wait করে child শেষ হওয়া পর্যন্ত।  
- Ctrl+C চাপলে custom handler exit করবে।  

**Run:**  
```bash
g++ minishell.cpp -o minishell
./minishell
```
👉 তারপর command লিখো:  
- `ls` → directory list  
- `pwd` → current path  
- `exit` → shell বন্ধ  

**Output:**  
```
mini-shell: ls
...directory listing...
mini-shell: pwd
/home/user
mini-shell: exit
```

---

## 🔷 Threading  

### C++ Thread  
**Code:**  
```cpp
#include <iostream>
#include <thread>
using namespace std;

void func() {
    cout << "hello from a thread..." << endl;
}

int main() {
    thread t1(func);
    t1.join();
    cout << "Thread finished!" << endl;
}
```
**Mechanism:**  
- নতুন thread তৈরি হয় → `func()` চালায়।  
- `join()` → main thread অপেক্ষা করে child thread শেষ হওয়ার জন্য।  

**Run:**  
```bash
g++ thread_example.cpp -o thread_example -pthread
./thread_example
```  
**Output:**  
```
hello from a thread...
Thread finished!
```

---

### Python Thread  
**Code:**  
```python
import threading

def func():
    print("Hello from a thread!")

t1 = threading.Thread(target=func)
t1.start()
t1.join()

print("Thread finished!")
```
**Mechanism:**  
- Python এ নতুন thread তৈরি হয়।  
- `start()` → thread চালু হয়।  
- `join()` → main thread অপেক্ষা করে।  

**Run:**  
```bash
python3 thread_example.py
```  
**Output:**  
```
Hello from a thread!
Thread finished!
```

---
