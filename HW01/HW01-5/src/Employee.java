

	public class Employee{
		private String firstName, lastName;
		private double salary;
		
		public Employee(){
			firstName = null;
			lastName = null;
			salary = 0;
		}
		
		//GET FUNCTIONS
		public String getFirst(){
			return firstName;
		}
		public String getLast(){
			return lastName;
		}
		public double getSalary(){
			return salary;
		}
		//END of GET
		
		//SET FUNCTIONS
		public void setFirst(String first){
			firstName = first;
		}
		public void setLast(String last){
			lastName = last;
		}
		public void setSalary(double Salary){
			salary = Salary;
		}
		//END of SET
	}

