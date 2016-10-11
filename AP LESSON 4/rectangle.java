import java.util.Scanner;

public class rectangle
{
	static double l;
	static double w;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter length:");
		l = kb.nextDouble();
		
		System.out.println("Enter width:");
		w = kb.nextDouble();
		
		print();
	}
	
	public static double calcPerim()
	{
		return 2 * (l + w);
	}

	public static void print()
	{
		System.out.printf("Your rectangle perimeter is %.5f sq ft.", calcPerim());
	}
}