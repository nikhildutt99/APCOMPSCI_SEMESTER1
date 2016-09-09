import java.util.Scanner;

public class bmi
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your weight in pounds and height in inches");
		double num = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		double num3 = num2 * num2;
		double num4 = num/num3;
		System.out.println("Your BMI is " + num4 * 703 + ".");
		
	}
}