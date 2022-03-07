import java.util.*;
import javax.swing.*;

public class labTwo_SalaryV2
{
    public static void main (String[] args)
    {
        JFrame wingui;
        wingui = new JFrame();

        Scanner console = new Scanner(System.in);
        double normalwk1,extrawk1,totalwk1;
        double normalwk2, extrawk2, totalwk2, bonus = 0, total;
        //System.out.println("Please Enter number of normal hours for week one: ");
        //normalwk1 = console.nextDouble();
        normalwk1 = Double.parseDouble(JOptionPane.showInputDialog(wingui,"Please Enter number of normal hours for week one: "));
        //System.out.println("Please Enter number of extra hours for week one: ");
        //extrawk1 = console.nextDouble();
        extrawk1 = Double.parseDouble(JOptionPane.showInputDialog(wingui,"Please Enter number of extra hours for week one: "));

        totalwk1 = 10*normalwk1+15*extrawk1;


        //System.out.println("Please Enter number of normal hours for week two: ");
        //normalwk2 = console.nextDouble();
        normalwk2 = Double.parseDouble(JOptionPane.showInputDialog(wingui,"Please Enter number of normal hours for week two: "));

        //System.out.println("Please Enter number of extra hours for week two: ");
        //extrawk2 = console.nextDouble();
        extrawk2 = Double.parseDouble(JOptionPane.showInputDialog(wingui,"Please Enter number of bonus hours for week two: "));

        totalwk2 = 10*normalwk1+15*extrawk1;

        total = totalwk1 + totalwk2;
        //System.out.println(total);

        if (total<1000){
            //System.out.println(total);
            bonus = total*0.1;
            //System.out.println(total);
        }
        if (total>1000 && total<2000){
            bonus = total*0.05;
            //System.out.println(total);
        }
        total = total+bonus;
        //System.out.println(bonus);
        System.out.println("Total salary is: "+total+"\n");
    }
}
