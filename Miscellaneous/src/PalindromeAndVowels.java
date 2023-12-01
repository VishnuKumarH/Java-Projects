import java.util.Scanner;

public class PalindromeAndVowels {
	
	
  public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String s= sc.next();
	String s2="";
	
	StringBuilder sb = new StringBuilder(s);
	 sb =sb.reverse();
	 
	 s2=sb.toString();
	 boolean flag=false;
	 if(s.equals(s2)) {
		 flag=true;
	 }else {
		 flag=false;
	 }
	 int count =0;
	 
	 for(int i=0;i<s.length();i++) {
		 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			 count++;
		 }
		
	 }if(count>=2 && flag==true) {
		 System.out.println("valid");
		 
	 }else {
		 System.out.println("invalid");
	 }
	
}
}
