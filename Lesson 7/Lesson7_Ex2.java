import java.util.Scanner;

public class Lesson7_Ex2
{
	public static double avgDigits(int number)
	{
		
		int digit = 0;
		double average = 0;
		int num = number;
		
		while(num > 0)
		{
			digit += 1;
			average += num%10;
			num = (num/10);
		}
		average = average/digit;
		return average;
	
	}
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = kb.nextInt();
		
		avgDigits(number);
		System.out.printf("The average of the digits in %d is %f", number, avgDigits(number));
	}
}
