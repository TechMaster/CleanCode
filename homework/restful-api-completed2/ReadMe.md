## Lesson 10 - Design RESTful API 01

Dựa trên nội dung của bài giảng, các bạn hãy thử xây dựng các RESTful API để quản lý các user.

Mỗi user bao gồm các thông tin: ID, name, email, password.

Mối quan hệ giữa user và task là One-to-Many.

| HTTP Method | URI                                               | Mô tả                                                  |
|-------------|---------------------------------------------------|--------------------------------------------------------|
| GET         | http://localhost:8080/api/v1/users                | Lấy danh sách tất cả các user                          |
| GET         | http://localhost:8080/api/v1/users/{userID}       | Lấy thông tin của một user theo userID                 |
| GET         | http://localhost:8080/api/v1/users/{userID}/tasks | Lấy danh sách tất cả các task của một user theo userID |
| POST        | http://localhost:8080/api/v1/users                | Tạo một user mới                                       |
| PUT         | http://localhost:8080/api/v1/users                | Cập nhật một user                                      |
| DELETE      | http://localhost:8080/api/v1/users/{userID}       | Xóa một user theo userID                               |
