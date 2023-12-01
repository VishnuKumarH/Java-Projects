import java.util.ArrayList;
import java.util.Collections;

public class Locker {

	public static void main(String[] args) {
		int n=5;
		int [] arr = {2,2,4,1,0};
		
		
		ArrayList <Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int res = arr[i]-i;
			list.add(res);
		}
		System.out.println(list);
		Collections.sort(list);
		
		int maxVal = Collections.max(list);
		int minVal = Collections.min(list);
		
		int res = maxVal-minVal;
		
		System.out.println(res);
		
		

	}

}
