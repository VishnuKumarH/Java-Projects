import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateEvenSum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int limit = sc.nextInt();
	int [] arr = new int [limit];
	int []arr2 = new int[limit];
	ArrayList<Integer> list = new ArrayList<>();
	int sum=0;
	for(int i=0;i<limit;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<limit;i++) {
		for(int j=0;j<limit;j++) {
			if(arr[i]!=arr[j]) {
				arr2[i]=arr[i];
			}
			
		}
			
	}
	
	for(int i =0;i<limit;i++) {
		if(arr[i]%2==0) {
			sum+=arr2[i];
		}
	}
	
	System.out.println(sum);
	
	
	
	
	}
	
	

	}




