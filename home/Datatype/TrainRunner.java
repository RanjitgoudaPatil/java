class TrainRunner
{
public static void main(String[] args)
{
	Train.Book("Banglore","GOA");
	Train.Book("Banglore","GOA",5);
	Train.Book("Banglore","GOA",7,1000000);
	Train.Cancel("1234567890");
	Train.Cancel("Banglore","GOA");
}
}