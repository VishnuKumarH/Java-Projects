import java.util.Scanner;

public class PercentageOfRuns {

	public static void main(String[] args) {
		System.out.println("enter total score");
		Scanner sc = new Scanner(System.in);
		float runs  = sc.nextInt();
		System.out.println("enter number of 4s");
		float fours = sc.nextInt();
		System.out.println("enter number of sixs");
		float sixs = sc.nextInt();
		
		
		float i= fours*4;
		float j=sixs*6;
		float k=i+j;
		float z=runs-k;
		
		System.out.printf("%.2f",(z/runs)*100);
		
		
		

	}

}
