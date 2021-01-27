# Bài tập tổng hợp cho lớp Clean Code
## Quy cách nộp bài tập:
1. Sinh viên tạo git repo của riêng mình
2. Lập trình bằng ngôn ngữ Java, sử dụng Spring Boot framework
3. Tạo file ReadMe.md định dạng Markdown rồi trả lời trực tiếp vào câu hỏi trong file này. Phần lý thuyết có viết tự luận và trả lời trắc nghiệm chọn 1 đáp án trong 4 lựa chọn. [Xem mẫu file này](HomeWork.md)
4. Tập trung code vào các thư mục như sau
   ```
   .
   ├── phan1 <-- Mã nguồn lập trình phần 1
   ├── phan2 <-- Mã nguồn lập trình phần 2
   ├── phan3
   ├── phan4
   ├── phan5
   └── ReadMe.md <-- Viết tự luận, trả lời câu hỏi trắc nghiệm
   ```


Có một số phần yêu cầu lập trình Java. Các bạn nên sử dụng Spring Boot. Tham khảo một số tutorial và code lập trình Spring Boot
- [Spring Boot căn bản](https://github.com/TechMaster/SpringBootBasic/tree/main/basic)
- [3 phương pháp Depency Injection](https://github.com/TechMaster/SpringBootBasic/tree/main/bean/05DifferentWaysDI/demobean)
- [Lập trình CRUD không dùng cơ sở quan hệ](https://github.com/TechMaster/SpringBootBasic/tree/main/crud)
- [Lập trình JPA - ORM kết nối CSDL](https://github.com/TechMaster/SpringBootBasic/tree/main/jpa)
- [Hướng dẫn sử dụng Markdown](https://viblo.asia/helps/cach-su-dung-markdown-bxjvZYnwkJZ)

## Phần 1: Clean Code căn bản

1. Hãy tham khảo slide [CleanCode.pdf](../03Basic/CleanCode.pdf) tóm tắt 5 mục tiêu chính của Clean Code.
2. Trong một công ty X, có ba nhóm phần mềm, làm cùng công nghệ, số lượng thành viên cũng như kinh nghiệm tương đương nhau. Cả ba đều muốn áp dụng Clean Code vào dự án của mình và có 3 cách tiếp cận khác nhau.
   - Team A: Ưu tiên tiến độ dự án trước, deliver được phiên bản đầu tiên, thì mới cho thành viên tham khảo Clean Code rồi áp dụng, refactor code ở phiên bản kế tiếp
   - Team B: Clean Code là cực kỳ quan trọng, do đó dành hẳn 30% thời gian của toàn bộ dự án để đào tạo Clean Code cho thành viên sau đó mới bắt đầu lập trình
   - Team C: Áp dụng Clean Code là một quá trình. Quy tắc nào dễ hiểu, dễ nhớ thì áp dụng trước. Những kỹ thuật phức tạp sẽ học và áp dụng trong tình huống phù hợp. Cân bằng giữa tiến độ và clean code.

Nếu bạn là team lead bạn sẽ chọn phương án nào? Giải thích tại sao?

3. Bạn là một team lead, khi bạn giới thiệu các quy tắc Clean Code cho các đồng đội trẻ. Có một số bạn cho rằng Clean Code chỉ làm phức tạp thêm vấn đề, và chậm lại hiệu suất làm việc của nhóm. Bạn sẽ trả lời họ thế nào?

4. Bob, Alice, Toàn, Vân được sếp giao cho viết một hàm tính lương tăng theo năm làm việc. Năm đầu tiên nhân viên sẽ nhận mức lương kiểu integer là ```initialSalary```, cứ tròn 12 tháng, nhân viên được tăng lương bằng cách nhân với hệ số ```raise > 1.0``` được cài đặt sẵn. Công thức là ```Salary at Nth year = initialSalary * (1 + raise)^N```
N = 0, năm đầu tiên
N = 1, năm thứ 2
...

```java
public class Salary {
   float raise; //Hệ số tăng lương
   // Tiếp theo là phương thức tính lương theo thâm niên
}
```
Đây là tên phương thức do họ đề xuất;

Đề xuất của Bob
```java
int calculateSalaryAfterYears(int years, float raise);
```

Đề xuất của Alice
```java
int salaryAfterYears(Date joinedData, Date today, int initialSalary, float raise);
```

Đề xuất của Toàn
```java
int tinhLuongNamThuN(int namThuN, int luongNamDauTien, float heSoTangLuong);
```

Đề xuất của Vân
```float raise``` là thuộc tính trong ```class Salary``` rồi.
```java
int calculateSalaryAfterYears(int initialSalary, int NthYear);
```

Trong 4 đề xuất trên đề xuất nào là phù hợp với quy ước trong CleanCode?

5. Hãy lập trình mô hình hoá nghiệp vụ sau đây. Cụ thể là hãy bổ xung các method để hoàn thiện logic. Quan trọng hãy tuân thủ quy tắc Clean Code.
- 1 User có thể viết nhiều bài Post, hoặc xoá
- 1 User có thể viết Comment cho bài Post của người khác và chính mình. User có thể xoá comment của chính mình

```Java
public class User {
   private long id;
   private String fullName;
   private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
   private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !

   void writePost(Post post) { //ví dụ mẫu một phương thức nhé
      //Bổ xung logic vào đây
   }

   void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception

   }
}

public class Post {
   private long id;
   private String title;
   private String content;
   private User author; //Tác giả của bài viết
   private ArrayList<Comment> comments; //Một post chứa nhiều Comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó ! 
}

private class Comment{
   private long id;
   private String title;
   private Post post; //Bài viết mà comment gắn vào
   private User author; //Tác giả của comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !
}
```
## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
   ![](../05OOP/jungle/src/main/java/graphiceditor/after/interface.jpg)

### 2. Composition over Inheritance và DI
**Bài tập không bắt buộc, sinh viên làm sẽ được cộng điểm**

Vinfast vừa ra mắt mẫu xe VF33. [Xem chi tiết ở đây](https://vingroup.net/tin-tuc-su-kien/bai-viet/2288/vinfast-ra-mat-3-dong-o-to-dien-tu-lai-khang-dinh-tam-nhin-tro-thanh-hang-xe-dien-thong-minh-toan-cau)
Xe VF33 dùng chung một hệ thống khung sườn, hệ thống điều khiển tự lái thông minh nhưng có thể có tuỳ chọn động cơ xăng hoặc điện tại thời điểm lắp ráp (constructor dependency injection).

Bạn là kỹ sư phần mềm mô phỏng, hãy viết code Java để mô phỏng xe VF33 có những đặc điểm nếu trên. Trước khi viết [hãy tham khảo code này](../SOLID/DependencyInjection/05DifferentWaysDI/demobean)

Nếu bạn hỏi tôi nên viết như thế nào? Tôi sẽ trả lời lập trình là một công việc sáng tạo. Nhưng làm sao sáng tạo của bạn, đồng nghiệp hiểu được, dùng được và cùng tham gia code. Vậy bạn hãy lập trình để làm sao tôi (đồng nghiệp code của bạn) hiểu được code của bạn. Đừng phức tạp hoá vấn đề quá, nội dung method đôi khi chỉ cần dùng ```System.out.println("Some text here");```. Ngoài ra bạn hãy tạo dự án Spring Boot để tận dụng các annotation như ```@Autowired```, ```@Value```, ```@Configuration``` để thực hiện kỹ thuật Dependency Injection.

## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả
### Mô tả bài toán

Giả sử các bạn đang cần xây dựng một hệ thống phần mềm để quản lý khóa học cho một cơ sở giáo dục (Course Management) với các đặc tả sau:

1. Hệ thống gồm 2 loại người dùng (user): giảng viên (teacher) và học viên (student).
- Thông tin chung của người dùng bao gồm: ID, họ tên (name), email, mật khẩu (password).
- Thông tin của giảng viên bao gồm: các thông tin chung và số điện thoại (phone), số năm kinh nghiệm (experiences).
- Thông tin của học viên gồm: các thông tin chung và niên khóa (year).
2. Nội dung giảng dạy được chia làm các khóa học (course). Mỗi một khóa học do một giảng viên phụ trách.
- Thông tin của mỗi khóa học bao gồm: tên khóa học (name), mô tả (description), địa điểm tổ chức (location), thời điểm bắt đầu (opened).
3. Học viên muốn tham gia một khóa học thì cần tiến hành ghi danh (enroll). Một học viên có thể ghi danh nhiều khóa học.

### Yêu cầu của bài tập

Các bạn hãy xác định các thực thể tham gia trong phần mềm và thiết kế cơ sở dữ liệu cho phần mềm:
- Tránh sử dụng các anti-pattern đã được tìm hiểu trong buổi 12.
- Đưa ra một Lược đồ quan hệ thực thể (ERD) để biểu diễn thông tin và mối quan hệ giữa các thực thể.

## Phần 4: Thiết kế RESTful API 1
### Yêu cầu của bài tập

Các bạn hãy thiết kế một RESTful API cho phép client đăng ký người dùng (cả giảng viên và học viên): 

*Request:*

Đăng ký giảng viên:

```json
{
    "name": "Nguyen Van A",
    "email": "a.nguyen@gmali.com",
    "password": "123456",
    "teacher": {
        "phone": "0987654321",
        "experiences": 5
    },
    "mode": "TEACHER"
}
```

Đăng ký học viên:

```json
{
    "name": "Tran Van B",
    "email": "b.tran@gmali.com",
    "password": "123456",
    "student": {
        "year": 2020
    },
    "mode": "STUDENT"
}
```

*Response khi đăng ký thành công:* 

HTTP status code: 200

```json
{
    "name": "Tran Van B",
    "email": "b.tran@gmali.com"
}
```

hoặc

```json
{
    "name": "Tran Van B",
    "email": "b.tran@gmali.com",
    "password": "******"
}
```

Các yêu cầu:
1. Tạo các entity User, Teacher, Student và sử dụng annotation @Inheritance của Hibernate/Spring Data JPA để mapping quan hệ kế thừa giữa Teacher và Student với User.
2. Sử dụng Factory Method pattern để khởi tạo đối tượng phù hợp với request.
3. Endpoint của API cần phải phù hợp với các convention đã được học và được đánh version.
4. Response của API cần ẩn trường password hoặc convert thành `******`.
4. Tích hợp Swagger để sinh tài liệu cho API.
5. Cần kiểm tra email đã được đăng ký bởi người dùng khác hay chưa. 
- Throw exception và có cơ chế error handling thích hợp.
- Error message trong response body cần rõ ràng, cung cấp các thông tin cần thiết để xác định nguyên nhân lỗi, không chứa thông tin password.
- HTTP status code phù hợp.
6. Cho phép log request body của API nhưng email và password cần được convert thành `******`.

## Phần 5: Thiết kế RESTful API 2
### Yêu cầu của bài tập

Dựa trên mã nguồn ở bài tập 2, các bạn hãy thiết kế một RESTful API cho phép client tìm kiếm khóa học với:

*Request:*
 
`/api/v1/courses?keyword=Spring&sortBy=name`

Trong đó:
- keyword (không required): là từ khóa để tìm kiếm khóa học theo tên của khóa học.
- sortBy (không required): có 2 giá trị là name (sắp xếp theo thứ tự tăng dần của tên khóa học) và opened (sắp xếp theo thứ tự giảm dần của thời điểm bắt đầu khóa học).

*Response:*

HTTP status code: 200

```json
[
    {
        "id": 3,
        "name": "Spring Boot Fundamental",
        "location": "Hanoi CS1",
        "teacherName": "Vu Van B"
    },
    {
        "id": 2,
        "name": "Spring Boot Microservice",
        "location": "Hanoi CS1",
        "teacherName": "Vu Van B"
    }
]
```

Các yêu cầu:
1. Tạo entity Course và sử dụng annotation @ManyToOne của Hibernate/Spring Data JPA để mapping quan hệ giữa Course và Teacher.
2. Sử dụng Strategy pattern để cài đặt các thuật toán sắp xếp.
3. RESTful API endpoint cần phải phù hợp với các convention đã được học và được đánh version.
4. Áp dụng caching cho API để tăng performance.
5. Đảm bảo các chức năng của bài tập 2 vẫn hoạt động đúng.

## Trắc nghiệm
1. Điều nào không đúng khi nói về Design Pattern?
   ```
   A. Là tập hợp các giải pháp có thể tái sử dụng cho các vấn đề thường xảy ra trong thiết kế phần mềm.
   B. Được xây dựng dựa trên kiến thức và kinh nghiệm của các nhà chuyên gia phát triển phần mềm.
   C. Đã được thiết kế và cài đặt ở mức chi tiết.
   C. Giúp tăng tính gắn kết (high cohesion) và giảm sự phụ thuộc (low coupling) giữa các thành phần trong phần mềm.
   ```
---

2. Các OOP Design Pattern được chia làm mấy nhóm?
   ```
   A. 2
   B. 3
   C. 4
   D. 5
   ```
---

3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
   ```
   A. Quan tâm đến cách các lớp và các đối tượng được tổ chức để trở thành một cấu trúc lớn hơn.
   B. Cung cấp các cơ chế khởi tạo đối tượng khác nhau, làm tăng tính linh hoạt và tái sử dụng code.
   C. Là các giải pháp để triển khai cho các hệ thống Microservice.
   D. Quan tâm đến cách giao tiếp giữa các lớp và các đối tượng.
   ```
---

4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
   ```
   A. Builder
   B. Singleton
   C. Factory Method
   D. Strategy
   ```
---

5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
   ```
   A. Có
   B. Không
   C. Một số trường hợp thì có, một số trường hợp thì không
   ```
---

6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
   ```
   A. Mutable
   B. Immutable
   ```

---

7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
   ```
   A. Không
   B. Có
   ```
---

8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
   ```
   A. Dữ liệu không thay đổi theo context
   B. Dữ liệu thay đổi theo context
   C. Cả A và B
   ```
---

9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay đổi tất cả các thuật toán?
   ```
   A. Strategy
   B. Template Method
   C. Flyweight
   D. Builder
   ```
---

10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?
   ```
      A. Strategy
      B. Factory method
      C. Singleton
      D. Flyweight
   ```
---

11. REST là gì?
   ```
      A. Ngôn ngữ lập trình
      B. Kiểu kiến trúc phần mềm
      C. Giao thức
      D. Không đáp án nào chính xác
   ```

---

12. Đâu không phải là đặc điểm của một hệ thống RESTful?
   ```
      A. Client và server có thể xây dựng và phát triển một cách độc lập mà không ảnh hưởng đến nhau.
      B. Response của server có thể được lưu trong bộ nhớ cache để tăng hiệu năng.
      C. Server lưu trữ session và history của client.
      D. Hệ thống có thể chia thể chia thành nhiều layer.
   ```
---

13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?
   ```
      A. PUT
      B. POST
      C. PATCH
      D. DELETE
   ```
---

14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?
   ```
      A. GET
      B. POST
      C. PUT
      D. B và C
   ```
---

15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?
   ```
      A. Phân trang
      B. Sắp xếp
      C. Lọc
      D. Cả 3 đáp án trên
   ```
---

16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?
   ```
      A. Service
      B. Repository
      C. Controller
   ```
---

17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?
   ```
      A. 1
      B. 2
      C. 3
      D. 4
   ```
---

18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?
   ```
      A. Sử dụng @ControllerAdvice và @ExceptionHandler
      B. Chỉ sử dụng @ExceptionHandler
      C. Throw ResponseStatusException
   ```
---

19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?
   ```
      A. INFO
      B. DEBUG
      C. ERROR
      D. WARNING
   ```
---

20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử dụng log level nào?
   ```
      A. TRACE
      B. WARN
      C. INFO
      D. ERROR
   ```
---

21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?
   ```
      A. Có
      B. Không
   ```

---

22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?
   ```
      A. Cần thống kê dễ dàng.
      B. Cần lưu một danh sách các phần tử dưới dạng phân cách nhau bởi ký tự đặc biệt và không cần truy vấn từng phần tử.
      C. A và B.
      D. Không có đáp án nào chính xác.
   ```
---

23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag của một article.
   ```
      A. Tạo một bảng trung gian (join table) giữa tag và article.
      B. Lưu giá trị của các tag vào N cột trong bảng article.
      C. Tạo một bảng riêng để lưu các tag của article.
   ```
---

24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?
   ```
      A. 1
      B. 3
      C. 5
      D. 6
   ```
---

25. Tree model nào không dễ để query child node ngay dưới?
   ```
      A. Adjacency list
      B. Path enumeration
      C. Nested Set
      D. Closure table
   ```