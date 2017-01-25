public class InventoryItems
{
	
	private String manufacturer, name, category;
	private int UPC, price;
	
	
	public InventoryItems()
	{
		
		manufacturer ="";
		name ="";
		category ="";
		UPC = 0;
		price = 0; 
	}
	
	public InventoryItems(String manu, String n)
	{
		manufacturer = manu;
		name = n;
		category = "Undefined";
		UPC = (int)(Math.random()*1000000) + 1;
		price = 0;
	}
	public InventoryItems(String manu, String n, String cat, int p)
	{
		manufacturer = manu;
		name = n;
		category = cat;
		UPC = (int)(Math.random()*1000000) + 1;
		price = p;
	}
	
	
	public void setOptions(String cat, int p)
	{
		category = cat;
		price = p;
	}
	
	
	public String toString()
	{
		return "Inventory Information...\nItem Manufacturer"  + manufacturer + 
										"nItem Name"  + name + 
										"nItem Category"  + category + 
										"nItem Price $" + price +										
										"nUPC #"  + UPC;
	}
	
}