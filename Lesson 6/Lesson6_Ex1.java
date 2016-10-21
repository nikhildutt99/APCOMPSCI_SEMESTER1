import java.util.Scanner;
public class Lesson6_Ex1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = kb.next();
		for (int i = 1; i < word.length(); i++)
		{
			System.out.println(word.charAt(i));
		}
	}
}