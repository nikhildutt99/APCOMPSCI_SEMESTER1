import java.util.Scanner;
public class Lesson7_Ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	public static String replace(String sentence)
	{
		while(sentence.indexOf("a") != -1)
		{
			int x = sentence.indexOf("a");
			sentence = sentence.substring(0,x) + "@" + sentence.substring(x+1);
		}
		return sentence;
	}
}