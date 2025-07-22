# TCP BOOK

---

**1. Determine FQDN or PQDN:**
a. xxx → PQDN
b. xxx.yyy. → FQDN
c. xxx.yyy.net → PQDN
d. zzz.yyy.xxx.edu. → FQDN
**ব্যাখ্যা:** FQDN-এর শেষে ডট (.) থাকে, PQDN-এ থাকে না।

---

**2. Determine FQDN or PQDN:**
a. mil. → FQDN
b. edu. → PQDN
c. xxx.yyy.net → PQDN
d. zzz.yyy.xxx.edu → PQDN
**ব্যাখ্যা:** শেষে ডট (.) না থাকলে তা PQDN; সম্পূর্ণ নাম সহ ডট থাকলে FQDN।

---

**3. Flags field value (hex) for query needing address + recursion:**
**Answer:** `0x0100`
**ব্যাখ্যা:** Standard query (0), recursion desired (RD = 1), বাকি সব 0।

---

**4. Flags field for inverse response, recursion requested but not available:**
**Answer:** `0x8580`
**ব্যাখ্যা:** Response = 1, Opcode = 0, AA = 0, TC = 0, RD = 1, RA = 0, RCODE = 3 (Name Error)।

---

**5. Analyze flag 0x8F80:**
**Answer:** Response, AA, RD, RA set; RCODE = 0
**ব্যাখ্যা:** এটি একটি authoritative successful response বোঝায়।

---

**6. Analyze flag 0x0503 – Is it valid?**
**Answer:** No
**ব্যাখ্যা:** Opcode 2 বোঝায় সার্ভার ফেইলর, কিন্তু AA, QR একসাথে false হওয়া ঠিক নয়।

---

**7. Is size of question record fixed?**
**Answer:** No
**ব্যাখ্যা:** প্রশ্নে থাকা নামের দৈর্ঘ্য ভিন্ন হতে পারে, তাই সাইজ ভিন্ন হয়।

---

**8. Is size of resource record fixed?**
**Answer:** No
**ব্যাখ্যা:** Resource record-এর নাম ও তথ্য ভিন্ন ভিন্ন হওয়ায় সাইজও পরিবর্তনশীল।

---

**9. Size of question record for domain name “fhda.edu”?**
**Answer:** 16 bytes
**ব্যাখ্যা:** নাম 9 bytes + 2 (type) + 2 (class) = 13; কিন্তু নামের compression হলে কমেও হতে পারে।

---

**10. Size of question record containing an IP address?**
**Answer:** Not applicable (Invalid)
**ব্যাখ্যা:** প্রশ্ন রেকর্ডে IP address থাকে না; এটি ডোমেইন নামের জন্য হয়।


---

**11. Size of a resource record containing the domain name fhda.edu?**
**Answer:** \~28 bytes
**ব্যাখ্যা:** নামের দৈর্ঘ্য (9 bytes), টাইপ (2), ক্লাস (2), TTL (4), RDLENGTH (2), RDATA (যেমন IP হলে 4)।

---

**12. Size of a resource record containing an IP address?**
**Answer:** \~28 bytes
**ব্যাখ্যা:** IP address RDATA হিসেবে 4 bytes হয়, বাকি অংশগুলোও যোগ হয়।

---

**13. Size of query message for challenger.atc.fhda.edu?**
**Answer:** \~33 bytes
**ব্যাখ্যা:** Header (12 bytes) + Name (22) + QTYPE (2) + QCLASS (2) = 38 (variable based on name length)।

---

**14. Size of query message requesting domain name for 185.34.23.12?**
**Answer:** \~45 bytes
**ব্যাখ্যা:** Reverse DNS query format (in-addr.arpa) ব্যবহার হয়, তাই নাম বড় হয়।

---

**15. Size of response to query 13:**
**Answer:** \~65 bytes
**ব্যাখ্যা:** Query (header + question) + answer section সহ resource record যুক্ত হয়।

---

**16. Size of response to query 14:**
**Answer:** \~75 bytes
**ব্যাখ্যা:** উত্তরসহ reverse lookup record যুক্ত হওয়ায় আকার বাড়ে।

---

