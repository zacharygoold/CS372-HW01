import java.util.Scanner;
public class HW01 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		Scanner a = new Scanner(System.in);
		String first, last;
		double salary;
		  
		System.out.printf("Enter First Name of the First Employee: ");
		first=a.next();
		e1.setFirst(first);

		System.out.printf("Enter Last Name of the First Employee: ");
		last=a.next();
		e1.setLast(last);

		System.out.printf( "Enter Salary of the First Employee: " );
		salary=a.nextDouble();
		e1.setSalary(salary);
		
		System.out.printf("Enter First Name of the Second Employee: ");
		first=a.next();
		e2.setFirst(first);

		System.out.printf("Enter Last Name of the Second Employee: ");
		last=a.next();
		e2.setLast(last);

		System.out.printf( "Enter Salary of the Second Employee: " );
		salary=a.nextDouble();
		e2.setSalary(salary);
		  
		System.out.printf("First Employees Full Name and Yearly Salary:\n");
		System.out.printf( e1.getFirst() + " " + e1.getLast() + "  " + e1.getSalary() * 12 + "\n" );
		  
		System.out.printf("Second Employee's Full Name and Yearly Salary:\n");
		System.out.printf( e2.getFirst() + " " + e2.getLast() + "  " + e2.getSalary() * 12 + "\n" );

		System.out.printf("Salary After 10% Raise:\n");
		System.out.printf( e1.getFirst() + " " + e1.getLast() + "  " + (e1.getSalary()*1.10 * 12 + "\n"));
		System.out.printf( e2.getFirst() + " " + e2.getLast() + "  " + (e2.getSalary()*1.10 * 12 + "\n"));
	}
	
	
	




}



