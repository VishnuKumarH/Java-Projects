import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String a = sc.nextLine();
		String b= sc.nextLine();
		a=a.replace(" ", "");
		b=b.replace(" ", "");
		char [] arr = new char[a.length()];
		char [] arr2 = new char[b.length()];
		for(int i=0;i<a.length();i++) {
			arr[i]=a.charAt(i);
		}
		Arrays.sort(arr);
		
		
		for(int i=0;i<b.length();i++) {
			arr2[i]=b.charAt(i);
		}
		Arrays.sort(arr2);
		
		boolean flag =false;
		for(int i=0;i<a.length();i++) {
		if(arr[i]==arr2[i]) {
			flag=true;
			
		}
		else {
			flag =false;
		}
		}
		
		if(flag) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}

}
