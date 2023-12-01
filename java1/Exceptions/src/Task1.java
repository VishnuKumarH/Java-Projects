
import java.io.*;
import java.util.*;

class DenominatorException extends Exception
{
	public DenominatorException (String errormsg)
	{
		super(errormsg);
	}
}
class input{
	
	public static void calculatePercentage(int x,int y) throws DenominatorException
	{
		
		
	    if (x<2 || y==8)
	    {
	    	throw  new DenominatorException ("x should be greater than  and 3 not equal to 8");
	    } 
	    else {
	      int result =	(x+y/100);
	      System.out.println(result);
	    }
	    
	    }
	}





public class Task1 {

	public static void main(String[] args) {
		input input1 = new input();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input x");
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();
		try {
			input.calculatePercentage(x,y);
		}
		catch (DenominatorException e){
			System.out.println(e.getMessage());
			
			
		}
	}

}
