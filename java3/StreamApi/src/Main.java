import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> values= new ArrayList<>();
		ArrayList<Employee> result = new ArrayList<>();
		Employee e1 = new Employee(122,"abc","bdg",5354.0);
		Employee e2 = new Employee(2323,"bdbd","hfhfh",737.0);
		Employee e3 = new Employee(1323,"hfhfh","hfhfh",73646.0);
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
