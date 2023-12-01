import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char [] arr = {'a','e','i','o','u'};
		char [] arr2 = input.toCharArray();
		int count =0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr2[i]==arr[j]) {
					count++;
					break;
				}
			}
		}if(count>=5) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
		
			}
		}
		

	


