package package2;
import java.util.*;
public class primeNumber {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =n/2;
		int flag =0;
		if (n==0 ||n==1)
		{
			System.out.println("number is not prime");
			
		} else {
		for(int i=2;i<=m;i++)
		{
			if (n%i==0)
			{
				System.out.println("number is not prime");
				flag=1;
				break;
				
			}
		}
			
			
			if (flag==0)
			{
				System.out.println("number is prime");
			}
			
			
		}

	}

}

