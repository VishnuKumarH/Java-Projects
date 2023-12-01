package exam;
import java.util.*;
import java.util.Scanner;
public class FullPrime {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	for (int i=x;i<y;i++)
	{
		if(isPrime(i)) {
			String numString = Integer.toString(i);
			boolean isFullPrime=true;
			for(int j=0;j<numString.length();j++) {
				int digit = Character.getNumericValue(numString.charAt(j));
				if (!isPrime(digit)) {
					isFullPrime= false;
					break;
				}
			}
			if (isFullPrime) {
				arr.add(i);
				
				}
			}
			
			
		}
	if (arr.size()>0) {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
			if (i < arr.size() - 1) {
				System.out.println(",");
			}
		}
				
	}else {
		System.out.println("-1");
	}
	
	}
	private static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
	



