import java.util.Scanner;

public class Digit2 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     int input = sc.nextInt();
       System.out.println(getDigitSum(input));  
     	

	}
	
	static int  getDigitSum(int input) {
		int sum=0;
		
		
		if(input>9) {
			String s = input +"";
			char [] ch = s.toCharArray();
			
			for(char k : ch) {
				int digit =Character.getNumericValue(k);
				//System.out.println(digit);
				sum =sum+digit;
			}
		
		}
			
			
		
		
		if(sum>9) {
		return getDigitSum(sum);
		}
		return sum;
		
		
		
	
			
		
	}
	
		
	}
	
	


