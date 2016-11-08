import java.util.Scanner;
	
	public class circlenostatic
	{
		static double radius, area;
		
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
			
			circlenostatic circle = new circlenostatic();
			
			System.out.println("Please enter the radius");
			radius = kb.nextDouble();
			
			circle.calcArea();
			circle.print();
		}
		public void calcArea()
		{
			area = (3.14159265*radius*radius);
		}
		public void print()
		{
			System.out.println("The area of the circle with radius " + radius + " is " + area);
		}
	}
 
