package DeadLockDemo;

public class TaskB implements Runnable {

	private Pen pen;
	private Board board; 
	
	public TaskB(Pen pen, Board board) {
		super();
		this.pen = pen;
		this.board = board;
	}

	@Override
	public void run() {
		synchronized (board) {
			System.out.println(Thread.currentThread().getName() + " has the board.");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (pen) {
				System.out.println(Thread.currentThread().getName() + " is now writing on the board with the pen.");
			}
		}

	}
	
}
