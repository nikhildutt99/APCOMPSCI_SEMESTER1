import java.util.Scanner;
public class compint
{
	public static void main(String[]args)
	{
		compint math = new compint();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount you wish to borrow:");
		double p = keyboard.nextDouble();
		System.out.println("Enter how often this amount will be compounded in a year:");
		double n = keyboard.nextDouble();
		System.out.println("Enter the rate:");
		double r = keyboard.nextDouble();
		System.out.println("Enter the number of years you will be paying this loan off");
		double t = keyboard.nextDouble();

		double totalpay = math.Total_Pay(r, p, n, t); 
		System.out.printf("The total pay per month is \n%10.2f", totalpay); 
	} 
	public double Total_Pay(double r, double p, double n, double t) 
	{ 
		return ((p*Math.pow(1+(r/n),n*t))/(12*t)); 
	}

}