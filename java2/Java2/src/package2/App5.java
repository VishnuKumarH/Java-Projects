package package2;
class shape{
	public float calculateArea() {
		System.out.println();
		return 0.0f;
		
	}
}
class Circle extends shape{
	public float calculateArea() {
		System.out.println("3.14*l*b");
		return 0.0f;
		
	}
}
class Rectangle extends shape{
	public float calculateArea() {
		System.out.println("l*b");
		return 0.0f;
		
	}
}
class Traingle extends shape{
	public float calculateArea() {
		System.out.println("0.5*b*h");
		return 0.0f;
		
	}
}
public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	shape s;
	s=new Circle();
	s.calculateArea();
	s=new Rectangle();
	s.calculateArea();
	s=new Traingle();
	s.calculateArea();
	}

}
