

---

## 🔹 Section 1: DNS Basics (15 Questions)

1. **DNS কী?**  
   → Domain Name System, যা ডোমেইন নামকে IP address-এ রূপান্তর করে।

2. **DNS কোন ধরনের প্রোটোকল?**  
   → Application layer protocol।

3. **DNS কোন রেকর্ড টাইপ ব্যবহার করে IP address জানাতে?**  
   → A record (IPv4), AAAA record (IPv6)।

4. **PTR রেকর্ড কী?**  
   → IP address থেকে domain name জানাতে ব্যবহৃত হয় (reverse lookup)।

5. **DNS message কতটি অংশে বিভক্ত?**  
   → ৫টি: Header, Question, Answer, Authority, Additional।

6. **DNS message-এর Header কত byte?**  
   → ১২ byte fixed।

7. **QNAME কী?**  
   → প্রশ্ন করা ডোমেইন নাম, label-encoded format-এ।

8. **QTYPE কী?**  
   → রেকর্ড টাইপ (A, MX, PTR, CNAME ইত্যাদি)।

9. **QCLASS কী?**  
   → সাধারণত IN (Internet)।

10. **DNS message-এর Flags field কত bit?**  
    → ১৬ bit।

11. **DNS কোন transport protocol ব্যবহার করে?**  
    → UDP (default), TCP (large messages)।

12. **DNS message-এর Question section কী কাজ করে?**  
    → Query information পাঠায়।

13. **DNS message-এর Answer section কী কাজ করে?**  
    → Query-এর উত্তর দেয়।

14. **DNS message-এর Authority section কী কাজ করে?**  
    → Zone-এর authoritative info দেয়।

15. **DNS message-এর Additional section কী কাজ করে?**  
    → Extra info যেমন NS-এর IP address দেয়।

---

## 🔹 Section 2: DNS Flags Field (15 Questions)

1. **QR bit কী বোঝায়?**  
   → 0 = Query, 1 = Response।

2. **Opcode field কত bit?**  
   → ৪ bit।

3. **AA bit কী?**  
   → Authoritative Answer।

4. **TC bit কী?**  
   → Truncated message (UDP limit 512 bytes)।

5. **RD bit কী?**  
   → Recursion Desired।

6. **RA bit কী?**  
   → Recursion Available।

7. **RCODE কী?**  
   → Response Code (0 = No error, 3 = Name Error)।

8. **Z field কী?**  
   → Reserved, সবসময় 0।

9. **DNS response message-এ RCODE = 3 কী বোঝায়?**  
   → Name Error (domain exists না)।

10. **AA bit = 1 হলে কী বোঝায়?**  
    → DNS server authoritative zone-এর জন্য উত্তর দিচ্ছে।

11. **TC bit = 1 হলে কী করতে হবে?**  
    → TCP ব্যবহার করে পুনরায় query পাঠাতে হবে।

12. **RD bit = 1 হলে কী বোঝায়?**  
    → Client recursion চায়।

13. **RA bit = 1 হলে কী বোঝায়?**  
    → Server recursion support করে।

14. **RCODE = 5 কী বোঝায়?**  
    → Refused (DNS server query accept করেনি)।

15. **Flags field-এর প্রথম ৪টি bit কী নির্দেশ করে?**  
    → Opcode (query type)।

---

## 🔹 Section 3: DNS Question Section (15 Questions)

1. **QNAME encode কিভাবে হয়?**  
   → প্রতিটি label-এর আগে ১ byte length, শেষে null byte।

2. **`www.example.com` encode করলে কী হয়?**  
   → `03 77 77 77 07 65 78 61 6D 70 6C 65 03 63 6F 6D 00`

3. **QTYPE = A এর hex value কী?**  
   → `00 01`

4. **QCLASS = IN এর hex value কী?**  
   → `00 01`

5. **DNS Question section-এর কাজ কী?**  
   → Query information পাঠানো।

6. **QNAME field কী নির্দেশ করে?**  
   → Query করা ডোমেইন নাম।

7. **QTYPE = PTR এর value কী?**  
   → `00 0C`

8. **QCLASS = CH এর value কী?**  
   → `00 03` (Chaos class)।

9. **DNS Question section-এর byte size কীভাবে নির্ধারণ করা হয়?**  
   → QNAME length + QTYPE (2 bytes) + QCLASS (2 bytes)।

10. **DNS Question section-এ কতটি প্রশ্ন থাকতে পারে?**  
    → Header-এর QDCOUNT অনুযায়ী।

11. **DNS Question section-এ recursion request কিভাবে বোঝানো হয়?**  
    → Header-এর RD bit = 1।

