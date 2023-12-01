import java.util.regex.Matcher;
import java.util.regex.Pattern;


@FunctionalInterface
interface A{
	void show();
	
}


/*class B implements A{

	@Override
	public void show() {
	System.out.println("show");
		
	}
	
}*/

public class misl{

	public static void main(String[] args) {
		
		
		/*A obj = new A() {

			@Override
			public void show() {
				System.out.println("show");
			}
		};*/
		
		A obj =()->System.out.println("show");
		obj.show();
		
	}

	
	}

