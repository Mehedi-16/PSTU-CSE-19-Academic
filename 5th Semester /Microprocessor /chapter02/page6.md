একদম ঠিক আছে MD.! এবার আমি **8259 Interrupt Controller কীভাবে 8085-এর সাথে কাজ করে**, সেটা **একদম বিস্তারিতভাবে, উদাহরণসহ, ধাপে ধাপে** বুঝিয়ে দিচ্ছি — যেন তুমি একবারেই পরিষ্কারভাবে বুঝে ফেলো।

---

# 🧨 8259 Interrupt Controller + 8085 Microprocessor: বিস্তারিত ব্যাখ্যা

## 🔹 ১. 8259 কী?

👉 Intel 8259 হলো একটি **Programmable Interrupt Controller (PIC)**  
👉 এর কাজ: **বহু interrupt signal** (IR0–IR7) একসাথে নিতে পারা এবং **priority অনুযায়ী CPU-কে পাঠানো**

---

## 🔹 ২. কেন 8259 দরকার?

👉 8085-এর built-in interrupt মাত্র 5টি (TRAP, RST7.5, RST6.5, RST5.5, INTR)  
👉 কিন্তু অনেক সময় multiple external device থেকে interrupt আসে — যেমন:

- Keyboard
- Printer
- Timer
- Sensor

👉 তখন 8259 ব্যবহার করে **8টি external interrupt** handle করা যায় (IR0–IR7)

---

## 🔧 ৩. 8259 + 8085 Interrupt Handling Process (Step-by-step)

### ✅ ধাপ ১: Interrupt Signal আসে

- ধরো IR3 লাইনে interrupt এসেছে (8259-এর input)
- 8259 দেখে এটা **unmasked** এবং **priority অনুযায়ী** গ্রহণযোগ্য

---

### ✅ ধাপ ২: 8259 → INTR signal পাঠায়

- 8259 → `INTR` pin-এ HIGH signal পাঠায় 8085-কে
- মানে: “CPU, আমার কাছে জরুরি কাজ আছে!”

---

### ✅ ধাপ ৩: 8085 → INTA̅ signal পাঠায় (3 বার)

- 8085 interrupt গ্রহণ করে → `INTA̅` signal LOW করে
- এই signal 3 বার পাঠানো হয় → কারণ CALL instruction 3 byte হয়

| INTA̅ | 8259 কী দেয় |
|-------|-------------|
| 1st | CALL opcode (e.g. `CD`) |
| 2nd | Low byte of address (e.g. `30H`) |
| 3rd | High byte of address (e.g. `00H`) |

👉 CALL 0030H instruction তৈরি হয়

---

### ✅ ধাপ ৪: 8085 → Program Counter (PC) Stack-এ রাখে

- CPU আগের কাজের address (PC) stack-এ রাখে
- যাতে interrupt কাজ শেষে আবার আগের জায়গায় ফিরে যেতে পারে

---

### ✅ ধাপ ৫: CPU → CALL address-এ jump করে

- CALL 0030H → CPU jump করে `0030H` address-এ
- সেখানে ISR (Interrupt Service Routine) লেখা থাকে

---

### ✅ ধাপ ৬: ISR চালানো হয়

- ISR = Interrupt Service Routine  
👉 এখানে CPU সেই interrupt-এর জন্য নির্দিষ্ট কাজ করে

---

## 📘 উদাহরণ: Keyboard Interrupt

ধরো তুমি একটা keyboard device যুক্ত করেছো IR3 লাইনে।

### 🔹 কীভাবে কাজ হবে?

1. তুমি একটা key চাপলে → IR3 signal HIGH
2. 8259 → INTR পাঠায় 8085-কে
3. 8085 → INTA̅ পাঠায় 3 বার
4. 8259 → CALL 0030H instruction দেয়
5. 8085 → PC stack-এ রাখে → jump করে 0030H
6. ISR: CPU key data read করে → memory-তে store করে
7. ISR শেষে → RET instruction → আগের কাজ শুরু হয়

---

## 🧠 8259-এর ভিতরে কী থাকে?

| Block | কাজ |
|-------|-----|
| **Interrupt Request Register (IRR)** | কোন interrupt এসেছে তা ধরে |
| **Interrupt Mask Register (IMR)** | কোন interrupt বন্ধ করা হয়েছে |
| **In-Service Register (ISR)** | কোন interrupt এখন চলছে |
| **Priority Resolver** | কোন interrupt আগে service পাবে তা ঠিক করে |

---

## 🔄 সংক্ষেপে Flowchart:

```
External Device → IR Line → 8259
  ↓
Priority Check + Mask Check
  ↓
INTR → 8085
  ↓
INTA̅ × 3 → CALL opcode + address
  ↓
8085 → ISR execute
  ↓
RET → আগের কাজ শুরু
```

