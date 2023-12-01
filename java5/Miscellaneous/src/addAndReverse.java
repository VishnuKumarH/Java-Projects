import java.util.Scanner;

public class addAndReverse {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
        System.out.println("enter array limit");
        int limit = sc.nextInt();
        int []arr = new int [limit];
        for(int i=0;i<limit;i++) {
        	
        	arr[i]=sc.nextInt();
        	
        }
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println(reverse(limit,num,arr));
        
        


	}
	
	static int reverse(int limit,int num,int[]arr) {
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
		return sum;
	}
	}
 