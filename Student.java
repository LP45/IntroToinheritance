package demo;
//INheritence is a concept of IS A REALTIONSHIP

public class Student extends Person {
	int id;
	double subject1;
	double subject2;
	double subject3;
	String major;
	
	
	Student(int id, String name, int age, char gender,double subject1, double subject2, double subject3){
		super(name,age,gender);
		this.id = id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;	
	}
	void hello() {
		System.out.println("Good Morning");
	}
	
	
	double calculate(int num) {
		System.out.println("Calculate inside child method");
		double average = this.subject1+this.subject2+this.subject3 / num;
		return average;
	}
	void display() {
		System.out.println(this.id);
//		super.display();
		System.out.println("Subject score 1 "+ this.subject1);
		System.out.println("Subject score 2 " + this.subject2);
		System.out.println("Subject score 3 " +this.subject3);
		System.out.println(this.calculate(100));
		System.out.println(calculate(100));
		
		//super.totalPeople();	
	}



}
