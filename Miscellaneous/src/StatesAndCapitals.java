import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatesAndCapitals {

	public static void main(String[] args) {
		Map <String,String> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		for(int i=0;i<k;i++) {
			map.put(sc.next(),sc.next());
			
		}
		
		
		String str = sc.next();
		
	for(Map.Entry e :map.entrySet()) {
		if(e.getKey().equals(str)) {
			System.out.println(e.getValue() + "$" +e.getKey());
		}
			
		}
	
	
		


	}
	

}
