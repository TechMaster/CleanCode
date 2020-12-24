package vn.techmaster;

public class MonthlyUsage {
    public Customer Customer;
    public int CallMinutes;
    public int SmsCount;

    public MonthlyUsage(Customer customer, int callMinutes, int smsCount) {
        Customer = customer;
        CallMinutes = callMinutes;
        SmsCount = smsCount;
    }

    public void Generate(MonthlyStatement monthlyStatement) throws Exception {
        switch (Customer.Type)
        {
            case PayAsYouGo:
                monthlyStatement.CallCost = 0.12f * CallMinutes;
                monthlyStatement.SmsCost = 0.12f * SmsCount;
                monthlyStatement.TotalCost = monthlyStatement.CallCost + monthlyStatement.SmsCost;
                break;

            case Unlimited:
                monthlyStatement.TotalCost = 54.90f;
                break;

            default:
                throw new Exception("The current customer type is not supported");
        }
    }
}
