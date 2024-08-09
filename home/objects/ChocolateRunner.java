class ChocolateRunner
{
   public static void main(String[] args)
   {   System.out.println("Staring the first Brand");
   Chocolate chocolate=new Chocolate("Big");
   chocolate.brand="DairyMilk";
   chocolate.setPrice(100);
   chocolate.display();
   
   System.out.println("Staring the first Brand");
   Chocolate chocolate1=new Chocolate("small");
   chocolate1.brand="kitkat";
   chocolate1.setPrice(20);
   chocolate1.display();
   
   System.out.println("Staring the first Brand");
   Chocolate chocolate2=new Chocolate("Big");
   chocolate2.brand="milky Bar";
   chocolate2.setPrice(50);
   chocolate2.display();
   }
}