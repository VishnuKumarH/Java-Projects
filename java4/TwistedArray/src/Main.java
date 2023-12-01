import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n =7;
		int k =3;
		int []arr = {4 ,9, 1, 32 ,12, 6, 10};
		Twisted(n,arr,k);
				
	
	}

		
  
	 
	static void Twisted (int n,int []arr,int k) {
		
		 int [] sorted = arr.clone();
		 Arrays.sort(sorted);
		
		ArrayList <Integer> arr2 = new ArrayList<>();
		for(int i=0;i<k;i++)
		 {
			arr2.add(sorted[i]);
		}
		if(!sorted.equals(arr2))
		for(int j=0;j<n;j++) {
			arr2.add(arr[j]);
		}
		
		
		System.out.println(arr2);
	}
}
