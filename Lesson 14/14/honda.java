public class honda implements location
{
	private double[] location = new double[2];
	public honda()
	{
		location[0] = 0;
		location[1] = 1;
	}
	public honda(double[] loc)
	{
		location[0] = loc[0];
		location[1] = loc[1];
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	public void move(double xm, double ym)
	{
		location[0] += xm;
		location[1] += ym;
	}
	public double[] getLoc()
	{
		return location;
	}
}