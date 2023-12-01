
	class Odd extends Thread
	{
		public void run()
		{
			while (true) {
				System.out.println("even");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class Even extends Thread
	{

		@Override
		public void run() {
			while(true) {
				System.out.println("odd");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	public class App1 {

		public static void main(String[] args) {
			Thread t1=new Thread(new Odd());
			Thread t2=new Thread(new Even());
			
			t1.start();
			t2.start();
		}

	}


