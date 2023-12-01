import java.util.Scanner;

public class IpValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input =input.replaceAll("[.]", ",");
		
		String[] str = input.split(",");
		boolean flag = false;
		for(int i=0;i<str.length;i++) {
			int k = Integer.parseInt(str[i]);
			if(k>0&&k<255) {
				
				flag = true;
			}else {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("valid");
		}else
			
			System.out.println("invalid");
		
	
		
	}


}