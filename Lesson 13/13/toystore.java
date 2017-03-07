import java.util.ArrayList;
import java.util.Arrays;

public class toystore
{
	private ArrayList<toy> toyList = new ArrayList<>();
	
	public toystore()
	{
		toyList = null;
	}
	public toystore(String ts)
	{
		loadToys(ts);
	}
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			toy t = getThatToy(name);
			if (t == null)
			{
				if (type.equals("Car"))
				{
					toyList.add(new car(name));
				}
				else if (type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	public toy getThatToy(String nm)
	{
		for(toy i : toyList)
		{
			if(i.getName().equals(nm))
			{
				return i;
			}
		}
		return null;
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy i : toyList)
		{
			if(max < i.getCount())
			{
				max = i.getCount();
				name = i.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figs = 0;
		for(toy i : toyList)
		{
			if(i.getType().equals("Car"))
			{
				cars =+ 1;
			}
			if(i.getType().equals("AF"))
			{
				figs =+ 1;
			}
		}
		if(cars > figs)
		{
			return "Cars";
		}
		if(figs > cars)
		{
			return "Action figures";
		}
		else
		{
			return "Equal numbers of both";
		}
	}
	public String toString()
	{
		return ""+toyList;
	}
}