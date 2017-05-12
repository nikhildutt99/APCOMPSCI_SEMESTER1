import java.util.ArrayList;
import java.util.Arrays;
public class toystore
{
	private ArrayList<toy> toyList;
	
	public toystore(){
		this.toyList = new ArrayList<toy>();
	}
	
	public toystore(String toys){
		this.toyList = new ArrayList<toy>();
		loadToys(toys);
	}
	
	public void loadToys(String ts){
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2){
			String name = toys.get(i);
			String type = toys.get(i+1);
			toy ty = getThatToy(name);
			if(ty == null){
				if(type.equals("Car")){
					toyList.add(new car(name));
				}
				else{
					toyList.add(new AFigure(name));
				}
			}
			else{
				for(toy t : toyList){
					if(name.equals(t.getName())){
						t.setCount(t.getCount()+1);
						break;
					}
				}
			}
		}
	}
	
	public toy getThatToy(String nm){
		if(toyList!=null){
			for(toy toy : toyList){
				if(toy.getName().equals(nm)){
					return toy;
				}
			}
		}
		return null;
	}
	
	public String getMostFrequentToy(){
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy toy : toyList){
			if(max < toy.getCount()){
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType(){
		int cars = 0;
		int figures = 0;
		for(toy toy : toyList){
			if(toy.getType().equals("Car")){
				cars++;
			}
			if(toy.getType().equals("AF")){
				figures++;
			}
		}
		if(cars > figures){
			return "Cars";
		}
		else if(figures > cars){
			return "Action Figures";
		}
		else{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString(){
		String output = "[";
		for(toy ty : toyList){
			if(ty != toyList.get(toyList.size()-1)){
				output += ty.toString() + ", ";
			}
			else{
				output += ty.toString() + "]";
			}
		}
		return output;
	}
}