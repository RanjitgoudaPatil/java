class KnifeRunner
{
	
	public static void main(String[] args)
	{
		
		Knife knife=new Knife(1.5, 6);
		Ananya ananya= new Ananya(9965332101L, knife);
		ananya.display();
		System.out.println("----------");
		
		Knife knife1=new Knife(1.8, 7);
		Ananya ananya1= new Ananya(8122416465L, knife1);
		ananya1.display();
		System.out.println("----------");
		
		Knife knife2=new Knife(0.5, 4);
		Ananya ananya2= new Ananya(9655911992L, knife2);
		ananya2.display();
		System.out.println("----------");
	}
	
}