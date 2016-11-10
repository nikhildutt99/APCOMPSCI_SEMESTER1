import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.print("Choose going with Mom or Dad: ");
	String choice1 = kb.next();
	if(choice1.equals("Mom")){
	System.out.print("Choose Shopping or Makeover: ");
	String choice2 = kb.next();
	if(choice2.equals("Shopping")){
	System.out.print("Choose Bras or Jeans: ");
	String choice3 = kb.next();
	if(choice3.equals("Bras")){
	System.out.println("Naughty Naughty!");
	}
		else{
	System.out.println("Makeovers are terrible bruh!");
	}
	}
		else{
		System.out.print("Choose Lipstick or Nail Polish: ");
		String choice3 = kb.next();
		if(choice3.equals("Lipstick")){
System.out.println("Ughhh! Dumb.");
 }
		else{
			System.out.println("Ughh! You are dumb.");
		}
			}
	}
		else{
		System.out.print("Choose Movies or Arcade: ");
		String c1 = kb.next();
		if(c1.equals("Movies")){
		System.out.print("Choose Blade or Ironman: ");
		String c3 = kb.next();
		if(c3.equals("Ironman will kill you")){
		System.out.println(".");
}
		else{
		System.out.println("Blade will kill you.");
	}
}
		else{
		System.out.print("Pacman or Twister ");
		String c3 = kb.next();
		if(c3.equals("Pacman")){
		System.out.println("PACMAN will eat you in your sleep.");
	}
		else{
		System.out.println("You will die playing Twister.");
			}
		}
	}
}
}


