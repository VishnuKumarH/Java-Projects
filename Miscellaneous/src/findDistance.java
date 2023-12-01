import java.util.Scanner;

public class findDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1= sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int result =(int)Math.round(Math.sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))));
		
		
		System.out.println(result);

	}

}
