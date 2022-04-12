import java.util.*;

public class compoundinterest {

    public void run()
    {
        double monthlyDeposit;
        double rateOfInterest;
        double numberOfCompounds;
        double years;
        double futureValue = 0;
        double totalAmount = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Compound Interest Calculation based on monthly deposits");
        System.out.println("Monthly Deposit");
        monthlyDeposit = console.nextDouble();
        System.out.print("Rate Of Interest");
        rateOfInterest = console.nextDouble();
        //System.out.print("Number of Compounds in a year");
        //numberOfCompounds = console.nextDouble();
        System.out.print("Number of year");
        years = console.nextDouble();
        futureValue = monthlyDeposit;
        for (int i = 1; i <= years * 12; i++)
        {
            totalAmount = futureValue * (1 + (rateOfInterest / 100) / 12);
            if (i == years * 12)
                futureValue = totalAmount;
            else
                futureValue = totalAmount + monthlyDeposit;
        }
        System.out.println("Future Value is=" + futureValue);


    }
    public static void  main(String[] args){
        compoundinterest comp = new compoundinterest();
        comp.run();
    }
}
