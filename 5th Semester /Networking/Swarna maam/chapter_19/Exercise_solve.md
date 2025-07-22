# 📘 DNS Chapter 19.15 – Practice Set Answers (English Questions & Answers with Bengali Explanation)

## ✅ 1. Determine FQDN or PQDN:

| Domain                | Type  | Explanation (বাংলায়)                          |
|------------------------|--------|-----------------------------------------------|
| a. xxx               | PQDN   | এটি একটি আংশিক নাম কারণ শেষে ডট (.) নেই।        |
| b. xxx.yyy.          | FQDN   | ডট (.) দিয়ে শেষ হওয়ায় এটি একটি সম্পূর্ণ নাম।     |
| c. xxx.yyy.net       | PQDN   | ডোমেইন সম্পূর্ণ নয়, শেষে ডট (.) নেই।            |
| d. zzz.yyy.xxx.edu.  | FQDN   | এটি একটি সম্পূর্ণ ডোমেইন নাম; শেষে ডট রয়েছে।     |

---

## ✅ 2. Determine FQDN or PQDN:

| Domain            | Type  | Explanation (বাংলায়)                                |
|-------------------|--------|-----------------------------------------------------|
| a. mil.          | FQDN  | শেষে ডট থাকায় এটি সম্পূর্ণ ডোমেইন নাম।                  |
| b. edu.          | PQDN  | এটি সাধারণ নাম, শেষ ডট নেই, তাই এটি PQDN।              |
| c. xxx.yyy.net   | PQDN  | সম্পূর্ণ নয়, এটি PQDN কারণ ডট দিয়ে শেষ হয়নি।            |
| d. zzz.yyy.xxx.edu | PQDN | শেষ ডট না থাকায় এটি একটি আংশিক PQDN।                  |

---

## ✅ 3. What is the flags field value (in hex) for a query requesting address and demanding recursion?  
**Answer:** `0x0100`  
**Explanation:** এটি standard query যেখানে recursion desired (RD) ফ্ল্যাগ সেট থাকে।

---

## ✅ 4. What is the flags field value (in hex) for an inverse response with recursion not available?  
**Answer:** `0x8580`  
**Explanation:** এটি একটি উত্তর বার্তা যেখানে নাম পাওয়া যায়নি (RCODE=3) এবং recursion ছিল না।

---

## ✅ 5. Analyze the flag `0x8F80`  
**Answer:** Response with AA, RD, RA set; no error (RCODE=0)  
**Explanation:** এটি একটি সফল authoritative উত্তর নির্দেশ করে।

---

## ✅ 6. Analyze the flag `0x0503`. Is it valid?  
**Answer:** No, it's invalid  
**Explanation:** এখানে QR=0 কিন্তু RCODE ≠ 0, যা বৈধ নয়।

---

## ✅ 7. Is the size of a question record fixed?  
**Answer:** No  
**Explanation:** প্রশ্নে থাকা ডোমেইন নামের দৈর্ঘ্য ভিন্ন হয়, তাই সাইজ নির্দিষ্ট নয়।

---

## ✅ 8. Is the size of a resource record fixed?  
**Answer:** No  
**Explanation:** রিসোর্স রেকর্ডের নাম ও ডেটা ভিন্ন হয়, তাই এর আকার পরিবর্তনশীল।

---

## ✅ 9. What is the size of a question record containing the domain name `fhda.edu`?  
**Answer:** Around 16 bytes  
**Explanation:** নামসহ অন্যান্য ফিল্ড যোগ করে আনুমানিক ১৬ বাইট হয়।

---

## ✅ 10. What is the size of a question record containing an IP address?  
**Answer:** Not applicable  
**Explanation:** প্রশ্ন রেকর্ডে IP address ব্যবহার হয় না, শুধুমাত্র নাম থাকে।

---

## ✅ 11. What is the size of a resource record containing `fhda.edu`?  
**Answer:** Around 28 bytes  
**Explanation:** নাম, টাইপ, ক্লাস, TTL ও RDATA মিলিয়ে প্রায় ২৮ বাইট হয়।

---

