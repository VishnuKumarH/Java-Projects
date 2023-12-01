package exam;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Map.Entry;

public class Main2 {

	public static void main(String[] args) {
	ArrayList<Employee2> newList = new ArrayList<Employee2>();
	newList.add(new Employee2(111,"emp1","ec",200.0));
	newList.add(new Employee2(112,"emp2","cs",202.0));
	newList.add(new Employee2(113,"emp3","eee",230.0));
	newList.add(new Employee2(114,"emp4","mca",240.0));
	newList.add(new Employee2(115,"emp1","ec",205.0));
	
	Map<String,Double> result=(Map<String, Double>) newList.stream()
	.collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.averagingDouble(Employee2::getSalary)));
	for(Entry<String,Double> e:result.entrySet())
		System.out.println(e);
	
	
	
	

	}

	

}
