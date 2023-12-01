import java.util.*;
public class MainAccess {

	public static void main(String[] args) {
		System.out.println("enter petrol price");
		Scanner sc = new Scanner(System.in);
		double x = sc .nextDouble();
		System.out.println("enter km ");
		double y = sc.nextDouble();
		System.out.println("enter amount of fuel filled");
		int z=sc.nextInt();
		
		
		double litre = (double)z/x;
		double mileage = y/litre;
		
		System.out.printf("%.2f",mileage);
		
		
		
	}

}
