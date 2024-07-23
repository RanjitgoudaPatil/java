class Info{
	public static void main(String[] details){
		if(details.length==4)
		{
		String personName=details[0];
		String personAge=details[1];
		String personEmail=details[2];
		String personPassword=details[3];
		System.out.println("person name"+personName);
		System.out.println("person age"+personAge);
		System.out.println("person email"+personEmail);
		System.out.println("person password"+personPassword);
		}
		else{
			System.out.println("deatils required");
		}
		
	}
}