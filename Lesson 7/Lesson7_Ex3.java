import java.util.Scanner;
public class Lesson7_Ex3
{
	static int number;
	static int rev = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = kb.nextInt();
		System.out.printf("%d reversed is %d", number, getReverse(number));
	}
	public static int getReverse(int number)
	{
		int num = number;
		
		
		while(num > 0){
			rev *= 10;
			rev += num%10;
			num = num/10;
		}
		return rev;
	}
	
}