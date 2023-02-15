package com.fdmgroup.ThreadingExercies;

public class Runner {

	public static void main(String[] args) {
		ThreadManager threadManager = new ThreadManager();
		threadManager.createThreads(5);
		threadManager.runThreads();
	}

}
