import java.util.Scanner;
public class Lesson6_Ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
}