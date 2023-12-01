import java.util.ArrayList;
import java.util.Scanner;

public class sumOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum =0;
		
		
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i=1;i<=input;i++) {
			
			if(i%2!=0) {
				list.add(i);
				
			}
			
			
		}
		for(int i:list) {
			sum=sum+i;
		}
		System.out.println(sum);
		

	}

}
