

# 📘 DNS Inverse Query – FTP Client Verification (Organized Academic Answer)

---

## 🧠 Scenario Overview

| Component        | Detail                                |
|------------------|----------------------------------------|
| FTP Server       | Receives packet from IP `153.2.7.9`    |
| Goal             | Verify if client is authorized         |
| Challenge        | Authorized list contains domain names only |
| Solution         | Use **reverse DNS lookup** to find domain name from IP |

---

## 🔍 Step 1: Constructing the Reverse DNS Name

| Step | Action                     | Result                         |
|------|----------------------------|--------------------------------|
| 1️⃣   | Start with IP: `153.2.7.9` |                                |
| 2️⃣   | Reverse octets            | `9.7.2.153`                    |
| 3️⃣   | Append `.in-addr.arpa`    | `9.7.2.153.in-addr.arpa`       |
| ✅   | Final QNAME                | Used in DNS query              |

---

## 📤 Step 2: DNS Query Message (PTR Request)

| Field           | Value                          | Description                     |
|----------------|----------------------------------|----------------------------------|
| Identification | `0x1234` (example)              | Unique query ID                 |
| Flags          | `0x0100`                        | Standard query                  |
| QDCOUNT        | `1`                             | One question                    |
| ANCOUNT        | `0`                             | No answers yet                  |
| NSCOUNT        | `0`                             | No authority records            |
| ARCOUNT        | `0`                             | No additional records           |

### 🔹 Question Section

| Field   | Value                          |
|---------|--------------------------------|
| QNAME   | `9.7.2.153.in-addr.arpa`       |
| QTYPE   | `PTR` (value = `12`)           |
| QCLASS  | `IN` (Internet = `1`)          |

✅ This query asks: “What domain name maps to IP `153.2.7.9`?”

---

## 📥 Step 3: DNS Response Message

| Field           | Value                          | Description                     |
|----------------|----------------------------------|----------------------------------|
| Identification | `0x1234`                        | Same as query                   |
| Flags          | `0x8180`                        | Standard response, no error     |
| QDCOUNT        | `1`                             | Echoed question                 |
| ANCOUNT        | `1`                             | One answer                      |
| NSCOUNT        | `0`                             | No authority records            |
| ARCOUNT        | `0`                             | No additional records           |

### 🔹 Answer Section

| Field     | Value                          |
|-----------|--------------------------------|
| NAME      | `9.7.2.153.in-addr.arpa`       |
| TYPE      | `PTR`                          |
| CLASS     | `IN`                           |
| TTL       | `86400` (example)              |
| RDLENGTH  | `17` (example)                 |
| RDATA     | `ftp.example.com`              |

✅ This tells the FTP server: “The IP `153.2.7.9` maps to domain `ftp.example.com`”

---

## ✅ Step 4: Final Verification

| Action                        | Result                          |
|-------------------------------|----------------------------------|
| FTP server compares `ftp.example.com` with authorized list | If matched → client is authorized |
| If not matched                | Connection may be rejected       |

---

## 📘 Academic Notes

| Topic             | Detail |
|-------------------|--------|
| Reverse DNS Zone  | `in-addr.arpa` |
| Record Type       | `PTR` |
| Used For          | Logging, authentication, access control |
| IPv6 Equivalent   | `ip6.arpa` |

---

## 🧠 Summary Flow

```plaintext
IP Address → Reverse → PTR Query → DNS Server → Domain Name → Authorization Check
```

---
