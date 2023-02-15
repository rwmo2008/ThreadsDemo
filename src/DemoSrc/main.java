package DemoSrc;

public class main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " has started.");
		
		Runnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.setName("Thread A");
		thread.start();
		Thread.sleep(10);
		thread.interrupt();
		thread.join();
		
		System.out.println(Thread.currentThread().getName() + " has completed.");
	}

}
