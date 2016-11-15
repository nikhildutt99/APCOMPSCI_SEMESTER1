import java.util.Scanner;
public class Lesson7_Ex1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = kb.nextInt();
		int sum = 0;
		sumAdder(num,sum);
	}
	public static void sumAdder(int num, int sum)
	{
		while(num>0){
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("The sum of the digits in " + num + " is " + sum);
	}
}