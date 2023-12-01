import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b= sc.next();
		UserMainCode umc = new UserMainCode();
		String c =umc.getCombo(a,b);
		System.out.println(c);
		

	}

}
