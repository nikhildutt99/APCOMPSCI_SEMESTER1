import java.util.Scanner;
public class toystorerunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		toystore c = new toystore(kb.nextLine());
		System.out.println(c);
		System.out.println(c.getFToy());
		System.out.println(c.getFType());
	}
}