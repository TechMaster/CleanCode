## Lesson 08 - Design Pattern 01

---

### Đề bài

User là một đối tượng có nhiều thuộc tính: ID (string), name (string), email (string), age (int), gender (Gender enum).
User được chia làm loại: Admin và Member.

Các bạn hãy sử dụng 3 design pattern đã học được để xây dựng một Spring singleton bean có vai trò làm cổng đăng ký user trong hệ thống. 
Client được chọn 1 trong 2 loại hình đăng ký: đăng ký Admin và đăng ký Member.

---

### Giải pháp

#### 1. Singleton pattern

Chúng ta sẽ khai báo [RegistrationService](src/main/java/registration/service/RegistrationService.java) là một singleton bean.

#### 2. Factory Method pattern

Do user được chia làm 2 loại Admin và Member:
- Chúng ta sẽ có 1 interface là [User](src/main/java/registration/model/User.java) với 2 implementation là:
  - [Admin](src/main/java/registration/model/Admin.java)
  - [Member](src/main/java/registration/model/Member.java)
- Chúng ta cũng thiết kế 1 class đóng vai trò [creator](src/main/java/registration/factory/UserFactory.java) để tạo mới các đối tượng `User`.

#### 3. Builder pattern

Mỗi đối tượng `User` sẽ có thuộc tính là `userInfo` để lưu trữ các thông tin ID, name, email, ...
Chúng ta sẽ sử dụng Builder pattern cho [UserInfo](src/main/java/registration/model/UserInfo.java).
