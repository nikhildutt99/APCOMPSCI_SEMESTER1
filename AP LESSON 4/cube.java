import java.util.Scanner;

public class cube
{
static double s;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the damn cube:");
		s = kb.nextDouble(); 
		print();
	
	}
	public static double calcSurf()
	{
		return 6 * (s * s);
	}
	public static void print()
	{
		System.out.printf("The surface area of cube with side length is %.5f sq. ft.", calcSurf());
	}
}
					