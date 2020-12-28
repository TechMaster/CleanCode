package vn.techmaster;

public class Main {

    public static void main(String[] args) throws Exception {
        var customer1 = new UnlimitedCustomer();
        var monthlyUsage1 = new MonthlyUsage(customer1,100, 500);
        var monthlyStatement1 = monthlyUsage1.Customer.GenerateStatement(monthlyUsage1);

        var customer2 = new PayAsYouGoCustomer();
        var monthlyUsage2 = new MonthlyUsage(customer2,100, 500);
        var monthlyStatement2 = monthlyUsage2.Customer.GenerateStatement(monthlyUsage2);

        System.out.println("Customer 1: " + monthlyStatement1.TotalCost);
        System.out.println("Customer 2: " + monthlyStatement2.TotalCost);
    }
}
