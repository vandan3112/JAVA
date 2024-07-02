
public class MyThreadExecution {

	public static void main(String[] args) {
		
		MyThread A1 = new MyThread();
		System.out.println("Before runnable stage THread is alive or not?"+A1.isAlive());
		A1.start();
		
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			System.out.println("Thread is Interrupted.");
		}
		
		System.out.println("After complete execution of Thread is alive or not?"+A1.isAlive());
	}

}
