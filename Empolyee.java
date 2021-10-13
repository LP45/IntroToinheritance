package demo;

//HAS A REALTIONSHIP
public class Empolyee extends Person {
	int id;
	double salary;
//	Refrence object allows us to do HAS A Realtion
//	addr is he object that got created from the Address class
	Address addr;
	
	
//	 This is a IS A REALTION METHOD
	 Empolyee(int id,String name, int age, char gender, double salary) {
		super(name, age, gender);
		this.id = id;
		this.salary = salary;
	}


	
	
	void createAddress() {
		addr = new Address();
		addr.street = "101 Burr st";
		addr.city = "Bronx";
		addr.state = "New York";
		addr.zipcode = 10037;
	}
	
	void display() 
	{
		System.out.println("ID" + this.id);
		super.display();
		System.out.println();
		System.out.println("street " + addr.street);
		System.out.println("city " + addr.city);
		System.out.println("State "+addr.state);
		System.out.println("Zipcode "+addr.zipcode);
		System.out.println("Your Salary is " + salary);
	}
	
	 double calculate(int bonus) {
		double netsalary= bonus + this.salary;
		return netsalary;
	}
}
