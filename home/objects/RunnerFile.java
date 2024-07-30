class RunnerFile
{
	
	public static void main(String[] args)
	{
		System.out.println("starting in a main");
		Matrimony matrimony=new Matrimony();
		
		String name=matrimony.name;
		int age=matrimony.age;
		String state=matrimony.state;
		
		matrimony.name="osama";
	    matrimony.age=19;
	    matrimony.state="Tamil nadu";
		
		System.out.println("Name:"+matrimony.name);
		System.out.println("Age:"+matrimony.age);
		System.out.println("State:"+ matrimony.state);
		System.out.println("--------------");
		Application app=new Application();
		
		String name1=app.name1;
	    int mb=app.mb;
	    String purpose=app.purpose;
		
		app.name1="VN video editor";
		app.mb=125;
		app.purpose="editing";
		
		System.out.println("Name:"+app.name1);
		System.out.println("MB:"+app.mb);
		System.out.println("Purpose:"+app.purpose);
		System.out.println("--------------");
		
		Fruit fruit=new Fruit();
		
		String fruitName=fruit.fruitName;
	    int quantity=fruit.quantity;
	    double price=fruit.price;
		
		fruit.fruitName="Apple";
		fruit.quantity=2;
		fruit.price=80;
		
		System.out.println("Name:"+fruit.fruitName);
		System.out.println("Quantity:"+fruit.quantity);
		System.out.println("Price:"+fruit.price);
		System.out.println("--------------");
		
		Juice juice=new Juice();
		
		String juiceName=juice.juiceName;
	    int ml=juice.ml;
		double cost=juice.cost;
		
		juice.juiceName="Banana Juice";
		juice.ml=250;
		juice.cost=50;
		
		System.out.println("juice name:"+juice.juiceName);
		System.out.println("ML:"+juice.ml);
		System.out.println("Cost:"+juice.cost);
		System.out.println("--------------");
		
		Place place=new Place();
		
		String placeName= place.placeName;
		int distance= place.distance;
		String mode= place.mode;
		
		place.placeName="mysore palace";
		place.distance=125;
		place.mode="Bus";
		
		System.out.println("place name:"+place.placeName);
		System.out.println("Distance:"+place.distance);
		System.out.println("Mode:"+place.mode);
		System.out.println("--------------");
		
		AlcoholBrand alcohol=new AlcoholBrand();
		
		String brandName=alcohol.brandName;
		String rating=alcohol.rating;
		
		alcohol.brandName="kingfisher";
		alcohol.rating="good";
		
		System.out.println("AlcoholBrand:"+alcohol.brandName);
		System.out.println("rating:"+alcohol.rating);
		System.out.println("--------------");
		
		Candy candy=new Candy();
		
		String candyName=candy.candyName;
		String flavour=candy.flavour;
		String  brand=candy.brand;
		
		candy.candyName="dairy Milk";
		candy.flavour="Chocolate";
		candy.brand="cadberry";
		
		System.out.println("Name:"+candy.candyName);
		System.out.println("Flavour:"+candy.flavour);
		System.out.println("Brand:"+candy.brand);
		System.out.println("--------------");
		
		Medicine medicine=new Medicine();
		
		String tablet=medicine.tablet;
		String company=medicine.company;
		int qty=medicine.qty;
		
		medicine.tablet="paractemal";
		medicine.company="tn goverment";
		medicine.qty=12;
		
		System.out.println("Tablet:"+medicine.tablet);
		System.out.println("company:"+medicine.company);
		System.out.println("qty:"+medicine.qty);
		System.out.println("--------------");
		
		Food food =new Food();
		
		String foodName=food.foodName;
		String type=food.type;
		int ratings=food.ratings;
		
		food.foodName="Briyani";
		food.type="non-veg";
		food.ratings=4;
		
		System.out.println("Food Name:"+food.foodName);
		System.out.println("Type:"+food.type);
		System.out.println("Rating:"+food.ratings);
		System.out.println("--------------");
		
		
	}
	
	
	
	
	
}