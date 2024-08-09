class Rocket{
   String country;
   int speed;
   double fuelCapacity=2000;
   int noOfThrusters;
   
   void display()
   {
	   System.out.println("country:"+this.country);
	   System.out.println("speed:"+this.speed);
	    System.out.println("fuelCapacity:"+this.fuelCapacity);
		System.out.println("noOfThrusters:"+this.noOfThrusters);
		
	   
   }
   
   Rocket(int noOfThrusters)
   {
	   this.noOfThrusters=noOfThrusters;
   }
   public void setcountry(String country)
	{
		this.country=country;
	}
	
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	
	
}
/*Rocket: country,speed,fuelCapacity,noOfThrusters*/