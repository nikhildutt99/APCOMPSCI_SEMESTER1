import java.util.Scanner;
public class Lesson5_Ex3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What grade did you get in Math?");
		String item1 = kb.next();
		System.out.println("What grade did you get in English?");
		String item2 = kb.next();
		System.out.println("What grade did you get in Science?");
		String item3 = kb.next();
		System.out.println("What grade did you get in History?");
		String item4 = kb.next();
		System.out.println("What grade did you get in Computer Science?");
		String item5 = kb.next();
		System.out.println("What grade did you get in PE?");
		String item6 = kb.next();
		System.out.println("What grade did you get in Band?");
		String item7 = kb.next();
		double tot = calcPoints(item1) + calcPoints(item2) + calcPoints(item3) + calcPoints(item4) + calcPoints(item5) + calcPoints(item6) + calcPoints(item7);
		double GPA = tot/7;
		
		System.out.printf("Your GPA is a " + GPA);			
	}
	public static double calcPoints(String g)
	{
		if (g.equals("A"))
			return 4.0;
		if (g.equals("B"))
			return 3.0;
		if (g.equals("C"))
			return 2.0;
		if (g.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}
