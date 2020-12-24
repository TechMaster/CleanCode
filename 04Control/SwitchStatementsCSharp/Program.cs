using System;
using SwitchStatements;

namespace CleanCode
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            
            var monthlyUsage = new MonthlyUsage();
            monthlyUsage.Customer = new Customer();
            monthlyUsage.CallMinutes = 100;
            monthlyUsage.SmsCount = 500;
            monthlyUsage.Customer.Type = CustomerType.Unlimited;
            var monthlyStatement = new MonthlyStatement();

            monthlyStatement.CallCost = 1;
            monthlyStatement.Generate(monthlyUsage);

            Console.WriteLine(monthlyStatement.TotalCost);

        }
    }
}
