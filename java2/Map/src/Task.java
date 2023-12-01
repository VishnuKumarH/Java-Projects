//accept a string as input and display the characters and their occurrences as output

import java.util.*;
import java.util.Map.*;
public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		LinkedHashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		
		for(char x :input.toCharArray()) {
			Integer count = map.get(x);
			if(count==null);
			count=0;
			count++;
			map.put(x, count);
			
		}
		for(Entry<Character,Integer> e:map.entrySet()) {
		System.out.println(e);

	}

}
}
