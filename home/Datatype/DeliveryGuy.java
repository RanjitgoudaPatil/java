class DeliveryGuy{
	
	public static void deliver(String item){
		System.out.println("Running a deliver in a delivery guy");
		System.out.println("Item:"+item);
		DeliveryVehicle.deliver(item,"Xworkz");
	}
	
	
	
}