/*B. Write a class with below methods
1.Method to take medicineName and return price : 3 condition
2.Method to take symptom and return medicineName: 3 condition
3.Method to take doctor name and return availability:3 condition*/

class Method1{
	public static String mName1(String symptom)
	{
		System.out.println("medicine name is");
		System.out.println("Symptoms is:"+symptom);
		
       if(symptom=="Skin")
	   {
		   
		   return "Vitamin C";
	   }
	   if(symptom=="lungs")
	   {
		   
		   return " carbocisteine";
	   }
	   if(symptom=="hair Loss")
	   {
		   
		   return " Finasteride ";
	   }
	   System.out.println("Not found");
	   return "No";
	   
	}
	public static double price(String mName)
	{
		System.out.println("Running price  in  method");
		System.out.println("medicine Name:"+mName);
		if(mName=="vitamin C")
		{
			double price1=24;
			return price1;
		}
		if(mName=="vitamin B")
		{
			double price2=30;
			return price2;
		}
		if(mName=="vitamin A")
		{
			double price3=80;
			return price3;
		}
		
		return 0;
	}
	public static boolean doctor(String dName)
	{
		System.out.println("Running pNa  in  method");
		System.out.println("Doctor name:"+dName);
		if(dName=="mahesh")
		{
			boolean mahesh=true;
			return mahesh;
		}
		if(dName=="preethesh")
		{
			boolean preethesh=false;
			return preethesh;
		}
		if(dName=="swastik")
		{
			boolean swastik=true;
			return swastik;
		}
		return false;
	}
}