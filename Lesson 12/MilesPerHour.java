import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double milesperhour;
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		milesperhour = 0;
	}
	public MilesPerHour(int dis, int hr, int min)
	{
		distance = dis;
		hours = hr;
		minutes = min;
		milesperhour = 0;
	}
	public void setValues(int dis, int hr, int min)
	{
		distance = dis;
		hours = hr;
		minutes = min;
		milesperhour = 0;
	}
	public double getMPH()
	{
		milesperhour = Math.round(distance/(hours + minutes / 60.0));
		return milesperhour;
	}
	public int getDistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
}