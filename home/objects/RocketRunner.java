class RocketRunner
{
   public static void main(String[] args)
   {   System.out.println("Staring the first country");
   Rocket rocket=new Rocket(10);
   rocket.country="India";
   rocket.setSpeed(5000);
   rocket.display();
   
   System.out.println("Staring the second country");
   Rocket rocket1=new Rocket(11);
   rocket1.country="USA";
   rocket1.setSpeed(4000);
   rocket1.display();
   
   System.out.println("Staring the third country");
   Rocket rocket2=new Rocket(12);
   rocket2.country="UAE";
   rocket2.setSpeed(3000);
   rocket2.display();
   }
}