package com;
//import java.util.Scanner;
class Addition extends Thread{
	
	int sum = 4+5;
	public void run() {
		System.out.println("The Sum of a and b = " + sum);
	}
}
class Subtraction extends Thread{
	int diff = 4-5;
	public void run() {
		System.out.println("The diff of a and b = " + diff);
	}
}
public class AddSub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		 int a = input.nextInt();
	     int b = input.nextInt();*/
		
	    Addition x = new Addition();
		x.start();
		Thread.sleep(5000);;
		
		
		Subtraction y = new Subtraction();
		y.start();
		Thread.sleep(5000);
		
	}

}
