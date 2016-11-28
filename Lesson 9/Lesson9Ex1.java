import java.util.Scanner;
public class Lesson9Ex1
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       String[] words = new String[5];
       System.out.println("Please enter 5 words:");
       for (int i = 0; i < words.length; i++)
           words[i] = kb.next();


       System.out.println("In order: ");
       for (String word : words)
           System.out.println(word);
System.out.println(" ");
       System.out.println("Reversed: ");
       for (String word : words)
           System.out.println(reverse(word));
   }


   public static String reverse(String wor)
   {
       String reverse = "";
       for (int i = 1; i <= wor.length(); i++)
           reverse += wor.charAt(wor.length() - i);
       return reverse;
   }
}