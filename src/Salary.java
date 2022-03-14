/*
Boring stuff
Author: Daniel Ferguson
Author Student ID:3374690
Date: 15/3/22
Assignment 1 SENG1110:
Calculate salary based on weekly hours worked.
*/

import java.util.*;
import java.math.BigDecimal;

public class Salary
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);  // initialises scanner to accept inputs
        String username;
        double normal, total = 0, totalReg = 0, totalEx = 0, regHours = 0, exHours = 0; // initialises all variables
        double weeks;
        System.out.println("Hello, what is your name?");
        username = console.next();
        System.out.println("How many weeks did you work?");
        weeks = console.nextDouble();
        for(int i = 0; i  < weeks; i++) // for loop runs the number of weeks worked
        {
            System.out.println("Please enter number of hours worked this week: ");
            normal = console.nextDouble();  // takes user input and places in var normal
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
            total = totalEx + totalReg;
            if(total > 1000)
            {
                total=total*1.1;  // adds an extra 10% if earnings over 1k
            }

            }
        BigDecimal totalRounded = new BigDecimal(total);  // creates new object based on total var
        totalRounded = totalRounded.setScale(2, BigDecimal.ROUND_HALF_EVEN);  // rounds new object to 2 dec places

        BigDecimal weekRounded = new BigDecimal(weeks);
        weekRounded = weekRounded.setScale(0, BigDecimal.ROUND_HALF_EVEN);

        System.out.println(username+" earnt a total of: $"+totalRounded+" in "+weekRounded+" weeks."); // prints overall total


    }
}
