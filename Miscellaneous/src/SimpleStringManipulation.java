import java.util.Scanner;

public class SimpleStringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		String str =getString(input);
		System.out.println(str);
	      
		

	}
	static String getString(String input) {
		
		 StringBuffer sb = new StringBuffer();
		 if(input.charAt(0)=='j') {
			 sb.append(input.charAt(0)).append(input.substring(2));
			   String result = sb.toString();
			   return result;
			 
		 }
		 if(input.charAt(1)=='i') {
			 sb.append(input.charAt(0)).append(input.substring(2));
			 String result=sb.toString();
			 return result;
		 }
		 
		return input.substring(2);
			
		}
		
	}


