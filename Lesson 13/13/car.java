public class car extends toy
{
	public car()
	{
		super();
	}
	public car(String n){
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
		return "car";
	}
	public String toString(){
		return super.toString();
	}
}