import java.util.Scanner;
public class InventoryItemsDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the item manafacturer?: ");
		String m = kb.nextLine();
		System.out.println("What is the item name?: ");
		String i = kb.nextLine();
		System.out.println("Do you want to add a category and price? (Y or N)");
		String option = kb.nextLine();
		
		if(option.equals("N"))
		{
			InventoryItems user1 = new InventoryItems(m,i);
			System.out.println(user1);
		}
		else
		{
			System.out.println("What is the category of the item?");
			String c = kb.nextLine();
			System.out.println("What is the item price?");
			int pri = kb.nextInt();
			InventoryItems user1 = new InventoryItems (m, i, c, pri);
			System.out.println(user1);
		}
	}
}