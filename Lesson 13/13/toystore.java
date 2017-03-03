import java.util.ArrayList;
public class toystore
{
	ArrayList<toy> t = new ArrayList<toy>();
	
	public toystore()
	{
		t.add(new AFigure(""));
		t.add(new car(""));
	}
	
	public toystore(String list)
	{
		loadT(list);
	}
	
	public void loadT(String list)
	{
		String[] s = list.split(", ");
		
		for(int i=0;i<s.length;i+=2)
		{
			String name = s[i];
			String type = s[i+1];
			
			if(getToy(name)==null)
			{
				if(type.equals("Car"))
					t.add(new car(name));
				if(type.equals("AF"))
					t.add(new AFigure(name));
			}
			else
				getToy(name).setC(1);
		}
	}
	
	public toy getToy(String n)
	{
		for(toy b: t)
		{
			if(b.getN().equals(n))
				return b;
		}
		return null;
	}
	public String getFToy()
	{
		String name="";
		int max=0;
		for(toy b: t)
		{
			if(max<b.getC())
			{
				max=b.getC();
				name=b.getN();
			}	
		}
		return name;
	}
	
	public String getFType()
	{
		int cars=0;
		int f=0;
		
		for(toy b: t)
		{
			if(b.getT().equals("AF"))
				f+=1;
			if(b.getT().equals("Car"))
				cars+=1;
		}
		if(cars>f)
			return "cars";
		if(f>cars)
			return "f";
		else
			return "cars";
	}
	
	public String toString()
	{
		String s="";
		for(toy b: t)
		{
			s+=b.getN()+" ";
			s+=b.getC()+" ";
		}		
		return s;		
	}
	
}