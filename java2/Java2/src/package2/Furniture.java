package package2;
import java.util.*;
public class Furniture {
	private String name;
	private String colour;

	public Furniture(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void acceptDetails() {
		System.out.println("enter name");
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		System.out.println("enter colour");
		String colour =sc.nextLine();

	}
	public void displayDetails()
	{
		System.out.println("name is "+name);
		System.out.println("colour is "+colour);
	}

}
