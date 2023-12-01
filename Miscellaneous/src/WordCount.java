import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		String [] arr = new String [limit];
		for(int i=0;i<limit;i++) {
			arr[i] = sc.next();
			
		}
		int count =0;
		int k = sc.nextInt();
		for(int i=0;i<limit;i++) {
			if(arr[i].length()==k) {
				count++;
				
			}
		}System.out.println(count);

	}

}
