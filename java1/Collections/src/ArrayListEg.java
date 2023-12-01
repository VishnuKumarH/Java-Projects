import java.io.*;
import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> country = new ArrayList<String>();
		country.add("india");
		country.add("japan");
		country.add("china");
		country.add("usa");
		country.remove(3);
		System.out.println(country.size());
		for(int i=0;i<country.size();i++)
		{
			System.out.println(country.get(i));
		}
		

	}

}
