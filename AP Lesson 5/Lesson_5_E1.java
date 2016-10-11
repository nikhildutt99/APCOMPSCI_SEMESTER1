
public class Lesson_5_E1
{
	public static void main(String[]args)
	{
	 	int num = 1 + (int)((Math.random()* 6));
		System.out.println("You rolled a " + num);
		int num1 = 1 + (int)((Math.random()* 6));
		System.out.println("The computer rolled a " + num1);
		if (num > num1)
		{
			System.out.println("You Win!");
		}
		else
		{
			System.out.println("Computer wins!");
		}
		
			
		
		
	}
}