/*Chocolate: brand,price,flavour,size*/

class Chocolate{
   String brand;
   double price;
   String flavour="Milk Chocolate";
    String size;
   
   void display()
   {
	   System.out.println("brand:"+this.brand);
	   System.out.println("price:"+this.price);
	    System.out.println("flavour:"+this.flavour);
		System.out.println("size:"+this.size);
		
	   
   }
   
   Chocolate(String size)
   {
	   this.size=size;
   }
   public void brand(String brand)
	{
		this.brand=brand;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	
}
/*Rocket: country,speed,fuelCapacity,noOfThrusters*/