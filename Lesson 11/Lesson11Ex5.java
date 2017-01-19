import java.util.Scanner;

public class Lesson11Ex5
{
	static int bulletCount, shotCount;
	static int Clipsize = 16;
	static String[] clip;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		bulletCount = 96;
		shotCount = 0;
		clip = new String[Clipsize];
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.print("Action: ");
			String action = kb.next();
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
			System.out.println();
		}
		System.out.println("You're all out of bullets :-( ");
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return "Boom!";
		}
		else
		{
			return "Please Reload";
		}
	}
	public static void reload()
	{
		if(bulletCount >= Clipsize)
		{
			bulletCount -= Clipsize;
			shotCount = Clipsize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "";
		output += "Bullets: " + bulletCount + "\nClip: ";
		for(int i = 0; i < Clipsize; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
		
	}
}