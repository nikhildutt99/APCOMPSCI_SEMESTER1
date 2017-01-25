import java.util.Scanner;
public class PointDistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First x-coordinate: ");
		int x1 = kb.nextInt();
		System.out.println("First y-coordinate: ");
		int y1 = kb.nextInt();
		System.out.println("Second x-coordinate: ");
		int x2 = kb.nextInt();
		System.out.println("Second y-coordinate: ");
		int y2 = kb.nextInt();
		PointDistance object = new PointDistance(x1, y1, x2, y2);
		System.out.println("<<<<<<<<<<<<<<<<DISTANCE BETWEEN POINTS>>>>>>>>>>>>>>>");
		System.out.println("The distance between (" + object.getxOne() + "," + object.getyOne() + ") and (" + object.getxTwo() + "," + object.getyTwo() + ") is " + object.getDistance());
	}
}