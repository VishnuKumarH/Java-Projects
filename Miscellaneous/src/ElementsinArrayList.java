import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementsinArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit1 = sc.nextInt();
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<limit1;i++) {
			list1.add(sc.nextInt());
			
		}
		
		int limit2 = sc.nextInt();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int j=0;j<limit2;j++) {
			list2.add(sc.nextInt());
		}
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list1);
		list3.removeAll(list2);
		list2.removeAll(list1);
		list3.addAll(list2);
		
		for(int i :list3) {
			System.out.println(i);
		
		}
		
		

	}
}

