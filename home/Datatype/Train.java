class Train
{
public static void Book(String source,String destination)
{
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
}
public static void Book(String source,String destination,int quantity)
{
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
	System.out.println("quantity:"+quantity);
}

public static void Book(String source,String destination,int quantity,int price)
{
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
	System.out.println("quantity:"+quantity);
	System.out.println("price:"+price);
}
public static void Cancel(String ticketNo)
{ 
	System.out.println("ticketNo:" +ticketNo);
}
public static void Cancel(String source,String destination)
{ 
	System.out.println("Source:"+source);
	System.out.println("Destination:"+destination);
}
}

