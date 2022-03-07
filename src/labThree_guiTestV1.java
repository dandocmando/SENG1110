import javax.swing.*;

public class labThree_guiTestV1 {


    public static void main(String[] args){
        JFrame wingui;
        wingui = new JFrame();

        double msgtst = 5;
        String out = "test";
        String outtwo;
        out =JOptionPane.showInputDialog(wingui,"message");
        outtwo =JOptionPane.showInputDialog(wingui,"message");
        System.out.println(out);

        //JOptionPane.showMessageDialog(wingui,"message body",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(wingui,"Successfully Updated.","Alert",JOptionPane.INFORMATION_MESSAGE);    }
}
