## Nguyên lý Liskov
Robert C Martin phát biểu như sau:
> Subtypes must be substitutable for their base types.

Dịch ra tiếng Việt

> Kiểu con kế thừa phải thay thế cho kiểu cha mà không gây đổ vỡ

### Nâng cấp vòi nước
Nếu bạn đã đọc đâu đó về nguyên lý Liskov bạn sẽ thấy họ giải thích khá phức tạp với nhiều code mẫu. Tôi sẽ bắt đầu bằng ví dụ vòi nước. Công dụng căn bản của vòi nước là đóng và mở nước từ đường ống cung cấp.

![](water_tap_1.jpg)

Các công ty luôn sáng tạo cải tiến vòi nước

![](water_tap_2.jpg)

![](water_tap_3.jpg)

Nếu thay vòi nước mới vào, mà phải lại toàn bộ đường ống cấp nước thì khách hàng sẽ phải cân nhắc lại trước khi mua. Do đó bộ phận ren vòi nước bắt vào đường ống cần phải giữ nguyên không đổi, tính năng căn bản đóng - mở cần phải dễ dùng với mọi người.

### Ví dụ về đèn

Một class đèn tổng quát [Lamp.java](Lamp/CommonLamp.java) (base type) sẽ có 3 phương thúc chính:
1. Kết nối nguồn điện ```void connectToPowerOutlet(int voltage)```
2. Bật đèn ```void turnOn()```
3. Tắt đèn ```void turnOff()```

```java
public abstract class CommonLamp {
  public void connectToPowerOutlet(int voltage) throws WrongVoltageException {
    if ((voltage > 230) || (voltage < 180)) {
      throw new WrongVoltageException("Wrong voltage " + voltage);    
    }

    System.out.println("Connect to power outlet at voltage " + voltage);
  }

  public void turnOn() {
    System.out.println("Turn on lamp");
  }

  public void turnOff() {
    System.out.println("Turn off lamp");
  }  
}
```

Giờ chúng ta tạo tiếp [LEDLamp.java](Lamp/LEDLamp.java). Đèn này do một dị nhân thiết kế để trêu chọc người dùng. Nút bật đèn thì có chức năng tắt đèn, và nút tắt đèn có chức năng bật đèn.
```java
public class LEDLamp extends CommonLamp {

  @Override
  public void turnOn() {
    System.out.println("Turn Off LED lamp"); // Trong phương thức bật đèn thì lại tắt đèn
  }

  @Override
  public void turnOff() {
    System.out.println("Turn On LED lamp"); //Trong phương thức tắt đèn thì lại bật đèn
  }
  
}
```
Rõ ràng đây là một cách thiết kế vi phạm nguyên lý Liskov. LEDLamp kế thừa CommonLamp nhưng chức năng lại đảo ngược.

CommonLamp.java chỉ chấp nhận nguồn điện có điện áp từ trên 180 volt đến 230 volt, ngoài giải điện áp này thì sẽ quăng ra lỗi [WrongVoltageException.java](Lamp/WrongVoltageException.java)

```java
public void connectToPowerOutlet(int voltage) throws WrongVoltageException {
  if ((voltage > 230) || (voltage < 180)) {
    throw new WrongVoltageException("Wrong voltage " + voltage);    
  }

  System.out.println("Connect to power outlet at voltage " + voltage);
}
```

Chúng ta tạo ra dòng đèn cho thị trường Nhật [JapaneseLamp.java](Lamp/JapaneseLamp.java) với nhiều tính năng hay ho.
- Khi bật thì đèn sẽ sáng dần
- Khi tắt thì đèn sẽ tối dần cho đến khi tắt hẳn

Tuy nhiên ở Nhật người ta chỉ dùng mức điện áp 110 volt. Hãy chú ý đến phương thức ```void connectToPowerOutlet(int voltage)```. 
Đèn sản xuất cho mức điện áp 110 Volt ở Nhật, mà cắm vào ổ điện 220 Volt thì rõ chắc chắn sẽ cháy.

```java
public class JapaneseLamp extends CommonLamp {

  @Override
  public void connectToPowerOutlet(int voltage) throws WrongVoltageException {
    if ((voltage > 120) || (voltage < 90)) {
      throw new WrongVoltageException("Wrong voltage " + voltage);    
    }

    System.out.println("Connect to power outlet at voltage " + voltage);
  }  
}
```
Kết quả khi chạy
```
Turn Off LED lamp
Turn On LED lamp
Lamp.WrongVoltageException: Wrong voltage 220
```

Vậy cách thiết kế này cũng vi phạm nguyên lý Liskov vì lớp sub type JapaneseLamp đã quăng ra ngoại lệ ở mức điện áp phù hợp với lớp base CommonLamp.

Hãy đọc phần kết luận của bài viết này [SOLID Design Principles Explained: The Liskov Substitution Principle with Code Examples](https://stackify.com/solid-design-liskov-substitution-principle/)

> This requires all subclasses to behave in the same way as the parent class. To achieve that, your subclasses need to follow these rules:
> - Don’t implement any stricter validation rules on input parameters than implemented by the parent class.
> - Apply at the least the same rules to all output parameters as applied by the parent class.

Ở ví dụ trên, lớp JapaneseLamp đã kiểm tra mức điện áp khác hoàn toàn với CommonLamp. Còn chức năng của LEDLamp thì ngược lại với CommonLamp.

 