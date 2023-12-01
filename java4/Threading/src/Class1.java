
public class Class1 {
	public synchronized void method1() {
		System.out.println("even Starting");
		for(int i =2;i<40;i+=2 ) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch ( Exception e) {
				System.out.println("error");
				
			}
			System.out.println("odd Starting");
			for(int j =1;j<40;j+=3) {
				System.out.println(j);
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					System.out.println("error");
				}
			}
			
		}
		
		
	}

}
