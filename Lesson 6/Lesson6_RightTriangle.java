import java.util.Scanner;
public class Lesson6_RightTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = kb.next();
		for (int i = word.length()-1; i >= 0; i--)
		{
			System.out.println(word.substring(i,word.length()));
		}
	}
}