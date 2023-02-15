package com.fdmgroup.ThreadingExercies;

import java.util.ArrayList;

public class ThreadManagerChild extends ThreadManager {
	
	@Override
	public void createThreads(int number) {
		threads = new ArrayList<>();
		for(int i = 0; i< number; i++) {
			Thread thread = new Thread(new Runnable);
		}
	}
}
