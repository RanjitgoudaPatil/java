class ProjectorRunner
{
   public static void main(String[] args)
   {   System.out.println("Staring the first company");
   Projector projector=new Projector(5);
   projector.company="Epson";
   projector.setType("wired");
   projector.display();
   
    System.out.println("Staring the second company");
   Projector projector1=new Projector(3);
   projector1.company="Sony";
   projector1.setType("wireless");
   projector1.display();
   
   
    System.out.println("Staring the third company");
   Projector projector2=new Projector(5);
   projector2.company="samsung";
   projector2.setType("wired");
   projector2.display();
   
   
   }
}
