import java.text.ParseException;
import java.util.*;
public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		List<College> collegeList =new ArrayList<College>();
		
		for(int i=0;i<n;i++) {
			String detail =sc.nextLine();
			if(detail.equals("")) {
				detail=sc.nextLine();
				College college = College.createCollege(detail);
				collegeList.add(college);
				
				
			}
			int choice=0;
			System.out.println("Enter a type to sort:\r\n" + 
					"1.Sort by name\r\n" + 
					"2.Sort by number of departments\r\n" + 
					"3.Sort by starting date\r\n" + 
					"");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: // by name
				Collections.sort(collegeList);
				break;
			case 2: //by number of departments
				Collections.sort(collegeList,new DepartmentComparator());
			case 3: //by starting date
				Collections.sort(collegeList,new StartingDateComparator());
			}
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
			for(College c: collegeList) {
				System.out.println(c);
				
			}
		}
		
	       
		
			
			
		

	}

}
