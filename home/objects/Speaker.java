class Speaker{
   String brand;
   String size;
   double cost=1000;
   String output;
   
   void display()
   {
	   System.out.println("Brand:"+this.brand);
	   System.out.println("Size:"+this.size);
	    System.out.println("cost:"+this.cost);
		System.out.println("output:"+this.output);
		
	   
   }
   
   Speaker(String output)
   {
	   this.output=output;
   }
   public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public void setSize(String size)
	{
		this.size=size;
	}
	
	
}