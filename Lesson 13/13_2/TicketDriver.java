public class TicketDriver
{
	public static void main(String[]args){
		Ticket wu = new WalkUp();
		Ticket ad = new Advance(10);
		Ticket sa = new StudentAdvance(5);
		
		System.out.println(wu + "\n" + ad + "\n" + sa);
	}
}