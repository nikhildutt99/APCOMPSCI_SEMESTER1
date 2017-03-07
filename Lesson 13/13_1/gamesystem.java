public class gamesystem
{
	private String platform;
	private int serialNo;
	
	public gamesystem()
	{
		this.platform = "";
	}
	public gamesystem(String p)
	{
		this.platform = p;
	}
	public String getPlatform()
	{
		return this.platform;
	}
	public int getSerial()
	{
		serialNo = (int)( Math.random() * 1000000000);
		return this.serialNo;
	}
}