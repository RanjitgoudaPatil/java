class Owner
{
	String name="jagannath";
	int age=50;
	String gender;
	
	Owner()
	{
		
	}
	
	Owner(String gender)
	{
		this.gender=gender;
	}
	public void screen()
	{
		System.out.println("Owner Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("gender:"+this.gender);

	}
}

class Hotel
{
	String name="Upadya";
	Owner owner=new Owner("male");
	
	public void screen()
	{
		System.out.println("Hotel Name:"+this.name);
		owner.screen();
	}
	
}


class HotelRunner
{
	public static void main(String[] args)
	{
		Hotel hotel=new Hotel();
		hotel.screen();
	}
}