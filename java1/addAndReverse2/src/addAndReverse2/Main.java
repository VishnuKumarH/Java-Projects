package addAndReverse2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
	     
	        int limit = sc.nextInt();
	        int []arr = new int [limit];
	        for(int i=0;i<limit;i++) {
	        	
	        	arr[i]=sc.nextInt();
	        	
	        }
	        int num = sc.nextInt();
	        
	        int result = UserMainCode.addAndReverse(limit, num, arr);
	        System.out.println(result);

	}

}
