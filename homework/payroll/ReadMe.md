# Bài tập buổi 3-4-5

## Phần mềm tính lương phiên bản 1.0
Hãy viết ứng dụng tính lương gồm các tính năng như sau:
1. Đọc vào danh sách nhân viên dạng file CSV gồm các trường: 
  - name: họtên
  - dob: ngày sinh
  - role: chức vụ[director,manager,sales,engineer,staff,worker]
  - startdate: ngày bắt đầu làm việc ở công ty
  - startsal: mức lương khởi điểm

2. In ra màn hình tính đến ngày hôm nay:
  - Tuổi hiện tại của nhân viên
  - Số năm và tháng làm việc. Làm tròn xuống, 3 năm, 2 tháng 15 ngày --> 3 năm, 2 tháng
  
3. Công thức tăng lương theo thâm niên phiên bản 1.0:
  - Bất kỳ nhân viên nào không quan tâm đến chức vụ, cứ làm đủ 12 tháng là tăng một bậc lương 6% so với mức lương cũ. Cách tính này không cần đến đầu năm mới điều chỉnh.
  - Hãy tính lương tại thời điểm hiện tại của nhân viên

## Phần mềm tính lương phiên bản 2.0
1. Hỗ trợ đọc vào file Excel
2. Chỉ số tăng lương đối với chức vụ là khác nhau
3. Quy luật tính lương còn bao gồm cả thưởng theo doanh số đối với [manager,sales], over time đối với [engineer,staff,worker]  ngày càng phức tạp.
Hãy làm sao thiết kế hệ thống để đáp ứng những thay đổi ngày một nhiều