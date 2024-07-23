class Tablet{
	public static double dosage(double age){
		System.out.println("starting dosage in Tablet");
		if(age>0&&age<17){
			return 0.5;
		}
		else{
			return 1;
		}
	}
}