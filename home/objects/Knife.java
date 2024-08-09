class Knife
{
	
	double weight;
	int height;
	
	public Knife(double weight, int height)
	{
		this.weight=weight;
		this.height=height;
	}
	
	public void message()
	{
		System.out.println("Knife Weight :"+this.weight);
		System.out.println("Knife Height :"+this.height);
		
	}
}