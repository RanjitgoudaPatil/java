class SpeakerRunner
{
   public static void main(String[] args)
   {   System.out.println("Staring the first Brand");
   Speaker speaker=new Speaker("simple");
   speaker.brand="Boat";
   speaker.setSize("BIG");
   speaker.display();
   
   System.out.println("Staring the second Brand");
   Speaker speaker1=new Speaker("Base");
   speaker1.brand="JBL";
   speaker1.setSize("BIG");
   speaker1.display();
   
   System.out.println("Staring the third Brand");
   Speaker speaker2=new Speaker("normal");
   speaker2.brand="sony";
   speaker2.setSize("small");
   speaker2.display();
   }
}