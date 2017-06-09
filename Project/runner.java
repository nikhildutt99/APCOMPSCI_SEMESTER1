import java.util.Scanner;
public class runner {
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Each side gets a maximum of four pieces");
		
		System.out.println("Please enter your first piece");
		String s1 = kb.nextLine().trim().toLowerCase();
		pieces p1 = null;
		if(s1.equals("queen"))
			p1 = new queen();
		if(s1.equals("bishop"))
			p1 = new bishop();
		if(s1.equals("king"))
			p1 = new king();
		if(s1.equals("knight"))
			p1 = new knight();
		if(s1.equals("rook"))
			p1 = new rook();
		if(s1.equals("pawn"))
			p1 = new pawn();
		
		System.out.println("Please enter your second piece");
		String s2 = kb.nextLine().trim().toLowerCase();
		pieces p2 = null;
		if(s2.equals("queen"))
			p2 = new queen();
		if(s2.equals("bishop"))
			p2 = new bishop();
		if(s2.equals("king"))
			p2 = new king();
		if(s2.equals("knight"))
			p2 = new knight();
		if(s2.equals("rook"))
			p2 = new rook();
		if(s2.equals("pawn"))
			p2 = new pawn();
		
		System.out.println("Please enter your third piece");
		String s3 = kb.nextLine().trim().toLowerCase();
		pieces p3 = null;
		if(s3.equals("queen"))
			p3 = new queen();
		if(s3.equals("bishop"))
			p3 = new bishop();
		if(s3.equals("king"))
			p3 = new king();
		if(s3.equals("knight"))
			p3 = new knight();
		if(s3.equals("rook"))
			p3 = new rook();
		if(s3.equals("pawn"))
			p3 = new pawn();
		
		System.out.println("Please enter your last piece");
		String s4 = kb.nextLine().trim().toLowerCase();
		pieces p4 = null;
		if(s4.equals("queen"))
			p4 = new queen();
		if(s4.equals("bishop"))
			p4 = new bishop();
		if(s4.equals("king"))
			p4 = new king();
		if(s4.equals("knight"))
			p4 = new knight();
		if(s4.equals("rook"))
			p4 = new rook();
		if(s4.equals("pawn"))
			p4 = new pawn();
		
		System.out.println("Please enter the opponent's first piece");
		String s5 = kb.nextLine().trim().toLowerCase();
		pieces p5 = null;
		if(s5.equals("queen"))
			p5 = new queen();
		if(s5.equals("bishop"))
			p5 = new bishop();
		if(s5.equals("king"))
			p5 = new king();
		if(s5.equals("knight"))
			p5 = new knight();
		if(s5.equals("rook"))
			p5 = new rook();
		if(s5.equals("pawn"))
			p5 = new pawn();
		
		System.out.println("Please enter the opponent's second piece");
		String s6 = kb.nextLine().trim().toLowerCase();
		pieces p6 = null;
		if(s6.equals("queen"))
			p6 = new queen();
		if(s6.equals("bishop"))
			p6 = new bishop();
		if(s6.equals("king"))
			p6 = new king();
		if(s6.equals("knight"))
			p6 = new knight();
		if(s6.equals("rook"))
			p6 = new rook();
		if(s6.equals("pawn"))
			p6 = new pawn();
		
		System.out.println("Please enter the opponent's third piece");
		String s7 = kb.nextLine().trim().toLowerCase();
		pieces p7 = null;
		if(s7.equals("queen"))
			p7 = new queen();
		if(s7.equals("bishop"))
			p7 = new bishop();
		if(s7.equals("king"))
			p7 = new king();
		if(s7.equals("knight"))
			p7 = new knight();
		if(s7.equals("rook"))
			p7 = new rook();
		if(s7.equals("pawn"))
			p7 = new pawn();
		
		System.out.println("Please enter the opponent's last piece");
		String s8 = kb.nextLine().trim().toLowerCase();
		pieces p8 = null;
		if(s8.equals("queen"))
			p8 = new queen();
		if(s8.equals("bishop"))
			p8 = new bishop();
		if(s8.equals("king"))
			p8 = new king();
		if(s8.equals("knight"))
			p8 = new knight();
		if(s8.equals("rook"))
			p8 = new rook();
		if(s8.equals("pawn"))
			p8 = new pawn();
		
		board b = new board(p1, p2, p3, p4, p5, p6, p7, p8);
	}
}