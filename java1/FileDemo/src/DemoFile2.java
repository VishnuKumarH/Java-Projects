import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DemoFile2  {
	public static void main(String[]args) throws Exception {
		
	
	DataOutputStream dos = new DataOutputStream(new FileOutputStream("newFile"));
	
	dos.writeInt(100);
	dos.writeFloat( 12.2f);
	dos.writeChar('f');
	dos.writeChars("Hello world");
	dos.flush();
	dos.close();
	System.out.println("Done");
	
	
}
}
