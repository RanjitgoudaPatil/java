class AeroplaneRunner
{
	
	public static void main(String[] args)
	{
		
		Aeroplane aeroplane= new Aeroplane();
		System.out.println("Company :"+aeroplane.company);
		System.out.println("No Of Seats :"+aeroplane.noOfSeats);
		System.out.println("Ticket :"+aeroplane.ticket);
		System.out.println("Source :"+aeroplane.source);
		System.out.println("Destination :"+aeroplane.destination);
		System.out.println("-------------------");
		
		Aeroplane aeroplane1= new Aeroplane("King Fisher", 650, 15000,"Chennai", "Delhi");
		System.out.println("Company :"+aeroplane1.company);
		System.out.println("No Of Seats :"+aeroplane1.noOfSeats);
		System.out.println("Ticket :"+aeroplane1.ticket);
		System.out.println("Source :"+aeroplane1.source);
		System.out.println("Destination :"+aeroplane1.destination);
		System.out.println("-------------------");
		
		Aeroplane aeroplane2= new Aeroplane("King Fisher", "Chennai", "Delhi");
		System.out.println("Company :"+aeroplane2.company);
		System.out.println("No Of Seats :"+aeroplane2.noOfSeats);
		System.out.println("Ticket :"+aeroplane2.ticket);
		System.out.println("Source :"+aeroplane2.source);
		System.out.println("Destination :"+aeroplane2.destination);
		System.out.println("-------------------");
		
		Aeroplane aeroplane3= new Aeroplane("King Fisher", 15000, "Chennai", "Delhi");
		System.out.println("Company :"+aeroplane3.company);
		System.out.println("No Of Seats :"+aeroplane3.noOfSeats);
		System.out.println("Ticket :"+aeroplane3.ticket);
		System.out.println("Source :"+aeroplane3.source);
		System.out.println("Destination :"+aeroplane3.destination);
		System.out.println("-------------------");
		
	}
	
	
	
}