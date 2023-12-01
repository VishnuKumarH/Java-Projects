import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class commonUniqueString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		a = a.replace(" ", "");
		b = b.replace(" ", "");

		StringBuilder sb1 = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder(b);

		for (int i = 0; i < sb1.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < sb1.length(); j++) {

				if (sb1.charAt(i) == sb1.charAt(j)) {
					count++;
					sb1.deleteCharAt(j);
				}
			}
			if (count >= 1) {
				sb1.deleteCharAt(i);

			}
		}
		for (int i = 0; i < sb2.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < sb2.length(); j++) {
				if (sb2.charAt(i) == sb2.charAt(j)) {
					count++;
					sb2.deleteCharAt(j);

				}
			}
			if (count >= 1) {
				sb2.deleteCharAt(i);
			}
		}
		int c=0;
		
		for(int i=0;i<sb1.length();i++) {
			for(int j=0;j<sb2.length();j++) {
				if(sb1.charAt(i)==sb2.charAt(j)) {
					c++;
					
				}
				
			}
		}
		System.out.println(c);
		

	}
}
