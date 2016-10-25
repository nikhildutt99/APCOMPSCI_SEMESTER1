import java.util.Scanner;
public class Lesson6_Song
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Do you know this song?");
		
		
		
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
		
		
	}
	public static void sing(String lyrics, int times)
		{
			for(int i = 1; i <= times; i++)
			{
				System.out.printf("%s ",lyrics);
			}
			System.out.println("");
			
		}
		
		
	
}
