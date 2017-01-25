import java.util.Scanner;

public class userdriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First name");
		String fn=kb.nextLine();
		System.out.println("Last name");
		String ln=kb.nextLine();
		System.out.println("public avatar, (y or n)");
		String option=kb.nextLine();
		
		if(option.equals("n"))
		{
			user p1 = new user(fn, ln);
			System.out.println(p1);
		}
		else
		{
			System.out.println("avatar name");
			user p2 = new user(fn, ln,kb.nextLine());
			System.out.println(p2);
		}
	}
}