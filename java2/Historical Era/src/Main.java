import java.util.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("enter year");
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		
		x =(x/100)+1;
		
		if (x>0 && x<=2) {
			System.out.println(x);
			System.out.println("pre historical period");
			
			
		}else if(x>2 && x<=6 ) {
			System.out.println(x);
			System.out.println("vedic period");
		
			
		}else if (x>6 && x<=13) {
			System.out.println(x);
			System.out.println("second urbanization");
			
		}else if (x>13 && x<=18) {
			System.out.println(x);
			System.out.println("early modern peroid");
			
		}else { System.out.println(x);
			System.out.println(" modern period");
		}
		

	}

}