---

## ✅ মনে রাখার কৌশল:

| Signal | কাজ |
|--------|-----|
| **INTR** | 8259 → CPU-কে interrupt signal দেয় |
| **INTA̅** | CPU → interrupt acknowledge করে |
| **CALL Instruction** | CPU → ISR address-এ jump করে |
| **PC Stack** | আগের কাজের address ধরে রাখে |
| **ISR** | Interrupt-এর জন্য নির্দিষ্ট কাজ |
নিচে 8086 মাইক্রোপ্রসেসরের প্রধান বৈশিষ্ট্যগুলো সহজভাবে বাংলায় পয়েন্ট আকারে এবং উদাহরণসহ তুলে ধরা হলো:

---

### ✅ 8086 মাইক্রোপ্রসেসরের প্রধান বৈশিষ্ট্যসমূহ (Main Features of 8086):

1. **16-বিট প্রসেসর**
   ➤ ALU (Arithmetic Logic Unit) ও রেজিস্টারগুলো 16-বিট ডেটা একসাথে প্রসেস করতে পারে।
   🧠 *উদাহরণ:* 8086 একসাথে 16-বিট যোগ-বিয়োগ করতে পারে, যেমন: `1011001010101110 + 0001111010101010`।

2. **16-বিট ডেটা বাস**
   ➤ এটি একসাথে 16-বিট অথবা 8-বিট ডেটা মেমোরি বা পোর্ট থেকে পড়তে/লিখতে পারে।
   🧠 *উদাহরণ:* একবারে `A1B2` (16-bit) অথবা `A1` (8-bit) ডেটা নেয়া যায়।

3. **20-বিট অ্যাড্রেস বাস**
   ➤ 2²⁰ = 1MB পর্যন্ত মেমোরি অ্যাড্রেস করতে পারে।
   🧠 *উদাহরণ:* মেমোরির 0x00000 থেকে 0xFFFFF পর্যন্ত অ্যাড্রেস ব্যবহার করা যায়।

4. **ক্লক ফ্রিকোয়েন্সি**
   ➤ এর কাজ করার গতি 6 MHz থেকে 10 MHz এর মধ্যে।
   🧠 *উদাহরণ:* 6 MHz মানে প্রতি সেকেন্ডে ৬ মিলিয়ন সাইকেল চলে।

5. **Fixed-point arithmetic only**
   ➤ এটি ভগ্নাংশের হিসাব (floating-point) করতে পারে না।
   ➤ কিন্তু 8087 কপроসেসরের সাহায্যে ফ্লোটিং পয়েন্ট হিসাব করা সম্ভব।
   🧠 *উদাহরণ:* `5 + 3 = 8` করবে, কিন্তু `3.14 + 2.5` সরাসরি করতে পারবে না।

6. **Minimum ও Maximum Mode**
   ➤ Minimum mode = শুধুমাত্র 8086 প্রসেসর ব্যবহারের জন্য।
   ➤ Maximum mode = 8087 বা অন্যান্য প্রসেসরের সাথে একসাথে কাজ করার জন্য।
   🧠 *উদাহরণ:* একা চালালে Minimum, আর কপроসেসরের সাথে চালালে Maximum mode।

7. **Multiprocessor সাপোর্ট**
   ➤ একাধিক প্রসেসরের সাথে কাজ করতে পারে (8086 + 8087)।
   🧠 *উদাহরণ:* জটিল গাণিতিক কাজ ভাগ করে করতে পারে।

8. **Instruction Pre-fetching (Queue)**
   ➤ মেমোরি থেকে একসাথে ৬টা ইন্সট্রাকশন আগে থেকেই নিয়ে রাখে, যাতে কাজ দ্রুত হয়।
   🧠 *উদাহরণ:* রান্না শুরুর আগেই উপকরণ গুছিয়ে রাখা — এরকম।

9. **+5V পাওয়ার সাপ্লাই লাগে**
   ➤ সহজ পাওয়ার রিকোয়ারমেন্ট, তাই অনেক ডিভাইসে ব্যবহারযোগ্য।

10. **40-পিন Dual-Inline Package (DIP)**
    ➤ ফিজিক্যালি 40টা পিন থাকে, যেগুলো বিভিন্ন কাজে লাগে।
    🧠 *উদাহরণ:* ডেটা পাঠানো, মেমোরি অ্যাক্সেস, পাওয়ার— এসবের জন্য।

11. **BIU ও EU দুইটি প্রধান ইউনিট আছে**
    ➤ BIU (Bus Interface Unit) = ডেটা আনা-নেওয়া করে
    ➤ EU (Execution Unit) = গাণিতিক এবং লজিক অপারেশন করে
    🧠 *উদাহরণ:* একজন দোকানদার (EU) এবং একজন সহকারী (BIU), যিনি মাল আনে।



---

