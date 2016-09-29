import java.util.Scanner; 

 
 public class bmi 
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Please enter you weight in pounds."); 
 		int weight = keyboard.nextInt(); 
 		System.out.println("Thank you. Now, please enter your height in inches."); 
 		int height = keyboard.nextInt(); 
 		System.out.println("Calculating..."); 
 		int bmi = (weight*703) / (height*height); 
 		System.out.println("Your BMI Rating is " + bmi + "."); 
 	} 
 } 
