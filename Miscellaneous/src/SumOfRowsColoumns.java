import java.util.Scanner;

public class SumOfRowsColoumns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		int coloumns = sc.nextInt();
		int [][] arr= new int[rows][coloumns]; 
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumns;j++) {
			
				arr[i][j] = sc.nextInt();
				
				
				
			}
			
			
		}
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<coloumns;j++) {
				sum +=arr[i][j];
			}
			System.out.println(sum+"\t");
		}
		
		for(int j=0;j<coloumns;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum+=arr[i][j];
			}
			System.out.println(sum+"\t");
		}
			

	}

}
