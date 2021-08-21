package com;
class MultiThreadingDemo1 implements Runnable{
	public void run() {
		System.out.println("Thread" + Thread.currentThread().getId() + " is running");
	}
}
public class MultithreadRunnable {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(i=0;i<8;i++) {
			Thread object = new Thread(new MultiThreadingDemo1());
			object.start();
		}
	}

}
