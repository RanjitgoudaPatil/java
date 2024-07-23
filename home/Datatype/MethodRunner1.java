class MethodRunner1
{
	public static void main(String[] args)
	{
		System.out.println("Running main method");

		Method1.mName1("Skin");
		Method1.mName1("lungs");
		Method1.mName1("hair Loss");
		
		
	double price1=Method1.price("vitamin C");
	System.out.println("price:"+price1);
	double price2=Method1.price("vitamin B");
	System.out.println("price:"+price2);
	double price3=Method1.price("vitamin A");
	System.out.println("price:"+price3);
	
	
	boolean mahesh=Method1.doctor("mahesh");
	System.out.println("avalability:"+mahesh);
	boolean preethesh=Method1.doctor("preethesh");
	System.out.println("avalability:"+preethesh);
	boolean swastik=Method1.doctor("swastik");
	System.out.println("avalability:"+swastik);
	
	}
}