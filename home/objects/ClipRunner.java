class ClipRunner 
{
	
	public static void main(String[] args)
	{
		
		Clip clip=new Clip("Yellow", "Barretts");
		Ganavi ganavi=new Ganavi("Ganavi123@gmail.com", clip);
		ganavi.print();
		System.out.println("----------");
		
		
		Clip clip1=new Clip("White", "Claw clip");
		Ganavi ganavi1=new Ganavi("Gan154@gmail.com", clip1);
		ganavi1.print();
		System.out.println("----------");
		
		Clip clip2=new Clip("Blue", "Jaw clip");
		Ganavi ganavi2=new Ganavi("ganga65@gmail.com", clip2);
		ganavi2.print();
		System.out.println("----------");
	
	}
	
}