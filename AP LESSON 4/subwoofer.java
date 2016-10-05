import java.util.Scanner;

public class subwoofer
{
	public static void main(String[]args)
	{
		subwofer volume = new subwoofer();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches:");
		double height = kb.nextDouble();
		System.out.println("Enter width in inches:");
		double width = kb.nextDouble();
		System.out.println("Enter length in inches:");
		double length = kb.nextDouble();
		double volumeinfeet = volume.calcVol( height, width, length);
		System.out.printf("The volume of the Subwoofer Box in feet is\n%10.2f",volumeinfeet);
	}
	public double calcVol(double height, double width, double length)
	{
		double volume_inches = height*length*width;
		return (volume_inches/1728);
	}
}