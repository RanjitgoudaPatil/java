class BuyRunner{
	
	public static void main(String[] array){
		
		System.out.println("Running a main method");
		Buy.product("apple",80000);
		Buy.product("apple",95000);
		
		Buy.product("adidas",2,"good",3500);
		Buy.product("adidas",2,"good",4200);
		
		Buy.bookMovieTicket("indian","gopalan cinemas",20,350);
		Buy.bookMovieTicket("indian","gopalan cinemas",20,490);
		
		Buy.buyEgg(50,6.2);
		Buy.buyEgg(50,8);
		
		Buy.buyShampoo(500,280,"meera","20july");
		Buy.buyShampoo(500,300,"meera","20july");
		
		Buy.buyCake('m',"honey","mango",500,8);
		Buy.buyCake('m',"honey","mango",500,1);
		
		Buy.buyLaptop("Hp",260014,40000,250,26.6,"windows",500,256);
		Buy.buyLaptop("Hp",260014,40000,250,26.6,"windows",500,6);
		
		Buy.buySmartWatch("Boat",3000,7,'s',20);
		Buy.buySmartWatch("Boat",3000,7,'s',2);
	}
	
	
	
}