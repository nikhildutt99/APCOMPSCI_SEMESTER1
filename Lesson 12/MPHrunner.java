import java.util.Scanner;
public class MPHrunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = kb.nextInt();
		public int reverse()
		{
			int rem, revNum = 0;
			while(n != 0)
			{
				rem = n % 10;
				revNum = revNum * 10 + rem;
				n /= 10;
			}
			return revNum;
			
		}
		

	}
}