import java.util.ArrayList;
public class board{
	
	String[] position; 
	String[] position0;
	ArrayList<pieces> list;
	ArrayList<pieces> list0;
	int queencount,queen0count,knight0count,knightcount,rookcount,rook0count,bishopcount,bishop0count,pawncount,pawn0count;
	
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
		
		if(queencount >2 || knightcount >2 || pawncount>2 || bishopcount>2 || rookcount>2){
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
		
		if(queen0count >2 || knight0count >2 || pawn0count>2 || bishop0count>2 || rook0count>2){
			while(list0.size()>=0)
				list0.remove(0);
			System.out.println("invalid inputs");
		}
			
	}
	
	public void placePieces(){
		
		position = new String[4];
		position0 = new String[4];
		
		if(queencount==1 && bishopcount==1 && rookcount==2){
			int i, j, k, m;
			for(i=0; i<4; i++){
				if(list.get(i).getType().equals("queen"))
					break;
			}
			for(j=i+1; j<4; j++){
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
			
			position[0] = "queen 1 is at " + list.get(i).placePiece(4,4);
			position[1] = "bishop 1 is at " + list.get(j).placePiece(6,2);
			position[2] = "rook 1 is at " + list.get(k).placePiece(8,1);
			position[3] = "rook 2 is at " + list.get(m).placePiece(7,6);
			
		}
	}
	
}