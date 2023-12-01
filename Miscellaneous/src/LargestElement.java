import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int [] arr = new int [n];
	
	ArrayList<Integer> list = new ArrayList<>();
		
	
	for(int i=0;i<n;i++) {
		arr[i]= sc.nextInt();
	
	}
	
	if(arr.length==1) {
		System.out.println(arr[0]);
	}else {
	int result = 0;
	
	list.add(arr[0]);
	list.add(arr[(n-1)/2]);
	list.add(arr[n-1]);
	
	Collections.sort(list);
	System.out.println(list.get(2));
	
	
	
	}
	}
	

	

}
