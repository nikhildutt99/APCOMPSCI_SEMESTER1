import java.util.Scanner;
public class Lesson6_Ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		System.out.println("Enter size: ");
		int size = kb.nextInt();
		for (int i = 1; i <= size; i++)
		{
			System.out.printf("%5d   %5d\n",i,i*number);
		}
	}
}