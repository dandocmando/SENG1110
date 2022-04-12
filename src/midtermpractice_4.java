import java.util.Scanner;

public class midtermpractice_4 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = console.nextDouble();
        double total = 0;
        for(int i = 1; i < num; i++){
            total+=i;
        }
    }
}
