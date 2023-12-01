package package2;

 class ClassK {

	public ClassK() {
		System.out.println("class a constructor");
		
	}
}

 class ClassB  extends ClassK{
	public ClassB() {
		System.out.println("class b constructor");
	}
 }
 class ClassC extends ClassB{
	
	public ClassC() {
		System.out.println("class c constructor");
	}

}
 class ClassD extends ClassC {
	public ClassD () {
		System.out.println("class d constructor");
	}
 }

 
public class ClassA 
{
	public static void main(String[] args) {
		ClassD obj= new ClassD();
		
		
	}
	

 }

	
	


