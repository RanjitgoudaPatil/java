class SoftwareEngineer
{
	String name="chethan";
	int experience=2;
	String designation="Front end developer";
	double salary;
	
	public void show()
	{
		System.out.println("Engineer Name:"+this.name);
		System.out.println("Experience:"+this.experience);
		System.out.println("Designation:"+this.designation);
		System.out.println("Salary:"+this.salary);

	}
	SoftwareEngineer(double salary)
	{
	     this.salary=salary;	
	}
	
}


class Company
{
	int id=12123;
	String name="Xworks";
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer(60000);
	
	Company(String location)
	{
		this.location=location;
	}
	
	public void show()
	{
		System.out.println("company id:"+this.id);
		System.out.println("company name:"+this.name);
		System.out.println("company location:"+this.location);
		softwareEngineer.show();	
	}
	
	
}


class CompanyRunner
{
	public static void main(String[] args)
	{
		Company company=new Company("Rajajinagar");
		company.show();
	}
}