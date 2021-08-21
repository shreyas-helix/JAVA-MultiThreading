package com;

import java.util.Scanner;

class Addition extends Thread {
	int a, b;

	public Addition(int a, int b) {
		// super(); //calls thread class constructor.
		this.a = a;
		this.b = b;
	}

	int sum;

	public void run() {
		sum = a + b;
		System.out.println("The Sum of a and b = " + sum);
	}
}

class Subtraction extends Thread {
	int a, b;

	public Subtraction(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int diff;

	public void run() {
		diff = a - b;
		System.out.println("The diff of a and b = " + diff);
	}
}

public class AddSub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int a = input.nextInt();
		int b = input.nextInt();

		Addition x = new Addition(a, b);
		x.start();
		Thread.sleep(5000);
		

		Subtraction y = new Subtraction(a, b);
		y.start();
		Thread.sleep(5000);

	}

}
