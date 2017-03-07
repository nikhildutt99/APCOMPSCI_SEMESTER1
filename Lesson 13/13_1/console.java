public abstract class console extends gamesystem
{
	public abstract String getController();
	
	public console()
	{
		super();
	}
	public console(String p)
	{
		super(p);
	}
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerial() + "\nController: " + getController();
	}
}