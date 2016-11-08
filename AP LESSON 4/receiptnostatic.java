import java.util.Scanner;

public class receiptnostatic
{
	static double length, width, perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		receiptnostatic rectangle = new receiptnostatic();
		
		System.out.println("Please enter the length and width");
		length = kb.nextDouble();
		width  = kb.nextDouble();
		
		rectangle.calcPerim();
		rectangle.print();
	}
	public void calcPerim()
	{
		perimeter  = (2*length)+(2*width);
	}
	public void print()
	{
		System.out.println("Your perimeter of the rectangle is " + perimeter );
	}
}