## ✅ 12. What is the size of a resource record containing an IP address?  
**Answer:** Around 28 bytes  
**Explanation:** IP RDATA হিসেবে ৪ বাইট, সঙ্গে অন্যান্য ফিল্ড যুক্ত হয়।

---

## ✅ 13. What is the size of a query message requesting the IP for `challenger.atc.fhda.edu`?  
**Answer:** Around 33 bytes  
**Explanation:** নাম বড় হওয়ায় মেসেজের আকার একটু বেশি হয়।

---

## ✅ 14. What is the size of a query requesting the domain name for `185.34.23.12`?  
**Answer:** Around 45 bytes  
**Explanation:** এটি একটি reverse DNS lookup, যেখানে নামটি বড় হয় (`in-addr.arpa`)।

---

## ✅ 15. What is the size of the response to query in 13?  
**Answer:** Around 65 bytes  
**Explanation:** প্রশ্নসহ উত্তর রিসোর্স রেকর্ড যোগ হয় বলে আকার বাড়ে।

---

## ✅ 16. What is the size of the response to query in 14?  
**Answer:** Around 75 bytes  
**Explanation:** PTR রেকর্ড সহ উত্তর দেয়ায় আকার বেশি হয়।

---

## ✅ 17. Redo Example 19.1 with one answer and one authoritative record  
**Answer:** ধন্যবাদ Mehedi! তুমি Example 19.1-এর query message চাচ্ছো **response message** হিসেবে পুনর্গঠন করতে, যেখানে থাকবে:

- ✅ **One Answer Record** → IP address for `chal.fhda.edu`  
- ✅ **One Authoritative Record** → NS record that defines `fhda.edu.` as the authoritative zone

চলো ধাপে ধাপে **response message** বানাই:

---

# 📘 Reconstructed Response Message for Example 19.1

---

## 🔹 1. Header Section (12 bytes)

| Field         | Value         | Meaning |
|---------------|---------------|---------|
| ID            | `0x1333`      | Same as query  
| Flags         | `0x8580`      | QR=1 (response), AA=1, RD=1, RA=1  
| QDCOUNT       | `0x0001`      | One question  
| ANCOUNT       | `0x0001`      | One answer  
| NSCOUNT       | `0x0001`      | One authoritative record  
| ARCOUNT       | `0x0000`      | No additional records

---

## 🔹 2. Question Section (same as query)

- QNAME = `chal.fhda.edu.` → label-encoded:  
  `04 63 68 61 6C` → `chal`  
  `04 66 68 64 61` → `fhda`  
  `03 65 64 75` → `edu`  
  `00` → end  
  → **13 bytes**

- QTYPE = `0x0001` (A record)  
- QCLASS = `0x0001` (IN)  
→ **Total = 13 + 2 + 2 = 17 bytes**

---

## 🔹 3. Answer Section (A Record for chal.fhda.edu)

| Field      | Value           | Size |
|------------|------------------|------|
| NAME       | `C00C` (pointer to QNAME) | 2  
| TYPE       | `0x0001` (A)     | 2  
| CLASS      | `0x0001` (IN)    | 2  
| TTL        | `0x00015180` (86400 sec) | 4  
| RDLENGTH   | `0x0004`         | 2  
| RDATA      | `0xC022170C` (IP: 192.34.23.12) | 4  
→ **Total = 16 bytes**

---

## 🔹 4. Authoritative Section (NS Record for fhda.edu)

| Field      | Value           | Size |
|------------|------------------|------|
| NAME       | `C011` (pointer to `fhda.edu`) | 2  
| TYPE       | `0x0002` (NS)    | 2  
| CLASS      | `0x0001` (IN)    | 2  
| TTL        | `0x00015180`     | 4  
| RDLENGTH   | `0x000F`         | 2  
| RDATA      | `06 ns1 04 fhda 03 edu 00` → `ns1.fhda.edu.` | 15  
→ **Total = 27 bytes**

---

## 🔹 5. Total Message Size

| Section         | Size |
|-----------------|------|
| Header          | 12  
| Question        | 17  
| Answer          | 16  
| Authoritative   | 27  
| **Total**       | **72 bytes**

---

## ✅ Final Response Summary

