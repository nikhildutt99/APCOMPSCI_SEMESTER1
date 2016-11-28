import java.util.Scanner;
public class Lesson9Ex2 {
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       String [] words = new String[5];
       System.out.println("Enter 5 words: ");
       for(int i = 0; i < words.length; i++)
       words[i]=kb.next();
       System.out.println(first(words));
   }
   public static String first(String[]word){
       for(String words : word)
           System.out.println(words.charAt(0));
       return "";
   }
}
