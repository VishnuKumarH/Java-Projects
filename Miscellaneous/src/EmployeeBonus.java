import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class EmployeeBonus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		Map<Integer,String> map1= new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		for(int i=0;i<n;i++) {
			
			int id=sc.nextInt();
			String DOB=sc.next();
			int salary =sc.nextInt();
			
			
			map1.put(id, DOB);
			map2.put(id, salary);
			
		
		
		
		Map <Integer,Integer> treema=getBonus(map1,map2);
		
		for(Map.Entry<Integer,Integer> e :treema.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		}

	} 
	static Map<Integer,Integer> getBonus(Map<Integer,String> map1,Map<Integer,Integer> map2) {
		int employeeId=0;
		String s="";
		int bonus=0;
		for(Map.Entry<Integer,String> e:map1.entrySet()) {
			employeeId = (int) e.getKey();
			 s=(String) e.getValue();
			
		}
		
		StringTokenizer st = new StringTokenizer(s,"-");
		int year =0;
		while(st.hasMoreTokens()) {
			int day =Integer.parseInt(st.nextToken());
			int month =Integer.parseInt(st.nextToken());
			year = Integer.parseInt(st.nextToken());
			
		}
		int newSalary=0;
		int age=2014-year;
		
		int salary=0;
		 salary =map2.get(employeeId);
		 
		 
		 if(salary<5000) {
			 salary=salary-100;
		 }
		 else if(age<25 || age>60) {
			 salary =salary-200;
		 }
		 else if((salary<5000 )&& (age<25 ||age>60)) {
			 salary=salary-100;
		 }
		 
		
		
		if(age>=25 && age<=30) {
			bonus=salary*20/100;
			newSalary=salary+bonus;
			
			
		}
		else if(age>=31 && age<=60) {
			bonus =salary+(30/100);
			newSalary =salary+bonus;
			
		}
		
		Map <Integer,Integer> treemap = new TreeMap<>();
		
		treemap.put(employeeId, newSalary);
		
		return treemap;
		
		
		
	}

}

