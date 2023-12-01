import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class Main2 {
	public static void main(String[]args) {

	
		List<Employee2> empList=new ArrayList<Employee2>();
		empList.add(new Employee2(248774,"Neethu"," Nelliparambil", 10.0,"ec"));
		empList.add(new Employee2(249547,"Bhagyalakshmi"," Suresh",10.0,"ec"));
		empList.add(new Employee2(248825,"Ajay"," C M",10.0,"cs"));
		empList.add(new Employee2(249532,"kalyan"," Jalaneela",10.0,"ec"));
		empList.add(new Employee2(249529,"AISWARYA"," P",10.0,"ec"));
		empList.add(new Employee2(248764,"Ajayakrishnan"," J",10.0,"mca"));

		Map<String,Long>result = empList.stream()
		.collect(Collectors.groupingBy(Employee2:: getDepartment,Collectors.counting()));
		for(Entry<String,Long>e:result.entrySet())
			System.out.println(e);
	}
	

}
