import java.util.ArrayList;
import java.util.Arrays;

public class Lesson10Ex1
{	
	public static void main(String[]args)
	{
		Integer[] num = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> n = new ArrayList<> (Arrays.asList(num));
		
		for(int i=0;i<n.size();i++)
		{
			if(gFactor(n.get(i))==0)
            {
				n.remove(i);
                i--;
            }
		}
		System.out.println(n);
	}
	public static Integer gFactor(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return 1;
			}
			
		}
        return 0;
	}
}