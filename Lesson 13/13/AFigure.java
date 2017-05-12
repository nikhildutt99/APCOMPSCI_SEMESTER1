public class AFigure extends toy
{
	private String name;
	private int count;
	
	public AFigure(){
		super();
	}
	public AFigure(String n){
		super(n);
	}
	public String getType(){
		return "Action Figure";
	}
}