import java.util.Scanner;

public class lesson4
{
	public static void main(String[]args)
	{
		//new lesson4 object
		lesson4 form = new lesson4();
		Scanner keyboard = new Scanner(System.in);
		//prompt for item1
		System.out.println("Enter item 1");
		String item = keyboard.nextLine();
		System.out.println("Enter its price");
		double num1 = keyboard.nextDouble();
		keyboard.nextLine();//eats the extra return character
		//prompt for item2
		System.out.println("Enter item 2");
		String itemtwo = keyboard.nextLine();
		keyboard.nextLine();
		System.out.println("Enter its price");
		double num2 = keyboard.nextDouble();
		keyboard.nextLine();//eats the extra return character
		//prompt for item3
		System.out.println("Enter item 3");
		String itemthree = keyboard.nextLine();
		keyboard.nextLine();
		System.out.println("Enter its price");
		double num3 = keyboard.nextDouble();
		
		double subtotal = num1 + num2 + num3;
		double tax = .63;
		double total = subtotal + tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item, num1);
		form.format(itemtwo, num2);
		form.format(itemthree, num3);
		form.format("Subtotal:", subtotal);
		form.format("Tax:", tax);
		form.format("Total:", total);
	}
		
	public void format(String word, double number)
	{
		System.out.printf("\n * %15s ......... %10.2f", word, number);
	}
	
}