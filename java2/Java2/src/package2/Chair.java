package package2;
import java.util.*;

public class Chair  extends Furniture{

	private int noOfLegs;
	
	public void Chair() {
		
	}

	public Chair(String name, String colour, int noOfLegs) {
		super(name, colour);
		this.noOfLegs = noOfLegs;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public void acceptDetais()
	{
		super.acceptDetails();
		System.out.println("enter no of legs");
		Scanner sc=new Scanner(System.in);
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("no of legs is"+ noOfLegs);
	}
}

	
	
	

	
		
	

	
	


