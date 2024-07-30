class RupeesRunner{
 public static void main(String[] args)
 { 
   System.out.println("Strting the RupeesRunner");

   Rupees rupees=new Rupees();
   int amount=Rupees.amount();
   String inWords=Rupees.inWords();
   String rupeesName=Rupees.rupeesName();
   System.out.println("Amount"+amount);
   System.out.println("inWords"+inWords);
   System.out.println("rupeesName"+rupeesName);
 }
}