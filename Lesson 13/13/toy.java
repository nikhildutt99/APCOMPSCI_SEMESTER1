public abstract class toy
{
	private String name;
	private int count;
	public toy(){
		name ="";
		count=1;
	}
	public toy(String n){
		name = n;
		count = 1;
	}
	public String getN(){
		return name;
	}
	public int getC(){
		return count;
	}
	public void setN(String n){
		name=n;
	}
	public void setC(int c){
		count+=c;
	}
	public abstract String getT();
	public String toString()
	{
		return "" + name + " "+ count;

	}
}		
	