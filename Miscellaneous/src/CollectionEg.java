import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionEg {

	public static void main(String[] args) {
		
		
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(6);
		values.add(7);
		Collections.sort(values);
		
		
		for(Integer i : values) {
			System.out.println(i);
		}
		System.out.println("------------------------------");
		Collections.shuffle(values);
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
