import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WaterTank {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= 2;
		int [] arr = {100,50};
		int [] arr3 = new int [n];
 		int rate=0;
		ArrayList<Integer> list = new ArrayList<>();
		
		int [] arr2 = {100,50};
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr2.length;j++) {
				rate= arr[i]-arr[j];
				arr3[i]=rate;
				System.out.println(arr3[i]);
				
				
				
			}
		}for(int i=0;i<n-1;i++) {
			if(arr3[i]>arr3[i+1]) {
				System.out.println(i);
			}else if (arr3[i]==arr3[i+1]) {
				System.out.println(i+","+i+1);
			}
		}
		
		
		}
		
		

	}


