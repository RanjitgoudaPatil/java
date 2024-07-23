class ChainRunner{
   public static void main(String[] args)
   {
	   System.out.println("Running main in ChainRunner");
	   int carat=Chain.carat();
	   System.out.println("carat:"+carat);
	   double price=Chain.costPerGram();
	   System.out.println("price per gram:"+price);
	   String types=Chain.type();
	   System.out.println("type of chain:"+types);
	   String qualityy=Chain.quality();
	   System.out.println("quality of chain:"+qualityy);
	   double gms=Chain.quantity();
	   System.out.println("quantity of chain in grams:"+gms);
	   byte waste=Chain.wastage();
	   System.out.println("wastage in %:"+waste);
	   double service=Chain.serviceCost();
	   System.out.println("Service cost per gram:"+service);
	   float gstCharges=Chain.gst();
	   System.out.println("GST price in %:"+gstCharges);
   }
}