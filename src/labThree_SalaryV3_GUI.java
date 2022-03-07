import javax.swing.*;

public class labThree_SalaryV3_GUI {
    public static void main(String[] args) {
        JFrame wingui;
        wingui = new JFrame();

        double normalwk1, extrawk1, totalwk1;
        double normalwk2, extrawk2, totalwk2, bonus = 0, total;

        normalwk1 = Double.parseDouble(JOptionPane.showInputDialog(wingui, "Please Enter number of normal hours for week one: "));
        extrawk1 = Double.parseDouble(JOptionPane.showInputDialog(wingui, "Please Enter number of extra hours for week one: "));

        normalwk2 = Double.parseDouble(JOptionPane.showInputDialog(wingui, "Please Enter number of normal hours for week two: "));
        extrawk2 = Double.parseDouble(JOptionPane.showInputDialog(wingui, "Please Enter number of bonus hours for week two: "));

        totalwk1 = 10 * normalwk1 + 15 * extrawk1;
        totalwk2 = 10 * normalwk2 + 15 * extrawk2;

        total = totalwk1 + totalwk2;

        if (total < 1000) {
            bonus = total * 0.1;

        }
        if (total > 1000 && total < 2000) {
            bonus = total * 0.05;
        }
        //System.out.println("total before bonus"+total);
        total = total + bonus;
        //System.out.println("bonus is "+bonus);

        JOptionPane.showMessageDialog(wingui, "Bonus salary is: $" + bonus, "Alert", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(wingui, "Total salary is: $" + total, "Alert", JOptionPane.INFORMATION_MESSAGE);

    }
}

