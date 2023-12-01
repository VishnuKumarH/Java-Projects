
public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread( new Mywork()::work);
		t1.start();

	}

}
