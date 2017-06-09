import java.util.ArrayList;
public class board{
	
	String[] position; 
	String[] position0;
	ArrayList<pieces> list;
	ArrayList<pieces> list0;
	int queencount,queen0count,knight0count,knightcount,rookcount,rook0count,bishopcount,bishop0count,pawncount,pawn0count;
	
	public board(pieces p1, pieces p2, pieces p3, pieces p4, pieces p5, pieces p6, pieces p7, pieces p8){
		fillGoodPieces(p1, p2, p3, p4);
		fillBadPieces(p5, p6, p7, p8);
		placePieces();
	}
	
	public void fillGoodPieces(pieces p1, pieces p2, pieces p3, pieces p4){
		
		list = new ArrayList<>();
		list.add(p1);list.add(p2);list.add(p3);list.add(p4);
		
		queencount=0; int i=0;
		while(i<4){
			if(list.get(i).getType().equals("queen"))
				queencount+=1;
			i++;
		}
		knightcount=0;  i=0; 
		while(i<4){
			if(list.get(i).getType().equals("knight"))
				knightcount+=1;
			i++;
		}
		rookcount=0;  i=0;
		while(i<4){
			if(list.get(i).getType().equals("rook"))
				rookcount+=1;
			i++;
		}
		bishopcount=0;  i=0;
		while(i<4){
			if(list.get(i).getType().equals("bishop"))
				bishopcount+=1;
			i++;
		}
		pawncount=0;  i=0;
		while(i<4){
			if(list.get(i).getType().equals("pawn"))
				pawncount+=1;
			i++;
		}
		
		if(queencount >2 || knightcount >2 || pawncount>4 || bishopcount>2 || rookcount>2){
			while(list.size()>=0)
				list.remove(0);
			System.out.println("invalid inputs");
		}
	}	
		
	public void fillBadPieces(pieces p1, pieces p2, pieces p3, pieces p4){
		
		list0 = new ArrayList<>();
		list0.add(p1);list0.add(p2);list0.add(p3);list0.add(p4);
		
		queen0count=0; int i=0;
		while(i<4){
			if(list0.get(i).getType().equals("queen"))
				queen0count+=1;
			i++;
		}
		knight0count=0;  i=0;
		while(i<4){
			if(list0.get(i).getType().equals("knight"))
				knight0count+=1;
			i++;
		}
		rook0count=0;  i=0;
		while(i<4){
			if(list0.get(i).getType().equals("rook"))
				rook0count+=1;
			i++;
		}
		bishop0count=0;  i=0;
		while(i<4){
			if(list0.get(i).getType().equals("bishop"))
				bishop0count+=1;
			i++;
		}
		pawn0count=0;  i=0;
		while(i<4){
			if(list0.get(i).getType().equals("pawn"))
				pawn0count+=1;
			i++;
		}
		
		if(queen0count >2 || knight0count >2 || pawn0count>4 || bishop0count>2 || rook0count>2){
			while(list0.size()>=0)
				list0.remove(0);
			System.out.println("invalid inputs"); 
		}
			
	}
	
