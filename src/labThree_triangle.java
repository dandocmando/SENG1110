import java.util.Scanner;

public class labThree_triangle {

    public static void main(String[] args)
    {
        double side1, side2, side3;
        System.out.println("Triangle finder");
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter side one of the triangle: ");
        side1 = console.nextDouble();
        System.out.println("Please enter side two of the triangle: ");
        side2 = console.nextDouble();
        System.out.println("Please enter side three of the triangle: ");
        side3 = console.nextDouble();

        if(side1+side2 < side3 || side1+side3 < side2 || side2+side3 < side1)
            System.out.println("This isn't a triangle!");
        else {

            if (side1 == side2 || side1 == side3 || side2 == side3) {
                if ((side1 + side2 + side3) / 3 == side1) {
                    System.out.println("This is an equilateral triangle!");
                } else {
                    System.out.println("This is an isosceles triangle!");
                }
            }
            if (side1 != side2 && side2 != side3 && side1 != side3) {
                System.out.println("This is a scalene triangle!");
            }
        }



    }
}
