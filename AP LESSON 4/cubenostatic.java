import java.util.Scanner;

public class cubenostatic
{
	static double s, sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		cubenostatic cube = new cubenostatic();
		
		System.out.println("Enter the side of cube:");
		s = kb.nextDouble();
		
		cube.calcSurf();
		cube.print();
	}
	public void calcSurf()
	{
		sa = (s*s*6);
	}
	public void print()
	{
		System.out.println("The surface area of a cube with side length " + s + " is " + sa);
	}
}


