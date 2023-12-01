import java.util.Scanner;

public class SumofDigitsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		
		int digit =0;
		char [] ch = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			
			if(Character.isDigit(ch[i])) {
				
				digit+=Character.getNumericValue(ch[i]);
			
				}
			
			
			}
		if(digit>=1) {
			System.out.println(digit);
		}else {
			System.out.println("-1");
		}
		
	
	}
	}

				
				
		
	


