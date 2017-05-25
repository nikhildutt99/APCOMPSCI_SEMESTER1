public class rook implements pieces{
	
	int x,y;
	
	public void movePiece(int xx, int yy){
		if(!(x+xx>7||x+xx<0||y+yy>7||y+yy<0)){
			if(xx==0 || yy==0){
				x+=xx;
				y+=yy;
			}
		}
	}
	
	public String getType(){
		return "rook";
	}
	
	public String placePiece(int xx, int yy){
		if(xx<=7 && yy<=7 && xx>=0 && yy>=0){
			x=xx;
			y=yy;
		}
		
		return ""+x+y;
	}
}