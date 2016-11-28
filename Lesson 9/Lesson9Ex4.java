import java.util.Scanner;
public class Lesson9Ex4
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       System.out.println("Please enter your starting number:");
       int start = kb.nextInt();
       System.out.println("Please enter your sequence size:");
       int size = kb.nextInt();


       int[] seq = new int[size];


       for(int i = 0; i < seq.length; i++){
           if(i==0||i==1)
               seq[i] = start;
           else
               seq[i] = seq[i-2] + seq[i-1];
           System.out.print(seq[i] + " ");
       }
   }
}


