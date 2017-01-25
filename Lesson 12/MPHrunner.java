import java.util.Scanner;
public class MPHrunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the distance?: ");
		int d = kb.nextInt();
		System.out.println("How many hours?: ");
		int h = kb.nextInt();
		System.out.println("How many minutes?: ");
		int m = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(d, h, m);
		
		System.out.println("<<<<<<<<<<< MilesPerHour >>>>>>>>>>>");
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes is " + object.getMPH() + " mph.");
		
		System.out.println("Enter a new distance ");
		d = kb.nextInt();
		System.out.println("Enter a new hours ");
		h = kb.nextInt();
		System.out.println("Enter a new minutes ");
		m = kb.nextInt();

		object.setValues(d, h, m);
		System.out.println("<<<<<<<<<<< MilesPerHour >>>>>>>>>>>");
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes is " + object.getMPH() + " mph.");
		

	}
}