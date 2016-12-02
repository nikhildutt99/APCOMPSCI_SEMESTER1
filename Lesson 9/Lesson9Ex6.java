import java.util.Random; 
 public class Lesson9Ex6 
 { 
 	static int[] numbers; 
 	static Random rng = new Random(); 
 	 
 	public static void main(String[] args) 
 	{ 
 		numbers = new int[10]; 
 		fillArray(); 
 		 
 		System.out.println("For the following numbers... "); 
		printArray(); 
 		System.out.println(); 
 		System.out.printf("The biggest number is %d.", getBiggest()); 
 	} 
	 	 
 	public static void fillArray() 
 	{ 
 		for(int i = 0; i < numbers.length; i++) 
			numbers[i] = rng.nextInt(100); 
 	} 
 	 
 	public static void printArray() 
 	{ 
 		for(int c : numbers) 
 			System.out.print(c+" "); 
 		 
 	} 
 	 
 	public static int getBiggest() 
 	{ 
 		int max = 0; 
 		for(int c : numbers){ 
 			if(c > max) 
 				max = c; 
 		} 
 		return max; 
 	} 
 } 
