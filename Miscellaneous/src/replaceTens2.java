import java.util.Scanner;

public class replaceTens2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int [] arr = new int[limit];
		
		for(int i=0;i<limit;i++) {
			arr[i]=sc.nextInt();
		}
		int [] k=replace(limit,arr);
		
		for(int j :k) {
			System.out.println(j);
		}
	
			
		
		

	}
	static int [] replace(int limit,int [] arr) {
		int count =0;
		for(int i=0;i<limit;i++) {
			
			if(arr[i]!=10) {
				arr[count]=arr[i];
				count ++;
				
			}
			
			
			
			
				
		}
		for(int i=(limit-count)+1;i<limit;i++) {
			
			arr[i]=0;
			
		}
		return arr;
	}

}