12. **DNS Question section-এ multiple questions support করে?**  
    → হ্যাঁ, তবে সাধারণত ১টি প্রশ্ন থাকে।

13. **DNS Question section-এ QNAME compression support করে?**  
    → না, compression শুধুমাত্র Answer section-এ।

14. **DNS Question section-এ QTYPE = MX কী নির্দেশ করে?**  
    → Mail exchange server।

15. **DNS Question section-এ QTYPE = AAAA কী নির্দেশ করে?**  
    → IPv6 address।

---

## 🔹 Section 4: DNS Answer Section (15 Questions)

1. **Answer section কবে থাকে?**  
   → Response message-এ।

2. **Answer section-এর ফিল্ডগুলো কী কী?**  
   → NAME, TYPE, CLASS, TTL, RDLENGTH, RDATA।

3. **RDATA কী?**  
   → Actual data (যেমন IP address)।

4. **TTL কী?**  
   → Time to Live, cache করার সময়।

5. **Answer section-এ compression pointer কীভাবে কাজ করে?**  
   → NAME field-এ আগের লেখা নামের offset দেখায়।

6. **Answer section-এ TYPE = CNAME কী নির্দেশ করে?**  
   → Canonical name।

7. **Answer section-এ TYPE = MX কী নির্দেশ করে?**  
   → Mail exchange server।

8. **Answer section-এ TYPE = NS কী নির্দেশ করে?**  
   → Name server।

9. **Answer section-এ TYPE = SOA কী নির্দেশ করে?**  
   → Start of Authority।

10. **Answer section-এ RDLENGTH কী নির্দেশ করে?**  
    → RDATA-এর byte size।

11. **Answer section-এ TTL = 0 হলে কী বোঝায়?**  
    → Response cache করা যাবে না।

12. **Answer section-এ RDATA = `192.168.1.1` কী নির্দেশ করে?**  
    → A record-এর IP address।

13. **Answer section-এ RDATA = `ftp.example.com` কী নির্দেশ করে?**  
    → PTR record-এর domain name।

14. **Answer section-এ RDATA = `mail.example.com` কী নির্দেশ করে?**  
    → MX record-এর mail server।

15. **Answer section-এ RDATA = `ns1.example.com` কী নির্দেশ করে?**  
    → NS record-এর name server।

---

---

## 🔹 Section 9: DNS Message Flow (15 Questions)

1. **DNS Query Message flow কীভাবে হয়?**  
   → Client → Resolver → DNS Server।

2. **DNS Response Message flow কীভাবে হয়?**  
   → DNS Server → Resolver → Client।

3. **Recursive query কী?**  
   → Resolver পুরো query সম্পন্ন করে উত্তর দেয়।

4. **Iterative query কী?**  
   → Resolver পরবর্তী DNS server-এর ঠিকানা দেয়।

5. **DNS Resolver কী?**  
   → Client-এর পক্ষে DNS query সম্পন্ন করে।

6. **Authoritative DNS Server কী?**  
   → Zone-specific তথ্য সরবরাহ করে।

7. **Caching DNS Resolver কী?**  
   → আগের query-এর উত্তর cache করে রাখে।

8. **DNS Query Message-এর Header কী নির্দেশ করে?**  
   → Query ID, Flags, এবং Question Count।

9. **DNS Response Message-এর Answer Section কী নির্দেশ করে?**  
   → Query-এর উত্তর।

10. **DNS Message flow-এ Additional Section-এর ভূমিকা কী?**  
    → Extra তথ্য যেমন NS-এর IP address সরবরাহ করে।

11. **DNS Message flow-এ Authority Section-এর ভূমিকা কী?**  
    → Authoritative zone-এর তথ্য সরবরাহ করে।

12. **DNS Message flow-এ Recursive Resolver কীভাবে কাজ করে?**  
    → Client-এর জন্য পুরো query সম্পন্ন করে।

13. **DNS Message flow-এ Iterative Resolver কীভাবে কাজ করে?**  
    → Client-কে পরবর্তী DNS server-এর ঠিকানা দেয়।

14. **DNS Message flow-এ Root DNS Server কী ভূমিকা পালন করে?**  
    → Top-level domain (TLD) server-এর ঠিকানা সরবরাহ করে।

15. **DNS Message flow-এ TLD Server কী ভূমিকা পালন করে?**  
    → Authoritative DNS server-এর ঠিকানা সরবরাহ করে।

---

## 🔹 Section 10: Miscellaneous (15 Questions)

1. **DNS message format কোন RFC-তে বর্ণিত?**  
   → RFC 1035।

2. **DNS কোন transport protocol ব্যবহার করে?**  
   → UDP (default), TCP (large messages)।

