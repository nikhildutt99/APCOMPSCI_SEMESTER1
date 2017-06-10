public class pawn implements pieces{
	
	int x;
	int y;
	
	public void movePiece(int xx, int yy){
		if(!(x+xx>7||x+xx<0||y+yy>7||y+yy<0)){
			if(xx==0||yy==0){
				x+=xx;
				y+=yy;
			}
		}
	}
	
	public String getType(){
		return "pawn";
	}
	
	public String placePiece(int xx, int yy){
		if(xx<=8 && yy<=8 && xx>0 && yy>0){
			x=xx;
			y=yy;
			return "("+x+","+y+")";
		}
		else
			return "";
	}
}