public class king implements pieces{
	int x,y;
	
	public void movePiece(int xx, int yy){
		if(!(x+xx>7||x+xx<0||y+yy>7||y+yy<0)){
			if(xx==yy||xx==(-1)*yy||xx==0||yy==0){
				if(xx<=1 || yy<=1){
					x+=xx;
					y+=yy;
				}	
			}
		}
	}
	
	public String getType(){
		return "king";
	}
	
	public String placePiece(int xx, int yy){
		if(xx<=8 && yy<=8 && xx>0 && yy>0){
			x=xx;
			y=yy;
		}
		
		return "("+x+","+y+")";
	}
}