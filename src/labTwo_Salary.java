import java.util.*;

/*
 * Salary.java - Lab 1
 * Author: Daniel Ferguson
 * Student No:
 * Date 29/02/22
 * Description:
 * Program to calculate weekly salary from total number of hours worked.
 * Modified to include minimum pay of $200 per week.
 */

public class labTwo_Salary
{
    public static void main (String[] args)
    {
        int baseSalary = 200; //Creates 200 base salary

        Scanner console = new Scanner(System.in); //initialises code ready to receive key inputs
        double normal,extra,total; // defines 3 vars as doubles
        System.out.println("Please Enter number of normal hours: "); //print to tell user to write hours worked
        normal = console.nextDouble(); // receives hours worked from key input and places inside normal var
        System.out.println("Please Enter number of extra hours: ");//print to tell user to write hours worked
        extra = console.nextDouble();// receives hours worked from key input and places inside extra var

        total = (10*normal+15*extra)+baseSalary; //creates total pay based on hours worked + base sal

        System.out.println("Base salary is: "+"$"+baseSalary); //outputs base sal
        System.out.println("Total salary is: "+"$"+total+"\n"); // outputs total sal
    }
}
