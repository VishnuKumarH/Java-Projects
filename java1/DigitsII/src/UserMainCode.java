
public class UserMainCode {
	public static int getDigitSum(int input) {
		
		
           int sum=0;

		
		
		if(input>9) {
			String s = input +"";
			char [] ch = s.toCharArray();
			
			for(char k : ch) {
				int digit =Character.getNumericValue(k);
				sum =sum+digit;
			}
		}	
		if(sum>9) {
		return getDigitSum(sum);
		}
		return sum;	
		
	}
	
	}


