
public class Employee {

	
		private int id;
		private String firstName;
		private String lastName;
		private Double salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary( Double salary) {
			this.salary = salary;
		}
		
		
		
      public void Employee() {
    	  
      }
      
      

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	public Employee(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary =  salary;
	}
	
      
      
	

}
