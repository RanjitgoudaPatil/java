class KeyRunner
{
	
	public static void main(String[] args)
	{
		
		Key key=new Key(1,"Kwikset");
		Keybunch keybunch=new Keybunch("Metal", key);
		keybunch.display();
		System.out.println("----------");
		
		
		Key key1=new Key(1.5,"Medeco");
		Keybunch keybunch1=new Keybunch("Alumnium", key1);
		keybunch1.display();
		System.out.println("----------");
		
		
		Key key2=new Key(2,"Godrej");
		Keybunch keybunch2=new Keybunch("Metal", key2);
		keybunch2.display();
		System.out.println("----------");
		
		
	}
	
	
}