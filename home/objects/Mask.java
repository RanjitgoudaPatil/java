class Mask
{
	
	double cost;
	char size;
	String material;
	
	public Mask()
	{
			
	}
	 
	public Mask(double cost)
	{
		this.cost=cost;
	}	
	
	public Mask(char size)
	{
		this.size=size;	
	}
	
	public Mask(String material)
	{
		this.material=material;
	}
	
	public Mask(double cost, char size, String material)
	{
		this.cost=cost;
		this.size=size;
		this.material=material;
	}
	
	public Mask(double cost, char size)
	{
		this.cost=cost;
		this.size=size;
	}






	
}