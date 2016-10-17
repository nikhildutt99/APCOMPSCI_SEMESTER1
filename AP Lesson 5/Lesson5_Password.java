import java.util.Scanner;
public class a
{
	public static void main(String[]args)
		
	{
		passCheck();
	}
	public static void passCheck()
	{
			Scanner kb = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = kb.next();
		System.out.println("Enter Password: ");
		String password = kb.next();
		
		if (username.equals("Nikhil") && password.equals("Dutt"))
		{
			System.out.println("You are granted access.");
		}
		else if(!username.equals("Nikhil") && password.equals("Dutt"))
		{
			if (username.equals("Nikhil"))
			{
				System.out.println("Password is incorrect. Try again.");
				passCheck();
			}
			if (password.equals("Dutt"))
			{
				System.out.println("Username is incorrect. Try again.");
				passCheck();
			}
		}
		else
		{
			System.out.println("Both username and password are incorrect. Try again.");
			passCheck();
		}
		
	}
}