**17. Redo Example 19.1 with one answer & one authoritative record**
**Answer:** Add authority section
**ব্যাখ্যা:** Answer section থাকবে IP সহ এবং authoritative section-এ থাকবে SOA বা NS record।

---

**18. Redo 17 and add record with IP 153.18.9.0**
**Answer:** Add extra section
**ব্যাখ্যা:** Additional section-এ authoritative server এর IP address (A record) দেওয়া হবে।

---

**19. Query message for xxx.yyy.com:**
**Answer:** Header + QNAME + QTYPE=A + QCLASS=IN
**ব্যাখ্যা:** স্ট্যান্ডার্ড DNS query ফরম্যাট অনুযায়ী তৈরি করতে হবে।

---

**20. Response message with IP = 201.34.23.12:**
**Answer:** Header + Question + Answer section with IP
**ব্যাখ্যা:** উত্তর অংশে xxx.yyy.com এর জন্য A record থাকবে।

---

**21. Query for xxx.yyy.com and aaa.bbb.edu:**
**Answer:** Single query message with QDCOUNT = 2
**ব্যাখ্যা:** দুটি প্রশ্ন একই মেসেজে পাঠানো যেতে পারে DNS প্রোটোকলে।

---

**22. Response to 21 with two IPs:**
**Answer:** Two answer records
**ব্যাখ্যা:** প্রতিটি ডোমেইনের জন্য আলাদা A record থাকবে উত্তর অংশে।

---

**23. Response: one resolved, one failed:**
**Answer:** One answer, one name error
**ব্যাখ্যা:** একটি ডোমেইনের জন্য A record, অন্যটির জন্য RCODE = 3 (name error) থাকবে।

---

**24. Query for name of IP 132.1.17.8:**
**Answer:** PTR query to 8.17.1.132.in-addr.arpa
**ব্যাখ্যা:** Reverse lookup DNS query হয় PTR টাইপ দিয়ে।

---

**25. Response to 24:**
**Answer:** PTR record with domain name
**ব্যাখ্যা:** উত্তর অংশে নাম যেমন: host.example.com থাকবে।

---

**26. Encapsulate query in UDP:**
**Answer:** UDP header + DNS query
**ব্যাখ্যা:** UDP header 8 bytes হয়, এরপর DNS query message যুক্ত হয়।

---

**27. Encapsulate response in UDP:**
**Answer:** UDP header + DNS response
**ব্যাখ্যা:** UDP segment response message সহ encapsulated হয়।

---

**28. Compare DNS with UNIX directory structure:**
**Answer:** Both are hierarchical
**ব্যাখ্যা:** DNS নাম যেমন রুট থেকে নিচে যায়, UNIX path ও তাই।

---

**29. Equivalent of dots in DNS to UNIX:**
**Answer:** Slashes (/)
**ব্যাখ্যা:** DNS-এ ‘.’ দ্বারা স্তর আলাদা হয়, UNIX-এ ‘/’ দিয়ে।

---

**30. Does UNIX pathname go from node to root?**
**Answer:** No, from root to node
**ব্যাখ্যা:** UNIX path শুরু হয় রুট (/) থেকে, DNS-এ উল্টো।

---

**31. Are FQDNs = absolute paths, PQDNs = relative paths?**
**Answer:** Yes
**ব্যাখ্যা:** FQDN পূর্ণ ঠিকানা বোঝায়, PQDN আপেক্ষিক নাম।

---

**32. How to use nslookup in Windows:**
**Answer:** Open cmd → type `nslookup`
**ব্যাখ্যা:** nslookup দিয়ে ডোমেইনের IP বা রেকর্ড দেখা যায়।

---

**33. All options of nslookup:**
**Answer:** set type, set timeout, set debug, etc.
**ব্যাখ্যা:** `nslookup –help` দিয়ে সব অপশন দেখা যায়।

---

**34. Try nslookup on a domain:**
**Answer:** `nslookup www.google.com`
**ব্যাখ্যা:** এটি Google এর IP address দেখাবে।

---

**35. Use nslookup for commercial servers:**
**Answer:** Example: `nslookup www.amazon.com`
**ব্যাখ্যা:** amazon, facebook ইত্যাদির জন্য nslookup ব্যবহার করে IP পাওয়া যায়।

---
