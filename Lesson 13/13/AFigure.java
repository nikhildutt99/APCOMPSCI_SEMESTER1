public class AFigure extends toy
{
	public AFigure()
	{
		super();
	}
	public AFigure(String n){
		super(n);
	}
	public String getN(){
		return super.getN();
	}
	public int getC(){
		return super.getC();
	}
	public void setN(String n){
		super.setN(n);
	}
	public void setC(int c){
		super.setC(c);
	}
	public String getT(){
		return "action figure";
	}
	public String toString(){
		return super.toString();
	}
	
}