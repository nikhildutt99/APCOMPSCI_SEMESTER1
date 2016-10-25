import java.util.Scanner;
public class Lesson6_X
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = kb.nextInt();
		System.out.println("Enter another number: ");
		int number1 = kb.nextInt();
		for (int i = number; i <= number1; i+=number)
		{
			System.out.printf("%d\t",i);
		}
	}
}