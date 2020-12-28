package vn.techmaster;

public class Customer {
    public CustomerType Type;

    public MonthlyStatement GenerateStatement(MonthlyUsage monthlyUsage) throws Exception {
        var statement = new MonthlyStatement();
        switch (Type)
        {
            case PayAsYouGo:
                statement.CallCost = 0.12f * monthlyUsage.CallMinutes;
                statement.SmsCost = 0.12f * monthlyUsage.SmsCount;
                statement.TotalCost = statement.CallCost + statement.SmsCost;
                break;

            case Unlimited:
                statement.TotalCost = 54.90f;
                break;

            default:
                throw new Exception("The current customer type is not supported");
        }
        return statement;
    }
}


