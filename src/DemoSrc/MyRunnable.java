package DemoSrc;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has started.");
		int count = 0;
		while(true) {
			System.out.println(Thread.currentThread().getName() + " is iterating: " + ++count);
			if (Thread.currentThread().isInterrupted()) {
				System.out.println(Thread.currentThread().getName() + " is interrupted!");
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() + " has completed.");

	}

}