	public void placePieces(){
		
		position = new String[5];
		position0 = new String[5];
		
		if(queencount==1 && bishopcount==1 && rookcount==2){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("queen"))
					break;
			}
			for(j=0; j<4; j++){
				if(list.get(j).getType().equals("bishop"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("rook"))
					break;
			}
			for(m=k+1; m<4; m++){
				if(list.get(m).getType().equals("rook"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "queen 1 is at " + list.get(i).placePiece(4,4);
			position[1] = "bishop 1 is at " + list.get(j).placePiece(6,2);
			position[2] = "rook 1 is at " + list.get(k).placePiece(8,1);
			position[3] = "rook 2 is at " + list.get(m).placePiece(7,6); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";			
		}
		
		else if(bishopcount==2 && knightcount==1 && pawncount==1){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("bishop"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("bishop"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=0; m<4; m++){
				if(list.get(m).getType().equals("pawn"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "bishop 1 is at " + list.get(i).placePiece(4,5);
			position[1] = "bishop 2 is at " + list.get(j).placePiece(5,2);
			position[2] = "knight is at " + list.get(k).placePiece(8,1);
			position[3] = "pawn is at " + list.get(m).placePiece(7,5); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";
		}
		
		else if(queencount==1 && rookcount==1 && pawncount==2){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("queen"))
					break;
			}
			for(j=0; j<4; j++){
				if(list.get(j).getType().equals("pawn"))
					break;
			}
			for(k=j+1; k<4; k++){
				if(list.get(k).getType().equals("pawn"))
					break;
			}
			for(m=0; m<4; m++){
				if(list.get(m).getType().equals("rook"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "queen is at " + list.get(i).placePiece(2,5);
			position[1] = "pawn 1 is at " + list.get(j).placePiece(5,4);
			position[2] = "pawn 2 is at " + list.get(k).placePiece(7,1);
			position[3] = "rook is at " + list.get(m).placePiece(7,6); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";
		}
		
		else if(knightcount==1 && rookcount==1 && pawncount==1 && bishopcount==1){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("pawn"))
					break;
			}
			for(j=0; j<4; j++){
				if(list.get(j).getType().equals("bishop"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=0; m<4; m++){
				if(list.get(m).getType().equals("rook"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "pawn is at " + list.get(i).placePiece(2,4);
			position[1] = "bishop is at " + list.get(j).placePiece(4,4);
			position[2] = "knight is at " + list.get(k).placePiece(8,3);
			position[3] = "rook is at " + list.get(m).placePiece(7,6); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(knightcount==1 && rookcount==1 && pawncount==1 && queencount==1){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("pawn"))
					break;
			}
			for(j=0; j<4; j++){
				if(list.get(j).getType().equals("queen"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=0; m<4; m++){
				if(list.get(m).getType().equals("rook"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "pawn is at " + list.get(i).placePiece(2,4);
			position[1] = "queen is at " + list.get(j).placePiece(4,5);
			position[2] = "knight is at " + list.get(k).placePiece(5,3);
			position[3] = "rook is at " + list.get(m).placePiece(7,2); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(rookcount==1 && pawncount==2){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("pawn"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("pawn"))
					break;
			}
			for(k=j+1; k<4; k++){
				if(list.get(k).getType().equals("pawn"))
					break;
			}
			for(m=0; m<4; m++){
				if(list.get(m).getType().equals("rook"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "pawn is at " + list.get(i).placePiece(2,4);
			position[1] = "pawn is at " + list.get(j).placePiece(4,1);
			position[2] = "pawn is at " + list.get(k).placePiece(5,7);
			position[3] = "rook is at " + list.get(m).placePiece(6,2); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(pawncount==4){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("pawn"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("pawn"))
					break;
			}
			for(k=j+1; k<4; k++){
				if(list.get(k).getType().equals("pwan"))
					break;
			}
			for(m=k+1; m<4; m++){
				if(list.get(m).getType().equals("pawn"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "pawn 1 is at " + list.get(i).placePiece(6,6);
			position[1] = "pawn 2 is at " + list.get(j).placePiece(8,3);
			position[2] = "pawn 3 is at " + list.get(k).placePiece(4,8);
			position[3] = "pawn 4 is at " + list.get(m).placePiece(6,1); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(knightcount==2 && rookcount==2){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("rook"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("rook"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=k+1; m<4; m++){
				if(list.get(m).getType().equals("knight"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "rook is at " + list.get(i).placePiece(1,5);
			position[1] = "rook is at " + list.get(j).placePiece(2,6);
			position[2] = "knight is at " + list.get(k).placePiece(2,5);
			position[3] = "knight is at " + list.get(m).placePiece(4,5); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(knightcount==1 && pawncount==3){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("pawn"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("pawn"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=j+1; m<4; m++){
				if(list.get(m).getType().equals("pawn"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "pawn is at " + list.get(i).placePiece(7,7);
			position[1] = "pawn is at " + list.get(j).placePiece(2,5);
			position[2] = "knight is at " + list.get(k).placePiece(2,1);
			position[3] = "pawn is at " + list.get(m).placePiece(4,4); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
	
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(bishopcount==1 && pawncount==2 && queencount==1){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("bishop"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("bishop"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("pawn"))
					break;
			}
			for(m=k+1; m<4; m++){
				if(list.get(m).getType().equals("pawn"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "bishop is at " + list.get(i).placePiece(5,5);
			position[1] = "bishop is at " + list.get(j).placePiece(2,2);
			position[2] = "pawn is at " + list.get(k).placePiece(7,4);
			position[3] = "pawn is at " + list.get(m).placePiece(3,8); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(pawncount==2 && bishopcount==2){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("pawn"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("pawn"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("bishop"))
					break;
			}
			for(m=k+1; m<4; m++){
				if(list.get(m).getType().equals("bishop"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "pawn is at " + list.get(i).placePiece(1,4);
			position[1] = "pawn is at " + list.get(j).placePiece(5,5);
			position[2] = "bishop is at " + list.get(k).placePiece(5,8);
			position[3] = "bishop is at " + list.get(m).placePiece(6,4); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(knightcount==2 && bishopcount==2){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("bishop"))
					break;
			}
			for(j=i+1; j<4; j++){
				if(list.get(j).getType().equals("bishop"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=k+1; m<4; m++){
				if(list.get(m).getType().equals("knight"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "bishop is at " + list.get(i).placePiece(1,1);
			position[1] = "bishop is at " + list.get(j).placePiece(8,2);
			position[2] = "knight is at " + list.get(k).placePiece(6,3);
			position[3] = "knight is at " + list.get(m).placePiece(3,1); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else if(knightcount==2 && rookcount==1 && queencount==1){
			int i, j, k, m, t;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("queen"))
					break;
			}
			for(j=0; j<4; j++){
				if(list.get(j).getType().equals("knight"))
					break;
			}
			for(k=j+1; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=0; m<4; m++){
				if(list.get(m).getType().equals("rook"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = "queen is at " + list.get(i).placePiece(1,7);
			position[1] = "knight is at " + list.get(j).placePiece(6,6);
			position[2] = "knight is at " + list.get(k).placePiece(4,2);
			position[3] = "rook is at " + list.get(m).placePiece(4,1); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		else{
			int i, j, k, m, t, a;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("pawn"))
					break;
			}
			for(a=0; a<4; a++){
				if(list.get(a).getType().equals("bishop"))
					break;
			}
			for(j=0; j<4; j++){
				if(list.get(j).getType().equals("queen"))
					break;
			}
			for(k=0; k<4; k++){
				if(list.get(k).getType().equals("knight"))
					break;
			}
			for(m=0; m<4; m++){
				if(list.get(m).getType().equals("rook"))
					break;
			}
			for(t=0; t<4; t++){
				if(list.get(t).getType().equals("king"))
					break;
			}
			
			position[0] = list.get(0).getType() + " is at " + list.get(0).placePiece(5,6);
			position[1] = list.get(1).getType() + " is at " + list.get(1).placePiece(2,7);
			position[2] = list.get(2).getType() + " is at " + list.get(2).placePiece(8,4);
			position[3] = list.get(3).getType() + " is at " + list.get(3).placePiece(6,5); 
			
			if(list0.get(0).getType().equals("queen"))
				position0[0] = "enemy queen at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("bishop"))
				position0[0] = "enemy bishop at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("knight"))
				position0[0] = "enemy knight at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("pawn"))
				position0[0] = "enemy pawn at" + list0.get(0).placePiece(1,8);
			else if(list0.get(0).getType().equals("rook"))
				position0[0] = "enemy rook at" + list0.get(0).placePiece(1,8);
			
			if(list0.get(1).getType().equals("queen"))
				position0[1] = "enemy queen at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("bishop"))
				position0[1] = "enemy bishop at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("knight"))
				position0[1] = "enemy knight at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("pawn"))
				position0[1] = "enemy pawn at" + list0.get(1).placePiece(2,6);
			else if(list0.get(1).getType().equals("rook"))
				position0[1] = "enemy rook at" + list0.get(1).placePiece(2,6);
			
			if(list0.get(2).getType().equals("queen"))
				position0[2] = "enemy queen at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("bishop"))
				position0[2] = "enemy bishop at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("knight"))
				position0[2] = "enemy knight at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("pawn"))
				position0[2] = "enemy pawn at" + list0.get(2).placePiece(3,4);
			else if(list0.get(2).getType().equals("rook"))
				position0[2] = "enemy rook at" + list0.get(2).placePiece(3,4);

			if(list0.get(3).getType().equals("queen"))
				position0[3] = "enemy queen at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("bishop"))
				position0[3] = "enemy bishop at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("knight"))
				position0[3] = "enemy knight at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("pawn"))
				position0[3] = "enemy pawn at" + list0.get(3).placePiece(4,7);
			else if(list0.get(3).getType().equals("rook"))
				position0[3] = "enemy rook at" + list0.get(3).placePiece(4,7);
				
			
			position[4] = "king is at (7,1)";
			position0[4] = "enemy king is at (2,8)";	
		}
		
		for(int i=0; i<5; i++){
			System.out.println(position[i]);
		}
		
		for(int i=0; i<5; i++){
			System.out.println(position0[i]);
		}
	}	
}