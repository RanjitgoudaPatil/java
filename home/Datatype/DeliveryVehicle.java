class DeliveryVehicle{
	
	public static void deliver(String item,String location){
		
		System.out.println("Running a deliver in a deliver Vehicle");
		System.out.println("Item:"+item);
		System.out.println("Location:"+location);
		Company.deliver(item,location);
		
		
	}
	
	
	
}