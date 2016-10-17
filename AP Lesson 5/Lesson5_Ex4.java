import java.util.Scanner;
public class Lesson5_Ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = kb.nextDouble();
		System.out.println("what is your weight in pounds");
		double weight = kb.nextDouble();
		
		double BMI = (weight/(height * height)) * 703;
		
		System.out.println("You are " + calcCondish(BMI));
	}
		public static String calcCondish(double BMI)
	{
		if (BMI < 18.5)
		{
			return "Sagar.";
		}
		else if (BMI < 25)
		{
			return "normal.";
		}
		else if (BMI < 30 )
		{
			return "slightly overweight.";
		}
		if (BMI < 35)
		{
			return "Overweight.";
		}
		else if (BMI < 40)
		{
			return "Obese.";
		}
		else
			return "Morbidly Obese...lose some weight fatty!";
	}
}