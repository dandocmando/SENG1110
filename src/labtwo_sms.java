import java.util.Scanner;
/*
 * Salary.java - Lab 1
 * Author: Daniel Ferguson
 * Student No:
 * Date 01/03/22
 * Description:
 * Program to calculate the cost of sending a number of sms messages
*/

public class labtwo_sms {
    public static void main(String[] args)
    {
        Scanner userinput = new Scanner(System.in);
        Double numberOfSMS;
        Double costOfSMS;
        int setupCost = 10;

        System.out.println("Please enter the number of SMS messages sent:");
        numberOfSMS = userinput.nextDouble(); //takes input of number of SMS
        //System.out.println(numberOfSMS);
        System.out.println("Please enter the cost of SMS per message (in cents):");
        costOfSMS = userinput.nextDouble(); // takes input of cost per message
        costOfSMS = costOfSMS/100; //changes whole number from cents to dollars
        //System.out.println(costOfSMS);
        // if cost is higher than certain number give discount
        //give a total cost over 12 months as an average.

        Double totalCost = (numberOfSMS*costOfSMS)+setupCost; //computes SMS cost, adds setup cost
        System.out.println("The total cost of the SMS service is: "+totalCost);

    }
}
