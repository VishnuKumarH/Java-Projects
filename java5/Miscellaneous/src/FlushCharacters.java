import java.util.Scanner;

public class FlushCharacters {

	public static void main(String[] args) {
	       Scanner sc =  new Scanner (System.in);
	       String input = sc.nextLine();
	       
	       
	      String result= input.replaceAll("[a-z A-Z]", "");
	      System.out.println(result);
	       
	       
	    		 
	

}
}
