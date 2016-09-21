import java.util.Scanner;

public class IDCARD
{
	public static void main(String[]args)
	{
		IDCARD card = new IDCARD();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String first = kb.nextLine();
	
		System.out.println("Enter your last name:");
		String last = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String site = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("***********************************");
		card.format(site, year);
		card.format(first, last);
		card.format(title, subject);
		System.out.println("***********************************");
	}
	
	public void format(String column1, String column2)
	{
		System.out.printf("*%14s%18s *%n", column1, column2);
	}
}