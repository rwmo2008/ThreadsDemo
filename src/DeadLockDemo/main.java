package DeadLockDemo;

public class main {

	public static void main(String[] args) {
		Pen pen = new Pen();
		Board board= new Board();
		
		Runnable taskA = new TaskA(pen, board);
		Runnable taskB = new TaskB(pen, board);
		
		Thread a = new Thread(taskA, "Thread A");
		Thread b = new Thread(taskA, "Thread B");
		
		a.start();
		b.start();
	}

}
