import java.util.Scanner;
public class Lesson_5_E2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter item 1:");
		String item1 = kb.next();
		System.out.println("Please enter its price:");
		double price1 = kb.nextDouble();
		System.out.println("Enter item 2:");
		String item2 = kb.next();
		System.out.println("Please enter its price:");
		double price2 = kb.nextDouble();
		System.out.println("Enter item 3:");
		String item3 = kb.next();
		System.out.println("Please enter its price:");
		double price3 = kb.nextDouble();
		System.out.println("Enter item 4:");
		String item4 = kb.next();
		System.out.println("Please enter its price:");
		double price4 = kb.nextDouble();
		
		
		double subtotal = price1 + price2 + price3 + price4;
		double Discount = calcDisc(subtotal);
		double tax = subtotal * .085;
		double total = subtotal - Discount + tax;
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		
		format("Subtotal ", subtotal);
		format("Discount", Discount);
		format("Tax", tax);
		format("Total", total);
		

		System.out.println("\n____________________________________________");
		
		System.out.println("     Thank You for Shopping at Walmart!");
	}
	
	public static double calcDisc(double subtotal)
	{	
			if (subtotal >= 2000)
			{
				return subtotal * 0.85;
			}
			
			return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n * %15s ......... %10.2f", item, price);
	}
}