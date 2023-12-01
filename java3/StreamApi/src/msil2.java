import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class msil2 {

	public static void main(String[] args) {
	
		
		
      List<Integer> list = new ArrayList<>();
		
		list.add(87);
		list.add(54);
		list.add(52);
		list.add(783);
		list.add(79);
		
		
		Comparator <Integer> cm = new Comparator<>() {
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10) {
					return 1;
				}else 
					return -1;
			}
		};
		
		Collections.sort(list,cm);
		System.out.println(list);
	}
}








