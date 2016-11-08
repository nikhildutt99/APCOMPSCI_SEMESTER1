import java.util.Scanner;

public class averagenostatic
{
	static double num1, num2, num3, avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		averagenostatic average = new averagenostatic();
		
		System.out.println("Enter three numbers:");
		num1 = kb.nextDouble();
		num2 = kb.nextDouble();
		num3 = kb.nextDouble();
		
		average.avg();
		average.print();
	}
	public void avg()
	{
		avg = (num1+num2+num3)/3;
	}
	public void print()
	{
		System.out.println("The average of " + num1 + ", " + num2 + ",and " + num3 + " is " + avg + "!  Now go away!");
	}
}


