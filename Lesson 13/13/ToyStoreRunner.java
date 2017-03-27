public class ToyStoreRunner
{
	public static void main(String[]args){
		String toys = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		toystore ts = new toystore(toys);
		System.out.println("List...\n" + toys + "\n" + ts + "\n");
		System.out.println("Most Frequent Toy: " + ts.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + ts.getMostFrequentType());
	}
}