import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hair Color: ");
		String hairs = kb.nextLine();
		System.out.println("Eye Color: ");
		String eye = kb.nextLine();
		System.out.println("Skin Color: ");
		String skins = kb.nextLine();
		Human object = new Human(hairs, eye, skins);
		
		System.out.println("<<<<<<<<<<< HUMAN INFO>>>>>>>>>>>");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	

		object.setHES("blonde", "green", "tan");
		System.out.println("<<<<<<<<<<< Friend's Info >>>>>>>>>>>");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	
	}

	}
