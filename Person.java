package demo;

public class Person {

	static  int count = 0;
	
	String pname;
	int page;
	char pgender;
	
		public Person(String name, int age, char gender) {
			this.pname = name;
			this.page = age;
			this.pgender = gender;
		}
		
		void display() {
			System.out.println("Name " + pname);
			System.out.println("Age " + page);
			System.out.println("Gender " + pgender);
			
		}
		
		void display(Person obj ) {
			System.out.println("Within parameterized display.....  ");
			System.out.println("Name: " +obj.pname );
		}
		
		static void totalPeople()
		{
			System.out.println("You have made " + count + "Person objects" );
		}
		
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
