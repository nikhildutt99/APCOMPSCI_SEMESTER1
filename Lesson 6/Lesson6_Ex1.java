
import java.util.Scanner;

public class Lesson6_Ex1
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}