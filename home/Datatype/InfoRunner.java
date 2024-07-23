class InfoRunner{
	public static void main(String[] details){
		if(details.length==4)
		{
		String forestName=details[0];
		String forestArea=details[1];
		String forestEstablishedYear=details[2];
		String forestState=details[3];
		System.out.println("forest name"+forestName);
		System.out.println("forest area"+forestArea);
		System.out.println("forest established year"+forestEstablishedYear);
		System.out.println("forest state"+forestState);
		}
		else{
			System.out.println("deatils required");
		}
		
	}
}