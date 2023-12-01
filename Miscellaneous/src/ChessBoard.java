import java.util.Scanner;

public class ChessBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int [][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i=0;i<rows;i++) {
			boolean chess = false;
			for(int j=0;j<cols;j++) {
				if() {
					chess = true;
				}
			}if(chess==true) {
				System.out.println("true");
				break;
			}else {
				System.out.println("false");
				System.out.println("1");
				break;
			}
		}

	}

}
