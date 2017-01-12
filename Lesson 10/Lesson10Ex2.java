import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson10Ex2
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter an equation: ");
	
	String expression = sc.nextLine();
	
	ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
	
	System.out.println(doEquation(equation));
	}

	public static ArrayList<String> doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i < equation.size())

		{
			if(equation.get(i).equals("*")|| equation.get(i).equals("/"))

			{
				if(equation.get(i).equals("*"))

				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))*Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, "" + ((double)(Integer.parseInt(equation.get(i-1)))/Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				
				equation.remove(i);
			}
			i++;
		}
		i = 0;
		while(i < equation.size())
		{


			if(equation.get(i).equals("+")|| equation.get(i).equals("-"))

			{
				if(equation.get(i).equals("+"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))+Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))-Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				
				equation.remove(i);
			}
			i++;
		}
		return equation;
	}
	
	


}
