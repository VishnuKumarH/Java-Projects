import java.util.ArrayList;
import java.util.Scanner;

public class OddDigitSum {
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] arr = new String [n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		getSum(arr,n);
		

}
	
	static void getSum(String[] arr,int n) {
		ArrayList <Integer> list = new ArrayList<>();
		int count =0;
		for(int i=0;i<n;i++) {
			char [] ch = arr[i].toCharArray();
			for(char c:ch) {
				if(Character.isDigit(c)) {
					 list.add(Character.getNumericValue(c));
				}
					
				
			}
		}
		for(int k:list) {
			if(k%2!=0) {
				count=count+k;
				
			}
		}
		System.out.println(count);
		
	}
	}
