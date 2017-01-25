import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What Color is the car?");
		String color = kb.nextLine();
		System.out.println("What is the interior of the car?");
		String in = kb.nextLine();
		System.out.println("What is the engine of the car?");
		String eng = kb.nextLine();
		System.out.println("What are the tire measurments of your car?");
		String tir = kb.nextLine();
		
		carclass object = new carclass(color, in, eng, tir);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<VEICHLE>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Paint:" + object.getPaint() + "\nInterior: " + object.getInterior() + "\nEngine: " + object.getEngine() + "\nTires: " + object.getTires());
	}
}