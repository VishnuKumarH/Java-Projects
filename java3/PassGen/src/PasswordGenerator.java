import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String [] args) {
		
	
	Scanner sc = new Scanner(System.in);
    String fName=sc.next();
    String lName = sc.next();
    int age = sc.nextInt();
    int n = fName.length();
    String firstName = fName.substring(0,1).toUpperCase()+fName.substring(1,n-1);
    System.out.println(firstName+lName.substring(1)+"@"+age);
    
	}  
	
}
