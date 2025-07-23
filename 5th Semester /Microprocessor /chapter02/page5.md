

## 🧠 What is an Interrupt?

👉 Interrupt হলো এমন একটা **signal**, যা CPU-কে বলে:  
“তুমি যেটা করছো, থামো — আগে এটা করো!”

CPU তখন:
1. বর্তমান instruction শেষ করে
2. Program Counter (PC) stack-এ রাখে
3. Interrupt address-এ চলে যায়

---

## 🔔 Types of Interrupts in 8085

| Interrupt | Maskable? | Trigger Type | Vector Address | Priority |
|-----------|-----------|--------------|----------------|----------|
| **TRAP** | ❌ No (Non-maskable) | Edge + Level | `0024H` | Highest |
| **RST 7.5** | ✅ Yes | Edge-triggered | `003CH` | High |
| **RST 6.5** | ✅ Yes | Level-sensitive | `0034H` | Medium |
| **RST 5.5** | ✅ Yes | Level-sensitive | `002CH` | Low |
| **INTR** | ✅ Yes | Level-sensitive | External (via INTA) | Lowest |

---

## 🔹 1. **TRAP Interrupt**

- **Non-maskable** → বন্ধ করা যায় না
- **Trigger** → Signal must be HIGH with a leading edge
- **Action**:
  - Current instruction শেষ করে
  - PC stack-এ রাখে
  - Branch করে `0024H` address-এ
- **Disable হয়** → Falling edge দিলে

---

## 🔹 2. **RST 7.5 Interrupt**

- **Maskable** → SIM instruction দিয়ে enable/disable করা যায়
- **Trigger** → Leading edge (edge-triggered)
- **Action**:
  - Current instruction শেষ করে
  - PC stack-এ রাখে
  - Branch করে `003CH` address-এ
- **Internal D flip-flop** → Interrupt মনে রাখে

---

## 🔹 3. **RST 6.5 Interrupt**

- **Maskable**
- **Trigger** → HIGH level sensitive
- **Action**:
  - Instruction শেষ করে
  - PC stack-এ রাখে
  - Branch করে `0034H` address-এ

---

## 🔹 4. **RST 5.5 Interrupt**

- **Maskable**
- **Trigger** → HIGH level sensitive
- **Action**:
  - Instruction শেষ করে
  - PC stack-এ রাখে
  - Branch করে `002CH` address-এ

---

## 🔹 5. **INTR Interrupt**

- **Maskable**
- **Trigger** → HIGH level sensitive
- **Action**:
  - Instruction শেষ করে
  - Sends **INTA** signal (Interrupt Acknowledge)
  - External hardware → Provides CALL instruction (RST0–RST7 or 3-byte CALL)
  - CPU executes that CALL

👉 INTR-এর জন্য **external interrupt controller (8259)** দরকার

---

## 🧭 External Interrupt Controller: **8259**

8259 কী করে?

1. জানে interrupt signal **edge-triggered না level-triggered**
2. জানে **call address**
3. জানে **mask করা interrupt কোনগুলো**
4. **Priority** ঠিক করে

👉 8259 → INTR signal পাঠায় → CPU → INTA signal দেয় → CALL instruction নেয়

---

## 🧮 RST Instructions & Vector Table

| RST | Hex Code | Address |
|-----|----------|---------|
| RST 0 | `C7` | `0000H` |
| RST 1 | `CF` | `0008H` |
| RST 2 | `D7` | `0010H` |
| RST 3 | `DF` | `0018H` |
| RST 4 | `E7` | `0020H` |
| RST 5 | `EF` | `0028H` |
| RST 6 | `F7` | `0030H` |
| RST 7 | `FF` | `0038H` |

👉 RST instruction = 1-byte CALL instruction  
👉 CPU jump করে নির্দিষ্ট address-এ

---

## ✅ মনে রাখার কৌশল:

- **TRAP** → Non-maskable, highest priority, `0024H`
- **RST 7.5** → Edge-triggered, `003CH`
- **RST 6.5** → Level-sensitive, `0034H`
- **RST 5.5** → Level-sensitive, `002CH`
- **INTR** → External CALL, lowest priority

---

🔜 তুমি চাইলে আমি এখন **Interrupt Flowchart**, **SIM Instruction Explanation**, বা **8259 Initialization Steps** বানিয়ে দিতে পারি।

তুমি কোনটা আগে চাও? 📘📊📐
