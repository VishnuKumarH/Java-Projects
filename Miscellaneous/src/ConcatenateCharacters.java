import java.util.Scanner;

public class ConcatenateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		String [] arr = new String [limit];
		String result ="";
		int len =0;
		
		for(int i=0;i<limit;i++) {
			 arr[i]=sc.next();
			
		}
		for(String s :arr) {
			len =s.length();
			result =result+s.charAt(len-1);
		}
		
		System.out.println(result);
		
		

	}

}
