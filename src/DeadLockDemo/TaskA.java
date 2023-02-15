package DeadLockDemo;

public class TaskA implements Runnable {
	
	private Pen pen;
	private Board board; 
	
	public TaskA(Pen pen, Board board) {
		super();
		this.pen = pen;
		this.board = board;
	}

	@Override
	public void run() {
		synchronized (pen) {
			System.out.println(Thread.currentThread().getName() + " has pen.");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (board) {
				System.out.println(Thread.currentThread().getName() + " is now writing on the board with the pen.");
			}
		}

	}

}
