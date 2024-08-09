class Ganavi
{
	
	String eMail;
	Clip clip;
	
	Ganavi(String eMail, Clip clip)
	{
		this.eMail=eMail;
		this.clip=clip;
	}
	
	public void print()
	{
		System.out.println("E Mail :"+this.eMail);
		clip.printing();
		
	}
	
	
}