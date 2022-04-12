/*
Boring stuff
Author: Daniel Ferguson
Author Student ID:3374690
Date: 15/3/22
Assignment 1 SENG1110:
Calculate salary based on weekly hours worked.
*/

import java.math.RoundingMode;
import java.util.*;
import java.math.BigDecimal;

public class Salary
{
    public void main (String[] args)
    {
        Scanner console = new Scanner(System.in);  // initialises scanner to accept inputs
        String username, bonus = null;
        double normal, total = 0, totalReg = 0, totalEx = 0, regHours, exHours; // initialises all variables
        double weeks;
        System.out.println("Hello, what is your name?");
        username = console.next();  // takes user input and assigns it to defined value
        System.out.println("How many weeks did you work?");
        weeks = console.nextDouble();
        while(weeks < 0){
            System.out.println("Please enter a positive number:");
            weeks = console.nextDouble();
        }

        for(int i = 0; i  < weeks; i++) // for loop runs the number of weeks worked
        {
            System.out.println("Please enter number of hours worked this week: ");
            normal = console.nextDouble();  // takes user input and places in var normal
            while(normal < 0){
                System.out.println("Please enter a positive number:");
                normal = console.nextDouble();
            }

            if(normal <= 40)  // if normal is <= to 40 run this step
            {
                regHours = normal*10;  // computes the hours worked and * by hourly rate
            }
            else
            {
                exHours = 15*(normal - 40);  // computes extra hours worked and * by higher rate
                totalEx = totalEx + exHours;  // adds extra hours to total extra hours

                regHours = 10*(40); // normal hours will always be 40, then * hourly rate
            }

            totalReg = totalReg + regHours; // computes total regular hours
            total = totalEx + totalReg; // adds regular total and extra total together

            if(total <= 1000)  // adds an extra 10% if earnings over 1k
            {
                total=total*1.1; // I have included all the bonus parts of this assessment, the bonus additions may change desk checking, please take it into account.
                bonus = "10%";
            }
            else if(total > 1000 && total <= 2000) // else if does exist :)
            {
                total=total*1.05;
                bonus = "5%";
            }
            else if(total > 2000 && total <= 3000)
            {
                total=total*1.01;
                bonus = "1%";
            }
            }

        BigDecimal totalRounded = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);  // creates new object and rounds it into 2 dec places
        BigDecimal weekRounded = new BigDecimal(weeks).setScale(0, RoundingMode.HALF_EVEN);  // rounds to 0 dec places

        System.out.println(username+" earned a total of: $"+totalRounded+" in "+weekRounded+" weeks, this includes a bonus of "+bonus+".");
    }
}
