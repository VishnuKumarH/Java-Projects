import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoFile3 {

	public static void main(String[] args) throws IOException {
		
		
		DataInputStream dis = new DataInputStream(new FileInputStream("newFile"));
		int i = dis.readInt();
		float f = dis.readFloat();
		char c = dis.readChar();
		String s = dis.readLine();
		
		
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
		System.out.println(s);
	   
		
		

	}

}
