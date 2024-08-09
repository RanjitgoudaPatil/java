class PaperRunner
{
   public static void main(String[] args)
   {   System.out.println("Staring the first paper");
   Paper paper=new Paper("small");
   paper.thickness=2;
   paper.setColor("white");
   paper.display();
   
   System.out.println("Staring the second paper");
   Paper paper1=new Paper("medium");
   paper1.thickness=3;
   paper1.setColor("yellow");
   paper1.display();
   
   System.out.println("Staring the third paper");
   Paper paper2=new Paper("big");
   paper2.thickness=4;
   paper2.setColor("black");
   paper2.display();
   
   }
	   
   }