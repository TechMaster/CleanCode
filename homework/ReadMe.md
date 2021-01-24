# Bài tập tổng hợp cho lớp Clean Code

Bài tập tổng hợp cho lớp Clean Code gồm câu hỏi lý thuyết phải tự luận, một số chỉ cần khoanh lựa chọn và có một số bài tập lập trình nhỏ.


## Phần 1: Clean Code căn bản

1. Hãy tham khảo slide [CleanCode.pdf](../03Basic/CleanCode.pdf) tóm tắt 5 mục tiêu chính của Clean Code.
2. Trong một công ty X, có ba nhóm phần mềm, làm cùng công nghệ, số lượng thành viên cũng như kinh nghiệm tương đương nhau. Cả ba đều muốn áp dụng Clean Code vào dự án của mình và có 3 cách tiếp cận khác nhau.
   - Team A: Ưu tiên tiến độ dự án trước, deliver được phiên bản đầu tiên, thì mới cho thành viên tham khảo Clean Code rồi áp dụng, refactor code ở phiên bản kế tiếp
   - Team B: Clean Code là cực kỳ quan trọng, do đó dành hẳn 30% thời gian của toàn bộ dự án để đào tạo Clean Code cho thành viên sau đó mới bắt đầu lập trình
   - Team C: Áp dụng Clean Code là một quá trình. Quy tắc nào dễ hiểu, dễ nhớ thì áp dụng trước. Những kỹ thuật phức tạp sẽ học và áp dụng trong tình huống phù hợp. Cân bằng giữa tiến độ và clean code.

Nếu bạn là team lead bạn sẽ chọn phương án nào? Giải thích tại sao?

3. Bạn là một team lead, khi bạn giới thiệu các quy tắc Clean Code cho các đồng đội trẻ. Có một số bạn cho rằng Clean Code chỉ làm phức tạp thêm vấn đề, và chậm lại hiệu suất làm việc của nhóm. Bạn sẽ trả lời họ thế nào?

4. Bob, Alice, Toàn, Vân được sếp giao cho viết một hàm tính lương tăng theo năm làm việc. Năm đầu tiên nhân viên sẽ nhận mức lương kiểu integer là ```initialSalary```, cứ tròn 12 tháng, nhân viên được tăng lương bằng cách nhân với hệ số ```raise > 1.0```. Công thức là ```Salary at Nth year = initialSalary * (1 + raise)^N```
N = 0, năm đầu tiên
N = 1, năm thứ 2
...

Đây là tên hàm do họ đề xuất;

Đề xuất của Bob
```java
int calculateSalaryAfterYears(int years);
```

Đề xuất của Alice
```java
int salaryAfterYears(Date joinedData, Date today, int initialSalary);
```

Đề xuất của Toàn
```java
int tinhLuongNamThuN(int namThuN, int luongNamDauTien);
```

Đề xuất của Vân
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
1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
   ![](../05OOP/jungle/src/main/java/graphiceditor/after/interface.jpg)

2. Composition over Inheritance !
Vinfast vừa ra mắt mẫu xe VF33. [Xem chi tiết ở đây](https://vingroup.net/tin-tuc-su-kien/bai-viet/2288/vinfast-ra-mat-3-dong-o-to-dien-tu-lai-khang-dinh-tam-nhin-tro-thanh-hang-xe-dien-thong-minh-toan-cau)
Xe VF33 dùng chung một hệ thống khung sườn, hệ thống điều khiển tự lái thông minh nhưng có thể có tuỳ chọn động cơ xăng hoặc điện.

Bạn là kỹ sư phần mềm mô phỏng, hãy viết code Java để mô phỏng xe VF33 có những đặc điểm nếu trên. Trước khi iết [hãy tham khảo code này](../SOLID/DependencyInjection/05DifferentWaysDI/demobean)

Nếu bạn hỏi tôi nên viết như thế nào? Tôi sẽ trả lời lập trình là một công việc sáng tạo. Nhưng làm sao sáng tạo của bạn, đồng nghiệp hiểu được, dùng được và cùng tham gia code. Vậy bạn hãy lập trình để làm sao tôi (đồng nghiệp code của bạn) hiểu được code của bạn. Đừng phức tạp hoá vấn đề quá, nội dung method đôi khi chỉ cần dùng ```System.out.println("Some text here");```