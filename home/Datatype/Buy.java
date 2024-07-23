class Buy{
	
	public static void product(String brand,double price){
		System.out.println("running a product in a buy");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		if (price>0 && price<=80000) {
			System.out.println("is a valid price");
		}
		else {
			System.out.println("is not a valid price");
		}
	}
	public static void product(String name,int quantity,String quality,double price){
		System.out.println("Name:"+name);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		System.out.println("Price:"+price);
		if (price>250 && price<=4000) {
			System.out.println("is a valid shoe price");
		}
		else {
			System.out.println("is not a valid shoe price");
		}
	}
	public static void bookMovieTicket(String name,String theaterName, int quantity, double price){
		System.out.println("Name:"+name);
		System.out.println("Theater Name:"+theaterName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
		if (price>150 && price<480) {
			System.out.println("is a valid ticket price");
		}
		else {
			System.out.println("is a not valid ticket price");
		}
	}
	public static void buyEgg(int total, double pricePerEgg){
		System.out.println("Total:"+total);
		System.out.println("Price per egg:"+pricePerEgg);
		if (pricePerEgg>3 && pricePerEgg<7) {
			System.out.println("is a best price");
		}
		else {
			System.out.println("is a over price");
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manufatureDate){
		System.out.println("Quantity:"+quantityInMl);
		System.out.println("Price:"+price);
		System.out.println("Brand:"+brand);
	    System.out.println("Manufacture Date:"+manufatureDate);
		if (price>150 && price<=280) {
			System.out.println("Is a valid price");
		}
		else {
			System.out.println("is a invalid price");
		}
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity){
		System.out.println("Size:"+size);
		System.out.println("Type:"+type);
		System.out.println("Flavour:"+flavour);
		System.out.println("Cost:"+cost);
		System.out.println("Quantity:"+quantity);
		if (quantity>2 && quantity<10) {
			System.out.println("is a valid quantity");
		}
		else {
			System.out.println("is a in valid quantity");
		}
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize){
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println("ramSize:"+ramSize);
		if (ramSize>8 && ramSize<=512) {
			System.out.println("is a correct memory");
		}
		else {
			System.out.println("is a lowest memory");
		}
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode){
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
		if (mode>3 && mode<24) {
			System.out.println("is a advance mode");
		}
		else {
			System.out.println("is a basic mode");
		}
		
		
	}   
		
}