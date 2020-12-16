# Hướng dẫn cách chạy
1. Biên dịch rồi truy cập vào http://localhost:8080
```
Employee [dob=1975-11-27, name=Trịnh Minh Cường, age in years = 45.055]
Employee [dob=1972-10-15, name=Nguyễn Văn X, age in years = 48.17074]
Employee [dob=1999-01-05, name=Đoàn Văn Y, age in years = 21.947063]
Employee [dob=1995-02-18, name=Nguyễn Thị A, age in years = 25.826677]
Employee [dob=1990-03-17, name=Đoàn Văn B, age in years = 30.752172]
Employee [dob=1994-02-16, name=Bùi Thị C, age in years = 26.83149]
```
2. Cách tính số năm khoảng cách giữa 2 thời điểm như sau
```java
public float getAge() {
    DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate birthDay = LocalDate.parse(this.dob, DATEFORMATTER);
    return birthDay.until(LocalDate.now(), ChronoUnit.DAYS) / 365.2425f;    
}
```