public class pc extends gamesystem
{
	public String getPlatform()
	{
		return "PC";
	}
	public String systemInput()
	{
		return "KB + M";
	}
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerial() + "\nSystem input: " + systemInput();
	}
}