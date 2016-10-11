public class less_2
{
	int player;
	int computer;
	String winner;
	
	public static void main(String[]args)
	{
		int player = 1 + (int)((Math.random()* 6));
		System.out.println("You rolled a " + player);
		int computer = 1 + (int)((Math.random()* 6));
		System.out.println("The computer rolled a " + computer);
		
	}
	public static rollDice()
	{
		if(player > computer)
		{
			winner = "Player";
			System.out.println("You are the winner!");
		}
		else
		{
			winner = "Computer";
			System.out.println("Computer is the winner!");
		}
	}
	
}