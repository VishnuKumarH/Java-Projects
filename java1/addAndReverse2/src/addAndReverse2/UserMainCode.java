package addAndReverse2;

public class UserMainCode {
	
	public static int addAndReverse(int limit,int num,int[]arr) {
		int k=0;
		int sum =0;
		for(int i=0;i<limit;i++) {
			if(num==arr[i]) {
				 k=i;
			}	
				
			}
		for(int j=k+1;j<limit;j++) {
			sum=sum+arr[j];
			
		}
		int rev=0;
		while(sum != 0) {
			int digit = sum % 10;
			rev = rev * 10 + digit;
			sum /= 10;
		
		
		
	}
		return rev;
		
	}
}


