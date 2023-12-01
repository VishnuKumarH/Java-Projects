import java.util.ArrayList;
import java.util.Arrays;

public class CommonInArray {
public static ArrayList<Integer> common(int [] arr,int [] arr2) {
	
	Arrays.sort(arr);
	Arrays.sort(arr2);
	ArrayList <Integer> List = new ArrayList<Integer>();
	
	
	
	for(int i=0;i<5;i++) {
		
		
			if (arr[i] !=arr2[i]) {
				List.add(arr2[i]);
				List.add(arr[i]);
			
		}	
	}
	return List;
	
	
	
}
	public static void main(String[] args) {
		int [] arr = {9,2,3,8,5};
		int []arr2 = {1,2,3,4,5};
	
		
		
			System.out.println(common(arr,arr2));
			

	}
}

	


