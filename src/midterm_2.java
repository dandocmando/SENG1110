import java.util.Scanner;

public class midterm_2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter amount of calls: ");
        double call_number = console.nextDouble();
        double conc_fee = call_number*2;
        double cost = 0;
         for(int i = 0; i < call_number; i++){
             System.out.println("Enter number of minutes in call: "+i);
             double mins = console.nextDouble();
             if(mins >3){
                 cost += (3*1.2)+(mins-3)*0.25;
             }
             else
                 cost+= mins*1.2;
        }
         double total_cost = cost+conc_fee;
         System.out.println("Total amount due for "+call_number+" calls: $"+total_cost);
    }
}
