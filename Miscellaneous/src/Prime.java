import java.util.*;
public class Prime {

	public static void main(String[] args) {
		System.out.println("enter x");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();
		
		System.out.println(isPrime(x,y));
		
		sc.close();
		
		
		//should return an arrayList
		
		

	}
	
	public static ArrayList<Integer> isPrime(int x ,int y){
		
		
		ArrayList <Integer > primes = new ArrayList<>();
		
		
		for (int n=x;n<y;n++) {
			boolean prime = true;
		int i=2;
		while(i<=n/2) {
			if(n%i==0) {
				prime =false;
				break;
			}
				i++;
				
		}
		if (prime) {
			primes.add(n);
			
		}
		}
		return primes;
				
		
		
	
		
	}
	
}

		