3. **DNSSEC কী?**  
   → DNS security extension, authenticity verify করে।

4. **MX record কী?**  
   → Mail exchange server-এর জন্য।

5. **CNAME record কী?**  
   → Canonical name → alias mapping।

6. **NS record কী?**  
   → Name server info দেয়।

7. **Additional section-এর কাজ কী?**  
   → Extra info যেমন NS-এর IP address।

8. **Authority section-এর কাজ কী?**  
   → Authoritative zone info দেয়।

9. **DNS over HTTPS (DoH) কী?**  
   → DNS query encrypted via HTTPS।

10. **DNS over TLS (DoT) কী?**  
    → DNS query encrypted via TLS।

11. **Recursive vs Iterative query পার্থক্য কী?**  
    → Recursive = full answer, Iterative = next server info।

12. **Authoritative DNS server কী?**  
    → Zone-এর জন্য final answer দেয়।

13. **Caching DNS resolver কী?**  
    → আগের query cache করে রাখে।

14. **DNS Query Message-এর QDCOUNT কী নির্দেশ করে?**  
    → Question count।

15. **DNS Response Message-এর ANCOUNT কী নির্দেশ করে?**  
    → Answer count।

---
---

## 🔹 Section 11: Byte-Level Analysis (15 Questions)

1. **DNS message-এর Header কত byte?**  
   → ১২ byte fixed।

2. **Byte 12-তে কী থাকে?**  
   → `03` → label `"www"` শুরু।

3. **Byte 13–15 কী বোঝায়?**  
   → `"www"` → `77 77 77`

4. **Byte 16–23 কী বোঝায়?**  
   → `"example"` → `65 78 61 6D 70 6C 65`

5. **Byte 24–27 কী বোঝায়?**  
   → `"com"` → `63 6F 6D`

6. **Byte 28 কী বোঝায়?**  
   → `00` → end of QNAME।

7. **QTYPE = A এর hex value কী?**  
   → `00 01`

8. **QCLASS = IN এর hex value কী?**  
   → `00 01`

9. **Compression pointer-এর প্রথম ২টি bit কী নির্দেশ করে?**  
   → এটি pointer কিনা।

10. **Compression pointer-এর offset কীভাবে গণনা করা হয়?**  
    → Remaining ১৪ bit।

11. **DNS message-এর Flags field কত bit?**  
    → ১৬ bit।

12. **DNS message-এর Opcode field কত bit?**  
    → ৪ bit।

13. **DNS message-এর QR bit কী নির্দেশ করে?**  
    → 0 = Query, 1 = Response।

14. **DNS message-এর TC bit = 1 হলে কী বোঝায়?**  
    → Message truncated হয়েছে।

15. **DNS message-এর RA bit = 1 হলে কী বোঝায়?**  
    → Server recursion support করে।

---

## 🔹 Section 12: Academic Application (15 Questions)

1. **DNS Compression pointer diagram কেমন হয়?**  
   → Arrow from pointer → original QNAME position।

2. **DNS message flowchart কী দেখায়?**  
   → Query → Server → Response → Client।

3. **Header field analysis কেন জরুরি?**  
   → Message type, recursion, error status বোঝাতে।

4. **PTR record analysis কোথায় দরকার হয়?**  
   → FTP, mail server, logging system-এ।

5. **Compression pointer bandwidth কিভাবে বাঁচায়?**  
   → Repeated name avoid করে, 17 byte → 2 byte।

6. **DNS message encoding rules কী?**  
   → Label encoding, compression pointer।

7. **DNS message debugging tools কী কী?**  
   → Wireshark, dig, nslookup।

8. **DNS message flow-এ latency কীভাবে কমানো যায়?**  
   → Caching resolver ব্যবহার করে।

9. **DNS message flow-এ security কীভাবে নিশ্চিত করা যায়?**  
   → DNSSEC, DoH, DoT।

10. **DNS message flow-এ error detection কীভাবে করা যায়?**  
    → RCODE analysis।

11. **DNS message flow-এ recursion enable করলে কী সুবিধা হয়?**  
    → Client-এর query সম্পন্ন হয়।

12. **DNS message flow-এ recursion disable করলে কী অসুবিধা হয়?**  
    → Client-কে iterative query করতে হয়।

13. **DNS message flow-এ caching resolver কীভাবে কাজ করে?**  
    → আগের query cache করে রাখে।

14. **DNS message flow-এ authoritative server কীভাবে কাজ করে?**  
    → Zone-specific তথ্য সরবরাহ করে।

15. **DNS message flow-এ iterative resolver কীভাবে কাজ করে?**  
    → Client-কে পরবর্তী DNS server-এর ঠিকানা দেয়।

---


