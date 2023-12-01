import java.util.ArrayList;
import java.util.Scanner;

public class CharacterOrDigitsSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input1= sc.nextLine();
		int input2= sc.nextInt();
		
		
		 
		System.out.println(abcString(input1,input2));
	}
	
	static String abcString (String input1,int input2) {
		 ArrayList<Character> list = new ArrayList<>();
		 int count=0;
		  int count2 =0;
		
	char [] ch = input1.toCharArray();
    String result="";
    String str="";
    int k=0;
    if(input1==null && input2==0||input2==1){
        result="NULL";
        }
    for(int i=0;i<ch.length;i++){

  
    
   
   
   
   
	   
   if(input2==0){
	   
   if(Character.isDigit(ch[i])){
	   count++;
        k+=Character.getNumericValue(ch[i]);
        result=k+"";
   }else if(count==ch.length)
   {
	   result="ZERO";
   }

   }
   else if(input2==1){
       if(Character.isLetter(ch[i])){
    	   count2++;
          
           list.add(ch[i]);
          
           result=list.toString();
           
           
       }else if(count2==ch.length) {
    	   result="ZERO";
       }
   }
   
    }
    
	
	

   return result;
   

}
}


