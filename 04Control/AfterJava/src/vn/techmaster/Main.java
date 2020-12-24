package vn.techmaster;

public class Main {

    public static void main(String[] args) throws Exception {
        var monthlyUsage = new MonthlyUsage(new Customer(), 100, 500);
        monthlyUsage.Customer.Type = CustomerType.PayAsYouGo;
        var monthlyStatement = new MonthlyStatement();

        monthlyUsage.Generate(monthlyStatement);

        System.out.println(monthlyStatement.TotalCost);
    }
}
