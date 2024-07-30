class FileRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running a main");
		
		Rupee rupee=new Rupee();
		String rupeeName= rupee.name;
		String rupeeMaterial= rupee.material;
		int rupeequantity= rupee.quantity;
		
		System.out.println("Rupee Name:"+rupeeName);
		System.out.println("Rupee Material:"+rupeeMaterial);
		System.out.println("Rupee quantity:"+rupeequantity);
		System.out.println("--------------");
		
		AirCondition aircondition=new AirCondition();
		String brand= aircondition.brand;
	    double price=aircondition.price;
	    float rating=aircondition.rating;
		
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Rating:"+rating);
		System.out.println("--------------");
		
		Autorikshaw autorikshaw=new Autorikshaw();
		String company=autorikshaw.company;
	    double price1=autorikshaw.price;
	    int meilage=autorikshaw.meilage;
		
		System.out.println("Company:"+company);
		System.out.println("Price:"+price1);
		System.out.println("Meilage:"+meilage);
		System.out.println("--------------");
		
		AutoDriver autodriver=new AutoDriver();
		String name=autodriver.name;
	    double age=autodriver.age;
	    long mobileNo=autodriver.mobileNo;
		
		System.out.println("Driver Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Mobile No:"+mobileNo);
		System.out.println("--------------");
		
		Rapido rapido=new Rapido();
		String driverName=rapido.driverName;
	    double cost=rapido.cost;
	    int otp=rapido.otp;
		
		System.out.println("Driver name:"+driverName);
		System.out.println("Cost:"+cost);
		System.out.println("OTP:"+otp);
		System.out.println("--------------");
		
		CabCompany cab=new CabCompany();
		String company1=cab.company;
	    int noOfDriver=cab.noOfDriver;
	    int noOfCab=cab.noOfCab;
		
		System.out.println("Company:"+company1);
		System.out.println("no of driver:"+noOfDriver);
		System.out.println("no of cad:"+noOfCab);
		System.out.println("--------------");
		
		Bmtc bmtc=new Bmtc();
	    String busDriverName=bmtc.busDriverName;
	    int busNo=bmtc.busNo;
	    String location=bmtc.location;
		
		System.out.println("Bus Driver Name:"+busDriverName);
		System.out.println("Bus No:"+busNo);
		System.out.println("Location:"+location);
		System.out.println("--------------");
		
		FoodDeliveryCompany foodDelivery=new FoodDeliveryCompany();
		String foodDliveryApp=foodDelivery.foodDliveryApp;
	    String item=foodDelivery.item;
	    double bill=foodDelivery.bill;
		
		System.out.println("Food Delivery App:"+foodDliveryApp);
		System.out.println("Item:"+item);
	    System.out.println("Bill:"+bill);
		System.out.println("--------------");
	}	
	
	
	
	
	
	
}