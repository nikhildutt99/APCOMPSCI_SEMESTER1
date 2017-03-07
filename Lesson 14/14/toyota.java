public class toyota implements location
{
	private double[] location = new double[2];
	public toyota()
	{
		location[0] = 0;
		location[1] = 0;
	}
	public toyota(String coords)
	{
		String[] coordinates = coords.split(", ");
		location[0] = Double.parseDouble(coordinates[0]);
		location[1] = Double.parseDouble(coordinates[1]);
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