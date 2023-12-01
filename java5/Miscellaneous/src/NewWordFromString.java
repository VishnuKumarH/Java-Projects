import java.util.Scanner;

public class NewWordFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		String a="";
		for(int i=0;i<n;i++) {
			a=a+str.charAt(i);
		}
		StringBuilder sb = new StringBuilder(str);
		int len =sb.length();
		sb.delete(0, len-n);
		
		String b=sb.toString();
		System.out.println(a+b);
		
		

	}

}
