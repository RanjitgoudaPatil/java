class Lamp{
    String color="green";
	String quality="good";
	
	Lamp(String colorlocal,String qualitylocal)
	{
		System.out.println("Start the instanace");
		
		System.out.println("color"+color);
		System.out.println("quality"+quality);
	    System.out.println("colorlocal"+colorlocal);
		System.out.println("qualitylocal"+qualitylocal);
		
		color=colorlocal;
		quality=qualitylocal;
		
		System.out.println("colorlocal:"+colorlocal);
		System.out.println("qualitylocal:"+qualitylocal);
	}
	
	
}