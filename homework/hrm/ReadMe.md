## Lesson 12 - Design database logical anti-patterns

---

1. Hệ thống gồm 2 loại người dùng (user) là quản lý (manager) và nhân viên (staff).
--> Cần tránh Entity-Attribute-Value

2. Mỗi quản lý phụ trách một hoặc nhiều nhân viên.
--> Cần tránh Jaywalking

3. Hệ thống gồm nhiều phòng ban (department). Bên trong mỗi phòng ban lại có nhiều phòng ban con.
--> Cần tránh Naive Tree

4. Mỗi người dùng có một bộ kỹ năng (skill) riêng như "java", "js", …
--> Cần tránh Multi-column Attributes
