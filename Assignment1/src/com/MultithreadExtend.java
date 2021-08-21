package com;

class MultithreadingDemo extends Thread {
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + "is running");
	}
}

public class MultithreadExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}

	}
}
