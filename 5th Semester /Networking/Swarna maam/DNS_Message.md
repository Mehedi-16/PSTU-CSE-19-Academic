

# 🌐 DNS Message Format – বিস্তারিত বিশ্লেষণ

DNS মেসেজ হলো DNS ক্লায়েন্ট ও সার্ভারের মধ্যে তথ্য আদান-প্রদানের জন্য নির্ধারিত একটি ফরম্যাট। এটি মূলত দুই ধরনের হয়:

- **Query Message**: ক্লায়েন্ট যখন DNS Resolver-এর কাছে কোনো ডোমেইনের IP address জানতে চায়
- **Response Message**: সার্ভার সেই অনুরোধের উত্তর দেয়, যেখানে IP address বা error code থাকে

---

## 📦 DNS Message Structure – ৫টি অংশ

প্রতিটি DNS মেসেজে থাকে নিচের ৫টি অংশ:

| Serial | Section Name         | Query Message | Response Message |
|--------|----------------------|---------------|------------------|
| 1️⃣     | Header               | ✅ থাকে        | ✅ থাকে           |
| 2️⃣     | Question Section     | ✅ থাকে        | ✅ থাকে           |
| 3️⃣     | Answer Section       | ❌ থাকে না     | ✅ থাকে           |
| 4️⃣     | Authority Section    | ❌ থাকে না     | ✅ থাকে           |
| 5️⃣     | Additional Section   | ❌ থাকে না     | ✅ থাকে           |

---

## 🧾 1. Header (12 bytes fixed)

### 🔹 Query Message Header

| Field           | Value Example | Description |
|----------------|---------------|-------------|
| Identification | 0x1234        | ক্লায়েন্ট ও সার্ভার মেসেজ মিলানোর জন্য |
| Flags           | QR=0, RD=1    | Query type, recursion চাওয়া হয়েছে |
| QDCOUNT         | 1             | ১টি প্রশ্ন আছে |
| ANCOUNT         | 0             | উত্তর নেই |
| NSCOUNT         | 0             | Authority info নেই |
| ARCOUNT         | 0             | অতিরিক্ত info নেই |

### 🔹 Response Message Header

| Field           | Value Example | Description |
|----------------|---------------|-------------|
| Identification | 0x1234        | ক্লায়েন্টের ID-এর সাথে মিল |
| Flags           | QR=1, RA=1, RCODE=0 | Response, recursion available, no error |
| QDCOUNT         | 1             | প্রশ্নের সংখ্যা |
| ANCOUNT         | 1             | ১টি উত্তর |
| NSCOUNT         | 1             | ১টি authority record |
| ARCOUNT         | 1             | ১টি additional record |

---

## 🎛️ Flags Field Breakdown

| Subfield | Bits | Query Value | Response Value | Description |
|----------|------|-------------|----------------|-------------|
| QR       | 1    | 0           | 1              | Query or Response |
| Opcode   | 4    | 0           | 0              | Standard Query |
| AA       | 1    | 0           | 1              | Authoritative Answer |
| TC       | 1    | 0           | 0              | Truncated Message |
| RD       | 1    | 1           | 1              | Recursion Desired |
| RA       | 1    | 0           | 1              | Recursion Available |
| Z        | 3    | 0           | 0              | Reserved |
| RCODE    | 4    | 0           | 0              | Response Code (0 = No Error) |

---

## ❓ 2. Question Section

| Field   | Example Value        | Description |
|---------|----------------------|-------------|
| QNAME   | `www.example.com`    | যে ডোমেইনের IP address চাওয়া হয়েছে |
| QTYPE   | `A`                  | IPv4 address |
| QCLASS  | `IN`                 | Internet class |

✅ Query ও Response Message—উভয়েই থাকে
---

## ❓ Question Section – Binary Format Breakdown

### 🔹 Structure Overview

```plaintext
+------------------------------+
| QNAME (variable length)      |
+------------------------------+
| QTYPE (2 bytes)              |
+------------------------------+
| QCLASS (2 bytes)             |
+------------------------------+
```

---

### 🔍 1. QNAME (Queried Domain Name)

- **Format**: Domain name is encoded as a sequence of labels
- **Each label**: 
  - 1 byte length prefix
  - Followed by label characters (ASCII)
- **Ends with**: 0x00 (null byte)

#### 🧠 Example: `www.example.com`

```plaintext
03 'w' 'w' 'w' 
07 'e' 'x' 'a' 'm' 'p' 'l' 'e' 
03 'c' 'o' 'm' 
00
```

- Total bytes: `1+3 + 1+7 + 1+3 + 1 = 17 bytes`

---

### 🔍 2. QTYPE (Record Type)

- **Size**: 2 bytes
- **Value for A record**: `0x0001`

