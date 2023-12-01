import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathisFun {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int o=sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		
		int k=0;int i=0;
		int c=0;
		int a=0;int b=1;
		String s ="";
		
		
		while(k==0) {
			
			c=a+b;
			
			a=b;
			b=c;
			
			
			s =c+"";
			
			list.add(c);
			
			if(s.length()==o) {
				
				i=list.indexOf(c);
				k=1;
				break;
				
			}	
		}
		System.out.println(i);
		
		
		
	}

	
	

}
