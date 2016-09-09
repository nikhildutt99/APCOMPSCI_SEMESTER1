import java.util.Scanner;

public class Calculation
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a length");
		int num = keyboard.nextInt();
		System.out.println("A square with this side length has an area of " + num * num + ".");
	}
}