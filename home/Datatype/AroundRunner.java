class AroundRunner{
	public static void main(String[] details){
		if(details.length==4)
		{
		String palaceName=details[0];
		String palaceLocation=details[1];
		String palaceBuiltBy=details[2];
		String palaceBuiltYear=details[3];
		System.out.println("palace name"+palaceName);
		System.out.println("palace area"+palaceLocation);
		System.out.println("palace established by"+palaceBuiltBy);
		System.out.println("palace built year"+palaceBuiltYear);
		}
		else{
			System.out.println("deatils required");
		}
		
	}
}