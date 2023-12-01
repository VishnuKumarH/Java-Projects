import java.util.Scanner;

public class RemovingEvenVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
	    StringBuilder sb = new StringBuilder();
		
		
		
		
			for(int i=0;i<input.length();i++) {
				if (i%2==0) {
					System.out.println(i);
					sb.append(input.charAt(i));
				}else if(i%2!=0) {
					
					if(input.charAt(i)!='a'&&input.charAt(i)!='e'&&input.charAt(i)!='i'&&input.charAt(i)!='o'&&input.charAt(i)!='u') {
					sb.append(input.charAt(i));
				}
				}
			}
			//result =sb.toString();
			System.out.println(sb.toString());
			
		}

	}


