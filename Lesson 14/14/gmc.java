public class gmc implements location
{
	private double x, y;
	public gmc()
	{
		this.x = 0;
		this.y = 0;
	}
	public gmc(double xc, double yc)
	{
		this.x = xc;
		this.y = yc;
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	public void move(double xm, double ym)
	{
		this.x += xm;
		this.y += ym;
	}
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
}