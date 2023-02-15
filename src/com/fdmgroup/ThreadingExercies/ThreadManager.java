package com.fdmgroup.ThreadingExercies;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {
	protected List<Thread> threads;

	public void createThreads(int number) {
		threads = new ArrayList<>();
		for(int i = 0; i < number; i++) {
			MyRunnable myRun = new MyRunnable();
			Thread thread = new Thread(myRun);
			thread.setName("Thread " + i);
			threads.add(thread);
		}
	}

	public void runThreads() {
		for(int i = 0; i < threads.size(); i++) {
			threads.get(i).run();
		}
	}
}