| Record Type | Hex Value | Description |
|-------------|-----------|-------------|
| A           | `0x0001`  | IPv4 address |
| AAAA        | `0x001C`  | IPv6 address |
| MX          | `0x000F`  | Mail exchange |
| CNAME       | `0x0005`  | Canonical name |

---

### 🔍 3. QCLASS (Class)

- **Size**: 2 bytes
- **Value for Internet**: `0x0001`

| Class | Hex Value | Description |
|-------|-----------|-------------|
| IN    | `0x0001`  | Internet |
| CH    | `0x0003`  | Chaos |
| HS    | `0x0004`  | Hesiod |

---

## 🧾 Full Encoded Example (www.example.com, A, IN)

```plaintext
03 77 77 77 07 65 78 61 6D 70 6C 65 03 63 6F 6D 00
00 01
00 01
```

- **QNAME**: 17 bytes
- **QTYPE**: 2 bytes (`A`)
- **QCLASS**: 2 bytes (`IN`)
- **Total**: 21 bytes


---

---

## ✅ 3. Answer Section (Response Only)

| Field     | Example Value        | Description |
|-----------|----------------------|-------------|
| NAME      | `www.example.com`    | প্রশ্ন করা ডোমেইন |
| TYPE      | `A`                  | IPv4 address |
| CLASS     | `IN`                 | Internet |
| TTL       | `3600`               | Cache duration |
| RDLENGTH  | `4`                  | Data length |
| RDATA     | `93.184.216.34`      | Actual IP address |

❌ Query Message-এ থাকে না
---

---

## ✅ Resource Record (RR) Format Overview

```plaintext
+------------------------------+
| NAME (variable length)       | ← ডোমেইন নাম
+------------------------------+
| TYPE (2 bytes)               | ← রেকর্ড টাইপ (A, MX, etc.)
+------------------------------+
| CLASS (2 bytes)              | ← সাধারণত IN (Internet)
+------------------------------+
| TTL (4 bytes)                | ← Time to Live (সেকেন্ডে)
+------------------------------+
| RDLENGTH (2 bytes)           | ← RDATA-এর byte length
+------------------------------+
| RDATA (variable length)      | ← Actual data (যেমন IP address)
+------------------------------+
```

---

## 🔍 Field-by-Field ব্যাখ্যা

| Field      | Size     | Description |
|------------|----------|-------------|
| **NAME**   | Variable | ডোমেইন নাম (QNAME-এর মতো label-encoded) |
| **TYPE**   | 2 bytes  | রেকর্ড টাইপ (A = `0x0001`, MX = `0x000F`, etc.) |
| **CLASS**  | 2 bytes  | সাধারণত `IN` (Internet = `0x0001`) |
| **TTL**    | 4 bytes  | কতক্ষণ cache করা যাবে (seconds) |
| **RDLENGTH** | 2 bytes | RDATA-এর byte length |
| **RDATA**  | Variable | আসল তথ্য (যেমন IP address, NS name, MX preference + domain) |

---

## 🧾 উদাহরণ: A Record for `www.example.com`

| Field      | Value                  |
|------------|------------------------|
| NAME       | `www.example.com` → `03 77 77 77 07 65 78 61 6D 70 6C 65 03 63 6F 6D 00` |
| TYPE       | `00 01` (A record)     |
| CLASS      | `00 01` (IN)           |
| TTL        | `00 00 0E 10` (3600 sec) |
| RDLENGTH   | `00 04`                |
| RDATA      | `5D B8 D8 22` → `93.184.216.34` |

✅ মোট: NAME (17 bytes) + 2 + 2 + 4 + 2 + 4 = **31 bytes**

---

---

## 🛡️ 4. Authority Section (Response Only)

| Field     | Example Value        | Description |
|-----------|----------------------|-------------|
| NAME      | `example.com`        | Zone name |
| TYPE      | `NS`                 | Name server |
| CLASS     | `IN`                 | Internet |
| TTL       | `86400`              | Cache duration |
| RDLENGTH  | `16`                 | Length |
| RDATA     | `ns1.example.com`    | Authoritative NS info |

---

## ➕ 5. Additional Section (Response Only)

| Field     | Example Value        | Description |
|-----------|----------------------|-------------|
| NAME      | `ns1.example.com`    | Related domain |
| TYPE      | `A`                  | IPv4 address |
| CLASS     | `IN`                 | Internet |
| TTL       | `86400`              | Cache duration |
| RDLENGTH  | `4`                  | Length |
| RDATA     | `192.0.2.1`          | NS-এর IP address |

---

## 📊 DNS Message Flowchart (Query & Response)

```plantuml
@startuml
title DNS Message Structure

participant Client
participant DNS Server

Client -> DNS Server : Send Query Message
DNS Server -> Client : Send Response Message

note right of Client
Query Message:
- Header
- Question Section
end note

note left of DNS Server
Response Message:
- Header
- Question
- Answer
- Authority
- Additional
end note

@enduml
```

---
