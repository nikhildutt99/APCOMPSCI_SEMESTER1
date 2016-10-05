import java.util.Scanner;

public class average
{
	static double num1;
	static double num2;
	static double num3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What's your first number");
		num1 = kb.nextDouble();
		System.out.println("What's your second number");
		num2 = kb.nextDouble();
		System.out.println("What's your third number");
		num3 = kb.nextDouble();
		print();
	}
	public static double average()
	{
		double avg = num1 + num2 + num3;
		return (avg / 3);
	}
	public static void print()
	{
		System.out.printf("The average of your numbers is %5f.", average());
	}


}