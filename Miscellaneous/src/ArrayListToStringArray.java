import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListToStringArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        
        
        ArrayList <String> list = new ArrayList<String>();
        
        for(int i=0;i<limit;i++) {
        	list.add(sc.next());
        }
        
        convertToStringArray(list);
      
        

	}
	
	static void convertToStringArray(ArrayList<String> list) {
		
		Collections.sort(list);
		String []arr = new String [list.size()];
		list.toArray(arr);
		for(String s :arr) {
			System.out.println(s);
		}
		
	}

}
