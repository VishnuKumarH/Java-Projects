import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Converter {

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int choice =0;
			String roman="";
			int digit=0;
			System.out.println(" Select 1 for Roman to integer ");
			System.out.println("Select 2 for integer to roman");
			
			choice = sc.nextInt();
			if(choice ==1) {
				System.out.println("enter roman");
				roman = sc.next();
				toNumber(roman);
			}else if(choice ==2) {
				System.out.println("enter number");
				digit = sc.nextInt();
				toRoman(digit);
			}
			
	}
		
		static void toNumber(String roman) {
			int result =0;
			int prev =0;
			for(int i=roman.length()-1;i>=0;i--) {
				char c=roman.charAt(i);
				int current =0;
				switch(c) {
				case 'I' :
					current =1;
					break;
				case'V' :
					current =5;
					break;
				case 'X':
				current =10;
				break;
				case 'L':
					current =50;
					break;
				case 'C' :
					current =100;
					break;
				case 'M':
					current =1000;
					break;
 				
				
				}
				if(current<prev) {
					result-=current;
				}else {
					result+=current;
				}
				prev=current;
			}
			System.out.println(" number =  "+result);
			
		}
		
		static void toRoman(int digit) {
			String str="";
			List <String> list = new ArrayList<>();
			String[] rom= {"M","D","C","L","X","IX","V","IV","I"};
			int[] num={1000,500,100,50,10,9,5,4,1};
			
			
				for(int i=0;i<num.length;i++) {
					while(digit>=num[i]) {
						digit-=num[i];
						list.add(rom[i]);
					}
				}
				
				for(String s:list) {
					str+=s;
				}
			
				System.out.println(str);
				
			
			
			
		}
}

	
		
	


