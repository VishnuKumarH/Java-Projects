import java.util.Scanner;

public class ProgrammingLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result =getLuckySum(a,b,c);
		System.out.println(result);
		
		

	}
	
	static int getLuckySum(int a,int b,int c) {
		
		if(a==13) {
			return c;
		}
		else if(b==13) {
			return a;
		}
		else if(c==13) {
			return a+b;
		}
		else
			return a+b+c;
	}
	

}
