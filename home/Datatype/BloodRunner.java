class BloodRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in bloodrunner");
		char ref = Blood.group();
		System.out.println("ref :"+ref);
		String namee = Blood.personName();
		System.out.println("namee :"+namee);
		double price = Blood.cost();
		System.out.println("price :"+price);
		boolean isTested=Blood.hospitalTested();
		System.out.println("isTested :"+isTested);
		boolean yesorno=Blood.sickness();
		System.out.println("yesorno :"+yesorno);
		char yynn=Blood.donate();
		System.out.println("yynn :"+yynn);
		
	}
}
