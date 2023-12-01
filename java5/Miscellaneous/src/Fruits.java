import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int m = sc.nextInt();
	         ArrayList <String> list1 = new ArrayList<>();
	         for(int i=0;i<m;i++) {
	        	 list1.add(sc.next());
	         }
	         ArrayList<String> list2 = new ArrayList<>();
	         int n=sc.nextInt();
	         for(int i=0;i<n;i++) {
	        	 list2.add(sc.next());
	         }
	               fruitSelector(list1,list2);
	      
	       }
	
	
	static void fruitSelector(ArrayList<String>list1,ArrayList<String>list2) {
		String [] arr = new String[list1.size()];
		List<String> newList = new ArrayList<>();
		
		for(String s :list1) {
			int len =s.length();
			if(s.charAt(len-1)=='a'||s.charAt(len-1)=='e'){
				continue;
				
				
				
			}else {
				newList.add(s);
			}
			}
		
		
		
		for(String s2:list2) {
			if(s2.charAt(0)=='M'||s2.charAt(0)=='A') {
				continue;
				
				
			}else {
				newList.add(s2);
			}
			
			}
			  newList.toArray(arr);
			  
			  for(String s:arr) {
				  System.out.println(s);
			  }
		
		
	
		
		
		
	}

}
