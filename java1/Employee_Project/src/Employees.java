import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Employees {
	
	private int age ;
    private String name;
    private long salary;
    private String department;
    private String experience;
    
    static List<Employees> list = new ArrayList<Employees>();
    static List<Employees> list2 = new ArrayList<Employees>();
    public Employees() {
    	
    }

	public Employees(int age, String nameString, long salary, String department, String experience) {
		super();
		this.age = age;
		this.name = nameString;
		this.salary = salary;
		this.department = department;
		this.experience = experience;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employees [age=" + age + ", nameString=" + name + ", salary=" + salary + ", department="
				+ department + ", experience=" + experience + "]";
	}
    
    
    
    
    
    
    
	public static List<Employees> prefill() throws ParseException{
	
		list.add(new Employees(20,"john",10000,"java","10 years"));
		list.add(new Employees(30,"jack",20000,"python","4 years"));
		list.add(new Employees(25,"abin ",100000,"angular","3 years"));
		list.add(new Employees(10,"antu",100050,"react","5 years"));
		list.add(new Employees(20,"akhil",10000,"java","10 years"));
		
		
		return list;
	}
	
	//total number of employees in the company
	static int TotalEmployees() {
		
		int totalEmp = list.size();
		return totalEmp;
		
	}
	
	static List<Employees> sortEmpOnAge() {
		
		values.add(e2);
		values.add(e1);
		values.add(e3);
		values.stream()
		.filter((a)->a.getSalary()>2000)
		.sorted((a,b)->(int)(a.getSalary()-b.getSalary()))
	  // forEach(System.out::println);
		
	    .collect(Collectors.toList());
		
	}

}
