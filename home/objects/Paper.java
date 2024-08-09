/*Paper : thickness,size,quality,color*/

class Paper{
   
   int thickness;
   String size;
   String quality="Good";
   String color;
   
   void display()
   {
	   System.out.println("Thickness:"+this.thickness);
	   System.out.println("size:"+this.size);
	    System.out.println("quality:"+this.quality);
		System.out.println("color:"+this.color);
		
	   
   }
   
   Paper(String size)
   {
	   this.size=size;
   }
   public void setThickness(int thickness)
	{
		this.thickness=thickness;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	
}