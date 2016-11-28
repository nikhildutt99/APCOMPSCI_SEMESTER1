import java.util.Scanner;
public class Lesson9Ex3 {
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       int [] numbers = new int[10];
       for(int i = 0; i < numbers.length; i++)
           numbers[i]=(int)(Math.random() * 100) + 1;
       System.out.println("Numbers: ");
       for(int n : numbers)
           System.out.print(n + "\n");
       System.out.println("");
       System.out.println("The average of your numbers is " + average(numbers));
   }
   public static float average(int[] num)
   {
       float sum = 0;
       for(int n : num)
           sum += n;
       return sum/((float) num.length);
   }


}