- **chal.fhda.edu → 192.34.23.12** (A record)  
- **fhda.edu → ns1.fhda.edu** (NS record)

---

---

## ✅ 18. Redo Exercise 17 and add address `153.18.9.0` for the authoritative server  
**Answer:** একদম ঠিক! তুমি এখন Example 19.1-এর query message-এর জন্য এমন একটি **response message** চাচ্ছো, যেখানে থাকবে:

---

## ✅ তিনটি Section:

1. **Answer Section** → chal.fhda.edu → A record  
2. **Authoritative Section** → fhda.edu → NS record → `ns1.fhda.edu.`  
3. **Additional Section** → `ns1.fhda.edu.` → A record → `153.18.9.0`

---

# 📘 Final Response Message Structure

---

## 🔹 1. Header (12 bytes)

| Field     | Value     | Meaning |
|-----------|-----------|---------|
| ID        | `0x1333`  | Same as query  
| Flags     | `0x8580`  | QR=1, AA=1, RD=1, RA=1  
| QDCOUNT   | `0x0001`  | One question  
| ANCOUNT   | `0x0001`  | One answer  
| NSCOUNT   | `0x0001`  | One authoritative record  
| ARCOUNT   | `0x0001`  | One additional record ✅

---

## 🔹 2. Question Section (chal.fhda.edu)

| Field     | Value     | Size |
|-----------|-----------|------|
| QNAME     | `chal.fhda.edu.` → 15 bytes  
| QTYPE     | `0x0001` (A) → 2 bytes  
| QCLASS    | `0x0001` (IN) → 2 bytes  
| **Total** |           | **19 bytes**

---

## 🔹 3. Answer Section

| Field     | Value               | Size |
|-----------|---------------------|------|
| NAME      | `C00C` (pointer to QNAME) → 2  
| TYPE      | `0x0001` (A) → 2  
| CLASS     | `0x0001` (IN) → 2  
| TTL       | `0x00015180` (86400 sec) → 4  
| RDLENGTH  | `0x0004` → 2  
| RDATA     | `0xC022170C` → IP: 192.34.23.12 → 4  
| **Total** |                     | **16 bytes**

---

## 🔹 4. Authoritative Section

| Field     | Value               | Size |
|-----------|---------------------|------|
| NAME      | `C011` (pointer to `fhda.edu`) → 2  
| TYPE      | `0x0002` (NS) → 2  
| CLASS     | `0x0001` (IN) → 2  
| TTL       | `0x00015180` → 4  
| RDLENGTH  | `0x000F` → 2  
| RDATA     | `06 ns1 04 fhda 03 edu 00` → `ns1.fhda.edu.` → 15  
| **Total** |                     | **27 bytes**

---

## 🔹 5. Additional Section

| Field     | Value               | Size |
|-----------|---------------------|------|
| NAME      | `C02A` (pointer to `ns1.fhda.edu`) → 2  
| TYPE      | `0x0001` (A) → 2  
| CLASS     | `0x0001` (IN) → 2  
| TTL       | `0x00015180` → 4  
| RDLENGTH  | `0x0004` → 2  
| RDATA     | `0x990C1200` → IP: 153.18.9.0 → 4  
| **Total** |                     | **16 bytes**

---

## 🔹 Total Message Size

| Section         | Size |
|-----------------|------|
| Header          | 12  
| Question        | 19  
| Answer          | 16  
| Authoritative   | 27  
| Additional      | 16  
| **Total**       | **90 bytes**

---

## ✅ Final Summary

| Section         | Content                          |
|-----------------|----------------------------------|
| **Answer**       | chal.fhda.edu → 192.34.23.12  
| **Authoritative**| fhda.edu → NS → ns1.fhda.edu  
| **Additional**   | ns1.fhda.edu → A → 153.18.9.0  

---

### 🧠 ব্যাখ্যা (বাংলায়, ২ লাইনে):

এই response message-এ chal.fhda.edu-এর IP দেওয়া হয়েছে, fhda.edu-এর NS server define করা হয়েছে, এবং সেই NS server-এর IP address (153.18.9.0) দেওয়া হয়েছে additional section-এ।

