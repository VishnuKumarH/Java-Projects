package exam;
import java.util.*;
public class SmoothPrime {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(isPrime(n-1) && isPrime(n+1)) {
			System.out.println("True");
			System.out.println(n+1);
			System.out.println(n-1);
			
		}else {
			System.out.println("False");
		}
		
		
	
		
	

	}
	static boolean isPrime(int n) {
		
		if(n<=1)
		return false;
		
		for (int i=2;i<n/2;i++) {
			if(n%i==0)
				return false;
			
			
		}
		return true;
		
	}
}
