public class user
{
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
   
   public user()
   {
		firstName = "";
		lastName = "";
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
   }
   
   public user(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public user(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void mod(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
	}
	
	public String toString()
	{
		return "<<<<<<<<<<<<<<<<Customer Info...>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}
}