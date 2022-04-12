import java.util.Scanner;

public class midtermpractice_3 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter any positive and even number: ");
        int n = console.nextInt();
        while(n%2 != 0 || n<0){
            if(n%2 !=0){
                System.out.println("Please enter a even number: ");
                n = console.nextInt();
            }
            if(n<1){
                System.out.println("Please enter a positive number: ");
                n = console.nextInt();
            }
        }
        double total = 0;
        for(double i = 2; i < n; i++){
            total += i/(i+1);
            System.out.println(i/(i+1));
       }
        System.out.println(total);




    }
}
