class MethodRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main method");

		Method.Country("India");
		Method.Country("Bangladesh");
		Method.Country("Srilanka");
		Method.Country("Nepal");
		Method.Country("Japan");
		
	double price1=Method.price("pen");
	System.out.println("price1:"+price1);
	double price2=Method.price("glass");
	System.out.println("price2:"+price2);
	double price3=Method.price("bat");
	System.out.println("price3:"+price3);
	double price4=Method.price("ball");
	System.out.println("price4:"+price4);
	double price5=Method.price("stumps");
	System.out.println("price5:"+price5);
	
	String pName1=Method.pName("movie1");
	System.out.println("producer name:"+pName1);
	String pName2=Method.pName("movie2");
	System.out.println("producer name:"+pName2);
	String pName3=Method.pName("movie3");
	System.out.println("producer name:"+pName3);
	String pName4=Method.pName("movie4");
	System.out.println("producer name:"+pName4);
	String pName5=Method.pName("movie5");
	System.out.println("producer name:"+pName5);
	}
}