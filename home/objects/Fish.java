class Fish{
    int wieght=25;
	String size="medium";
	
	Fish(int wieghtlocal,String sizelocal)
	{
		System.out.println("Start the instanace");
		
		System.out.println("wieght"+wieght);
		System.out.println("size"+size);
	    System.out.println("wieghtlocal"+wieghtlocal);
		System.out.println("sizelocal"+sizelocal);
		
		wieght=wieghtlocal;
		size=sizelocal;
		
		System.out.println("wieghtlocal"+wieghtlocal);
		System.out.println("sizelocal"+sizelocal);
	}
	
	
}