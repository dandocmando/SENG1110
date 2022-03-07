import java.util.*;

public class labThree_SwitchErrors
{
	public static void main(String[] args)
	{
		int num;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Key: 1=blue, 2=red, 3=green");
		System.out.println("Enter an number and I'll return the corresponding color: ");
		num = keyboard.nextInt();

		switch(num)
		{
			case 1:
				System.out.println("You choose blue!");
				break;
			case 2:
				System.out.println("You choose red!");
				break;
			case 3:
				System.out.println("You choose green!");
				break;
			default:
				System.out.println("Colour not available!");
				break;
		}

	}
}