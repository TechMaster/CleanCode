package address;

public class AddressApplication {

    public static void main(String[] args) {
        Address address1 = new Address.Builder()
                .number(147)
                .street("Hoang Quoc Viet")
                .ward("Nghia Do")
                .district("Cau Giay")
                .province("Ha Noi")
                .build();
        System.out.println(address1);

        Address address2 = new Address.Builder()
                .street("Pham Hung")
                .district("Nam Tu Liem")
                .province("Ha Noi")
                .build();
        System.out.println(address2);
    }

}
