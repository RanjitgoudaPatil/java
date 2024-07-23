//A.Write a class with below methods
//1.Method to take code and return country: 5 condition
//2.Method to take item and return price: 5 condition
//3.Method to take movie name and return produer name:5 condition

class Method{
	public static String Country(String name)
	{
		System.out.println("Country name is");
		System.out.println("Country:"+name);
		
       if(name=="India")
	   {
		   
		   return "Country";
	   }
	   else if(name=="Bangladesh")
	   {
		  ``
		   return "Country";
	   }
	    else if(name=="Srilanka")
	   {
		   
		   return "Country";
	   }
	    else if(name=="Nepal")
	   {
		   
		   return "Country";
	   }
	    else if(name=="Japan")
	   {
		  
		   return "Country";
	   }
	   System.out.println("Not found");
	   return "No";
	   
	}
	public static double price(String item)
	{
		System.out.println("Running price  in  method");
		System.out.println("item:"+item);
		if(item=="pen")
		{
			double price1=20;
			return price1;
		}
		if(item=="glass")
		{
			double price2=80;
			return price2;
		}
		if(item=="bat")
		{
			double price3=800;
			return price3;
		}
		if(item=="ball")
		{
			double price4=100;
			return price4;
		}
		if(item=="stumps")
		{
			double price5=300;
			return price5;
		}
		return 0;
	}
	public static String pName(String mName)
	{
		System.out.println("Running pName  in  method");
		System.out.println("movie name:"+mName);
		if(mName=="movie1")
		{
			String pName1="producer1";
			return "pName1";
		}
		if(mName=="movie2")
		{
			String pName2="producer2";
			return "pName2";
		}
		if(mName=="movie3")
		{
			String pName3="producer3";
			return "pName3";
		}
		if(mName=="movie4")
		{
			String pName4="producer4";
			return "pName4";
		}
		if(mName=="movie5")
		{
			String pName5="producer5";
			return "pName5";
		}
		return "Not Found";
	}
}