class MaskRunner
{
	
	public static void main(String[] array)
	{
		
		Mask mask=new Mask();
		System.out.println("Cost: "+mask.cost);
		System.out.println("Size :"+ mask.size);
		System.out.println("Material :"+mask.material);
		
		Mask mask1=new Mask(100);
		System.out.println("Cost: "+mask1.cost);
		System.out.println("Size :"+ mask1.size);
		System.out.println("Material :"+mask1.material);
		
		Mask mask2=new Mask('M');
		System.out.println("Cost: "+mask2.cost);
		System.out.println("Size :"+ mask2.size);
		System.out.println("Material :"+mask2.material);
		
		Mask mask3=new Mask("Cotton");
		System.out.println("Cost: "+mask3.cost);
		System.out.println("Size :"+ mask3.size);
		System.out.println("Material :"+mask3.material);
		
		Mask mask4=new Mask(100, 'S', "Cotton");
		System.out.println("Cost: "+mask4.cost);
		System.out.println("Size :"+ mask4.size);
		System.out.println("Material :"+mask4.material);
		
		Mask mask5=new Mask(100, 'M');
		System.out.println("Cost: "+mask5.cost);
		System.out.println("Size :"+ mask5.size);
		System.out.println("Material :"+mask5.material);
		
		
		
	}
	
	
	
	
	
	
	
}