---

## ✅ 19. A DNS client queries for IP of `xxx.yyy.com`  
**Answer:** 
<img width="465" height="704" alt="Screenshot 2025-07-22 at 7 28 04 PM" src="https://github.com/user-attachments/assets/df3e11dd-6e88-44a2-bfc9-465cfb3c4d88" />
---

## ✅ 20. DNS server response with IP = `201.34.23.12`  
**Answer:** Response with A record in answer section  
<img width="724" height="235" alt="Screenshot 2025-07-22 at 7 33 11 PM" src="https://github.com/user-attachments/assets/4625ee4a-03fa-4994-a229-fcf5a81f7da3" />

---

## ✅ 21. DNS client queries for IPs of `xxx.yyy.com` and `aaa.bbb.edu`  
**Answer:** Query with QDCOUNT = 2  
**Explanation:** একাধিক প্রশ্ন একই মেসেজে পাঠানো হয়।

---

## ✅ 22. DNS response with IPs = `14.23.45.12` and `131.34.67.89`  
**Answer:** Two A records in answer section  
**Explanation:** প্রতিটি নামের জন্য আলাদা IP রেকর্ড থাকে।

---

## ✅ 23. DNS resolves only first name  
**Answer:** One A record, one Name Error  
**Explanation:** দ্বিতীয় নাম না পাওয়া গেলে RCODE=3 (Name error) হয়।

---

## ✅ 24. Query for name of IP `132.1.17.8`  
**Answer:** PTR query to `8.17.1.132.in-addr.arpa`  
**Explanation:** এটি reverse DNS query হয়, নাম খোঁজার জন্য।

---

## ✅ 25. Response to query 24  
**Answer:** PTR record with domain name  
**Explanation:** IP address কোন নামের সঙ্গে যুক্ত তা জানায়।

---

## ✅ 26. Encapsulate query message of 24 in UDP  
**Answer:** UDP header + DNS query  
**Explanation:** ৮ বাইটের UDP হেডারসহ DNS কোয়েরি পাঠানো হয়।

---

## ✅ 27. Encapsulate response of 25 in UDP  
**Answer:** UDP header + DNS response  
**Explanation:** DNS উত্তর UDP প্যাকেট হিসেবে পাঠানো হয়।

---

## ✅ 28. Compare DNS and UNIX directory structures  
**Answer:** Both are hierarchical  
**Explanation:** DNS ও UNIX উভয়ই গাছের মতো স্তরভিত্তিক গঠন অনুসরণ করে।

---

## ✅ 29. DNS dots equivalent in UNIX  
**Answer:** Slash (`/`)  
**Explanation:** DNS-এ dot (`.`) দ্বারা স্তর বিভাজন হয়, UNIX-এ হয় slash দিয়ে।

---

## ✅ 30. Do UNIX paths go from node to root?  
**Answer:** No, root to node  
**Explanation:** UNIX path রুট `/` থেকে নিচের দিকে যায়; DNS উল্টোভাবে।

---

## ✅ 31. FQDN = absolute path, PQDN = relative path?  
**Answer:** Yes  
**Explanation:** FQDN সম্পূর্ণ ঠিকানা বোঝায়, PQDN আংশিক বা আপেক্ষিক।

---

## ✅ 32. How to use `nslookup` in Windows?  
**Answer:** Open CMD → Type `nslookup`  
**Explanation:** এটি DNS নাম ও IP খোঁজার কমান্ড লাইন টুল।

---

## ✅ 33. All options of `nslookup`  
**Answer:** `set type`, `set timeout`, `set debug`, etc.  
**Explanation:** nslookup এ বিভিন্ন সেটিং পরিবর্তন করা যায়।

---

## ✅ 34. Try `nslookup` on a known domain  
**Command:** `nslookup www.google.com`  
**Explanation:** Google এর IP address দেখাবে।

---

## ✅ 35. Use `nslookup` on commercial servers  
**Command:**  
- `nslookup www.amazon.com`  
- `nslookup www.facebook.com`  
**Explanation:** এসব সার্ভারের IP address দেখতে পাওয়া যাবে।

---
