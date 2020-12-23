package vn.techmaster;

public class MonthlyStatement {
    public float CallCost;
    public float SmsCost;
    public float TotalCost;

    public MonthlyStatement() {
    }

    public void Generate(MonthlyUsage usage) throws Exception {
        switch (usage.Customer.Type)
        {
            case PayAsYouGo:
                CallCost = 0.12f * usage.CallMinutes;
                SmsCost = 0.12f * usage.SmsCount;
                TotalCost = CallCost + SmsCost;
                break;

            case Unlimited:
                TotalCost = 54.90f;
                break;

            default:
                throw new Exception("The current customer type is not supported");
        }
    }
}
