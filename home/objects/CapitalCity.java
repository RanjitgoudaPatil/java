class CapitalCity
{
	String name="Bengaluru";
	int population=14008000;
	
	public void swalpaTorsu()
	{
		System.out.println("City name:"+this.name);
		System.out.println("population of the City:"+this.population);

	}
	
}

class State
{
	String name="Karnataka";
	String language;
	CapitalCity capitalCity=new CapitalCity();
	
	State(String language)
	{
		this.language=language;
	}
	public void swalpaTorsu()
	{
		System.out.println("state name:"+this.name);
		System.out.println("Language:"+this.language);
		capitalCity.swalpaTorsu();

	}
}

class Country
{
	String name="India";
	String continent="Asia";
	State state=new State("Kannada");
	
	public void swalpaTorsu()
	{
		System.out.println("Country name:"+this.name);
		System.out.println("continent name:"+this.continent);
		state.swalpaTorsu();
	}
}


class CountryRunner
{
	public static void main(String[] args)
	{
		Country country=new Country();
		country.swalpaTorsu();
		
	}
}