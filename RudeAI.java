import java.util.Scanner;

public class RudeAI 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = keyboard.nextLine();
		
		System.out.println(name + "? What a cool name");
		
		System.out.println("How old are you " + name);
		
		int age = keyboard.nextInt();
		
		System.out.println(age + ", Nice!");
		
		keyboard.nextLine();
		
		System.out.println("What do you do for fun " + name);
		
		String fun = keyboard.nextLine();
		
		System.out.println(fun + " Cool");
		
		System.out.println("What kind of music do you like");
		
		String music = keyboard.nextLine();
		
		System.out.println(music + " Awesome!");
		
		System.out.println("how many siblings do you have");
		
		int siblings = keyboard.nextInt();
		
		System.out.println(siblings + " Stellar");
		
		keyboard.nextLine();
		
		System.out.println("what do you want to be when you grow up");
		
		String job = keyboard.nextLine();
		
		System.out.println(job + " That's dumb");
		
		System.out.println("Ive actually hated you this whole time, good luck "+name);
	}
}