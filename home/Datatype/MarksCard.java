class MarksCard{
	public static String result(double marks){
		System.out.println("Reading marks in MarksCard");
		if(marks<=21){
			return "Fail";
		}
		if(marks>21 && marks<80){
			return "First class";
		}
		return "Distinction";
	} 
}