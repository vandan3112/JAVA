package synchronization;

//Synchronization process

class Counter {
	private int count;
	
	public synchronized void increment() {
		count = count+1;
	}
	
	public int getCount() {
		return count;
	}
}
public class Synchronized {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i=0;i<20;i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<20;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.getCount());
	}

}
