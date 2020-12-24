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
}
