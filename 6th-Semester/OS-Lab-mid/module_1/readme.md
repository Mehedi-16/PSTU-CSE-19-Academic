ঠ
# 🍎 macOS Terminal Commands (Linux style)

## 🔷 Display information about files in the current directory

```
ls
ls -lah
```

---

## 🔷 Create a directory with your own student name; inside it, create a file. Then copy it to home directory

```
mkdir sharafat
cd sharafat
touch test.txt

cp test.txt ~/
```

---

## 🔷 Navigate between different folders

```
cd
cd ..
cd folder_name
cd ~/Desktop
```

---

## 🔷 Remove empty directories

```
find . -type d -empty -delete
```

👉 (⚠️ `-delete` dangerous — careful)

---

## 🔷 File copy / cut & paste operations

```
cp source destination
mv source destination
```

Example:

```
cp test.txt ~/Desktop/
mv test.txt ~/Documents/
```

---

## 🔷 Download files from the internet

### Default (Mac এ wget নাই)

```
curl -O URL
```

### If you install wget (brew দিয়ে)

```
brew install wget
wget URL
```

### aria2 (optional)

```
brew install aria2
aria2c URL
```

---

## 🔷 Display current user name

```
whoami
echo $USER
```

---

## 🔷 View calendar

```
cal
cal 8 2002
```

---

## 🔷 Check system details

```
system_profiler
uname -a
top
```

### Optional (Linux style tools via brew)

```
brew install neofetch
neofetch

brew install fastfetch
fastfetch
```

---

## 🔷 CPU & disk info

```
sysctl -n machdep.cpu.brand_string
diskutil list
```

---

## 🔷 Count lines, words, characters in file

```
wc filename
wc -l filename
wc -c filename
wc --help
```

---

# 🍎 macOS Terminal – Complete C/C++ Workflow + Commands

## 🔷 1. Create a C++ file

```bash
touch abc.cpp
```

---

## 🔷 2. Open & write code using nano

```bash
nano abc.cpp
```

👉 Example code লিখো:

```cpp
#include <iostream>
using namespace std;

int main() {
    cout << "Hello World";
    return 0;
}
```

👉 Save:

* `CTRL + O` → Enter
* `CTRL + X`

---

## 🔷 3. Compile the program

```bash
g++ abc.cpp
```

👉 Output file automatically create হবে:

```
a.out
```

---

## 🔷 4. Run the program

```bash
./a.out
```

---

# 🔷 Basic Terminal Commands (Full Set)

## (i) Show home directory

```bash
echo $HOME
```

---

## (ii) List files

```bash
ls
ls -lah
```

---

## (iii) Change directory

```bash
cd
cd ..
cd folder_name
```

---

## (iv) Create directory

```bash
mkdir myFolder
```

---

## (v) Delete file/directory

```bash
rm file.txt
rm -r myFolder
```

---

## (vi) Create file

```bash
touch file.txt
```

---

## (vii) Help/manual

```bash
man ls
```

---

## (viii) Make file executable

```bash
chmod +x a.out
```

---

## (ix) Move / rename file

```bash
mv file.txt Documents/
mv oldname.txt newname.txt
```

---

## (x) Search file

```bash
find . -name "abc.cpp"
```

---

## (xi) Check internet/server

```bash
ping 8.8.8.8
ping -c 5 google.com
```

---

## (xii) Redirect output to file

```bash
ping -c 5 google.com > output.txt
```

---
---

---

# 🍎 Mid Term Examination: July–December 2021 (macOS Version)

## 🔷 Installation of Linux with Virtual Machine [01]

👉 (Mac এ সাধারণত use হয়:)

* UTM / VirtualBox / VMware Fusion
* ISO file দিয়ে Linux install

---

## 🔷 Running a C/C++ Program in macOS [02]

```bash
g++ input.cpp
./a.out
```

---

## 🔷 Running a Java Program in macOS [02]

```bash
javac Main.java
java Main
```

---

# 🔷 4. System Administration & Navigation Commands [10]

## 🔹 List home directory, navigate folders, create/delete files

```bash
ls ~
cd
cd ..
mkdir myFolder
rm file.txt
rm -r myFolder
touch file.txt
```

---

## 🔹 Check disk space in partitions

```bash
df -h
diskutil list
```

👉 (`lsblk` Linux specific, Mac এ `diskutil` use হয়)

---

## 🔹 Run commands with root privileges (sudo)

```bash
sudo command
```

---

## 🔹 Compress files into a .zip archive

```bash
zip compressed.zip file1 file2
```

👉 যদি `zip` না থাকে:

```bash
brew install zip
```

---

## 🔹 Check disk usage of a specific file

```bash
du -h compressed.zip
```

---

## 🔹 Check network connection

```bash
ping sharafat.xyz
ping -c 5 google.com
```

---
---

# 🍎 9. Linux Customization & Management [05] (macOS Version)

## 🔷 Tasks

---

## 🔹 Change wallpaper (macOS via command line)

```bash
osascript -e 'tell application "Finder" to set desktop picture to POSIX file "/path/to/image.jpg"'
```

👉 screensaver change:

```bash
open /System/Library/PreferencePanes/DesktopScreenEffectsPref.prefPane
```

---

## 🔹 Create directory, file & copy to home folder

```bash
mkdir sharafat
cd sharafat
touch test.txt

cp test.txt ~/
```

👉 or new folder এ copy:

```bash
mkdir ~/test
cp test.txt ~/test/
```

---

## 🔹 Create disk partitions

```bash
diskutil list
```

👉 partition create (⚠️ careful):

```bash
diskutil partitionDisk /dev/diskX 2 APFS NewVolume 50%
```

---

## 🔹 Install and configure a printer

```bash
lpstat -p
lpoptions -d printer_name
```

👉 GUI open করার জন্য:

```bash
open /System/Library/PreferencePanes/PrintAndScan.prefPane
```

---

## 🔹 File copy, cut & paste operations

```bash
cp source destination
mv source destination
```

👉 Example:

```bash
cp test.txt ~/Desktop/
mv test.txt ~/Documents/
```

---
