import java.util.Scanner;
public class Lesson8_Ex1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String sentence = kb.nextLine();
		replace (sentence);
		
	}
	public static String replace(String sentence)
	{
		if(sentence.indexOf(" ") < 0)
		{
			System.out.println(sentence);
		}
		else{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1);
			replace(sentence);
		}
		return "";
	}
}