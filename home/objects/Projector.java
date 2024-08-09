/*Projector: company,type,color,weight*/

class Projector{
   
   String company;
   String type;
   String color="Black";
   double weight;
   
   void display()
   {
	   System.out.println("company:"+this.company);
	   System.out.println("type:"+this.type);
	    System.out.println("color:"+this.color);
		System.out.println("weight:"+this.weight);
		
	   
   }
   
   Projector(double weight)
   {
	   this.weight=weight;
   }
   public void setCompany(String company)
	{
		this.company=company;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	
}