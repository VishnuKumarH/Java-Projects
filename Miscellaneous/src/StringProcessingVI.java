import java.util.Scanner;

public class StringProcessingVI {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String a = sc.next();
		String b= sc.next();
		int n = sc.nextInt();
		System.out.println(StringProcessing(a,b,n));
		
		

	}
       static boolean  StringProcessing(String a,String b,int n) {
    	   a=a.toUpperCase();
    	   b=b.toUpperCase();
    	   
    	   boolean t =true;
    	   boolean f =false;
    	   String rev ="";
    	   for(int i=b.length()-1;i>=0;i--) {
    		   rev =rev+b.charAt(i);
    		   
    	   }
    	  
    	   if(a.charAt(n-1)==rev.charAt(n-1)) {
    		   return t;
    	   }
    	   return f;
       }
}
