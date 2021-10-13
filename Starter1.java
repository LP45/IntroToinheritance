package demo;

public class Starter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empolyee em1 = new Empolyee( 2,"MCLOVIN",21,'M',10456.58);
		
		Empolyee em2 = new Empolyee( 3,"ME",84,'F',12456.0);
		
		em1.createAddress();
		
		em1.display();
		
		System.out.println("Net salary for this Empolyee: " +em1.calculate(1000));
		
		System.out.println();
		System.out.println();
		
		em2.createAddress();
		em2.display();
		System.out.println("Net salary for this empolyee is: " + em2.calculate(1200));
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
	}

}
