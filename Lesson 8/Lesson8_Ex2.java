import java.util.Scanner;
public class Lesson8_Ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter word one: ");
		String W1 = kb.next();
		System.out.println("Enter word two:");
		String W2 = kb.next();
		System.out.println("Enter word three: ");
		String W3 = kb.next();
		makeCenter(W1,20);
		makeCenter(W2,20);
		makeCenter(W3,20);
	}
	public static String makeCenter(String word, int number)
	{
		if(word.length() >= number)
		{
			System.out.println(word);
		}
		else{
			makeCenter(" " + word + " ", number);
		}
		return"";
	}
		
}