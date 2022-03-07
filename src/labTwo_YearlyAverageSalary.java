import java.math.BigDecimal;

import java.util.*;

/*
 * Salary.java - Lab 1
 * Author: Daniel Ferguson
 * Student No:
 * Date 01/03/22
 * Description:
 * Program to calculate the new salary based on % increase of last years salary
 * includes weekly average pay

 */

public class labTwo_YearlyAverageSalary {

    public static void main(String[] args)
    {
        Scanner userinput = new Scanner(System.in);

        String username;
        double salary2020 = Double.valueOf(152000);
        double salaryincrement2021;




        //System.out.println(WeeklyRounded);

        System.out.println("Please input your first and last name:");
        username = userinput.next();
        System.out.println("Please input your salary increase as a percentage:"); //if increase is 5% enter 5.
        salaryincrement2021 = userinput.nextDouble();

        salaryincrement2021 = (salaryincrement2021/100)+1;
        double salary2021 = salary2020*salaryincrement2021;
        System.out.println((salaryincrement2021));

        //System.out.println(username);
        BigDecimal WeeklyRounded = new BigDecimal(salary2021/52);
        WeeklyRounded = WeeklyRounded.setScale(2, BigDecimal.ROUND_HALF_EVEN);

        BigDecimal incrementRounded = new BigDecimal((salaryincrement2021-1)*100);
        incrementRounded = incrementRounded.setScale(2, BigDecimal.ROUND_HALF_EVEN);

        //System.out.println(salary2021);
        System.out.println("Employee: "+username+" Payouts:");
        System.out.println("2020: "+salary2020);
        System.out.println("2021: "+salary2021+" ("+incrementRounded+"% increase!"+")"+"\n");

        System.out.println("2021 Weekly Salary: "+WeeklyRounded);


    }
}
