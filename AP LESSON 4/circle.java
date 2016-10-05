import java.util.Scanner; 
 
 
 public class circle 
{ 
	static double radius; 
 	static double area; 
 	 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		 
		System.out.println("Please enter the radius:"); 
 		radius = kb.nextDouble(); 
 		 
 		print(); 
 	} 
 	 
 	public static double Area() 
 	{ 
		 
	} 

 
 	public static void print() 
 	{ 
 		System.out.printf("The area of a circle with a radius of %.5f is %.5f.", radius, Area()); 
 	} 
 } 
