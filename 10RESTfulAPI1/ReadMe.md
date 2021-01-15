## Lesson 10 - Design RESTful API 01

### Danh sách các API

| HTTP Method | URI                                         | Mô tả                                  |
|-------------|---------------------------------------------|----------------------------------------|
| GET         | http://localhost:8080/api/v1/tasks          | Lấy danh sách tất cả các task          |
| GET         | http://localhost:8080/api/v1/tasks/{taskID} | Lấy thông tin của một task theo taskID |
| POST        | http://localhost:8080/api/v1/tasks          | Tạo một task mới                       |
| PUT         | http://localhost:8080/api/v1/tasks          | Cập nhật một task                      |
| DELETE      | http://localhost:8080/api/v1/tasks/{taskID} | Xóa một task theo taskID               |

### Thiết kế RESTful API CRUD

[Source code](restful-api-crud)

### Sinh tài liệu cho RESTful API

[Source code](restful-api-documenting)

### Đánh version cho RESTful API

1. [URI versioning](restful-api-versioning1)
2. [Request parameter versioning](restful-api-versioning2)
3. [Custom request header versioning](restful-api-versioning3)
4. [Accept header versioning](restful-api-versioning4)

### HATEOAS

[Source code](restful-api-hateoas)
