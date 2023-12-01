import java.util.*;
public class SmoothPrimeArray {

	public static void main(String[] args) {
		System.out.println("enter limit");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("enter array");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();	
		}
		
		SmoothArray(arr,n);
		
		

	}
	
	public static void SmoothArray(int [] arr,int n) {
		
		
		
	if(n%2==0) {
		int first = arr[0];
		int last = arr[n-1];
		
		
		int middle=arr[n/2]+arr[(n/2)-1];
		if(first==middle && first == last) {
			System.out.println(first +"" +middle+""+last);
			System.out.println("True");
			
		}else {
			
				System.out.println(first+""+middle+""+last);
				System.out.println("False");
				}
				
		}
	if(n%2 !=0) {
		int first = arr[0];
		int last = arr[n-1];
		
		int middleOdd = arr[(n-1)/2];
		
		if(first==middleOdd && first == last) {
			System.out.println(first+""+middleOdd+""+last);
			System.out.println("True");
	}else {
		System.out.println(first+""+middleOdd+""+last);
		System.out.println("False");
	}
	}
		
		
		
	
	
	
		
		
		
	}

}
