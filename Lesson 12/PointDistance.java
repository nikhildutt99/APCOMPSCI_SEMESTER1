import java.lang.Math.*;
public class PointDistance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	public PointDistance()
	{
		xOne = 0;
		yOne = 0;
		xTwo= 0;
		yTwo = 0;
		distance = 0;
	
	}
	public PointDistance(int x0, int y0, int xT, int yT)
	{
		xOne = x0;
		yOne = y0;
		xTwo = xT;
		yTwo = yT;
		distance = 0;
	}
	public void setValues(int x0, int y0, int xT, int yT)
	{
		xOne = x0;
		yOne = y0;
		xTwo = xT;
		yTwo = yT;
		
	}
	public int getxOne()
	{
		return xOne;
	}
	public int getyOne()
	{
		return yOne;
	}
	public int getxTwo()
	{
		return xTwo;
	}
	public int getyTwo()
	{
		return yTwo;
	}
	public double getDistance()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}