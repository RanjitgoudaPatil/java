class Aeroplane
{
	
	String company;
	int noOfSeats;
	double ticket;
	String source;
	String destination;
	
	public Aeroplane()
	{
		
	}
	
	public Aeroplane(String company, int noOfSeats, double ticket, String source, String destination)
	{
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticket=ticket;
		this.source=source;
		this.destination=destination;
		
	}
	
	public Aeroplane(String company, String source, String destination)
	{
		this.company=company;
		this.source=source;
		this.destination=destination;
	}
	
	public Aeroplane(String company, double ticket,  String source, String destination)
	{
		this.company=company;
		this.ticket=ticket;
		this.source=source;
		this.destination=destination;
		
	}
	
}