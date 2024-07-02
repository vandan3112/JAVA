
//Runnable Interface

//Interface is blueprint of a class
//Interface cannot create object
//Interface can have only abstract methods

class ThreadOne implements Runnable {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Print thread one");
		}
		
		try {
			Thread.sleep(500);
		}
		
		catch(Exception e) {
			
		}
	}
}

class ThreadTwo implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Print thread two");
		}
		
		try {
			Thread.sleep(1000);
		}
		
		catch(Exception e) {
			
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		
		ThreadOne obj1 = new ThreadOne();
		ThreadTwo obj2 = new ThreadTwo();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}

}
