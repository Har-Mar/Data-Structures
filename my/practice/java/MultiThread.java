package practice.java.impl;
/*
 *  Started
 *  In run
 *  
 *  2 * 1 = 2:Thread2
 *  execute thread: Thread2 
 *  Sleep is implemented.Thread2
 *  
 *  2 * 2 = 4:Thread2
 *  execute thread: Thread2
 *  Sleep is implemented.Thread2
 *  
 *  2 * 3 = 6:Thread2
 *  execute thread: Thread2 
 *  Sleep is implemented.Thread2
 *  
 *  2 * 4 = 8:Thread2
 *  execute thread: Thread2
 *  Sleep is implemented.Thread2
 *  
 *  2 * 5 = 10:Thread2
 *  execute thread: Thread2
 *  Sleep is implemented.Thread2
 *  
 *  2 * 6 = 12:Thread2
 *  execute thread: Thread2 
 *  Sleep is implemented.Thread2
 *  
 *  2 * 7 = 14:Thread2
 *  execute thread: Thread2
 *  Sleep is implemented.Thread2
 *  
 *  2 * 8 = 16:Thread2
 *  execute thread: Thread2 
 *  Sleep is implemented.Thread2
 *  
 *  2 * 9 = 18:Thread2
 *  execute thread: Thread2
 *  Sleep is implemented.Thread2
 *  
 *  2 * 10 = 20:Thread2
 *  execute thread: Thread2
 *  Sleep is implemented.Thread2
 *  
 *  In run 
 *  
 *  2 * 1 = 2:Thread1
 *  execute thread: Thread1 
 *  Sleep is implemented.Thread1
 *  
 *  2 * 2 = 4:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 3 = 6:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 4 = 8:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 5 = 10:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 6 = 12:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 7 = 14:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 8 = 16:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 9 = 18:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  2 * 10 = 20:Thread1
 *  execute thread: Thread1
 *  Sleep is implemented.Thread1
 *  
 *  finish
 *  
 *  In run 
 *  2 * 1 = 2:Thread3
 *  execute thread: Thread3 
 *  Sleep is implemented.Thread3
 *  
 *  2 * 2 = 4:Thread3
 *  execute thread: Thread3
 *  Sleep is implemented.Thread3
 *  
 *  2 * 3 = 6:Thread3
 *  execute thread: Thread3 
 *  Sleep is implemented.Thread3
 *  
 *  2 * 4 = 8:Thread3
 *  execute thread: Thread3
 *  Sleep is implemented.Thread3
 *  
 *  2 * 5 = 10:Thread3
 *  execute thread: Thread3
 *  Sleep is implemented.Thread3
 *  
 *  2 * 6 = 12:Thread3
 *  execute thread: Thread3 
 *  Sleep is implemented.Thread3
 *  
 *  2 * 7 = 14:Thread3
 *  execute thread: Thread3
 *  Sleep is implemented.Thread3
 *  
 *  2 * 8 = 16:Thread3
 *  execute thread: Thread3
 *  Sleep is implemented.Thread3
 *  
 *  2 * 9 = 18:Thread3
 *  execute thread: Thread3
 *  Sleep is implemented.Thread3
 *  
 *  2 * 10 = 20:Thread3
 *  execute thread: Thread3 
 *  Sleep is implemented.Thread3
 * 
 */

public class MultiThread extends Thread {
	static MultiThread tables;
	private int a = 2;
	public int b;
	public int c, temp;

	public MultiThread(String string) {

	}

	public int Multiply() {
		c = a * b;
		return c;
	}

	public void run() {
		synchronized (tables) {
			try {
				System.out.println("In run ");
				for (b = 1; b < 11; b++) {
					Multiply();
					System.out.println(a + " * " + b + " = " + c + ":" + Thread.currentThread().getName() + "\n");
					System.out.println(String.format("execute thread: %s ", Thread.currentThread().getName()));
					Thread.sleep(500);
					System.out.println("Sleep is implemented." + Thread.currentThread().getName());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void start() {
		Thread thread1 = new Thread(this, "Thread1");

		Thread thread2 = new Thread(this, "Thread2");
		thread2.start();
		thread1.start();

		try {
			thread2.join();
			thread1.join();

			Thread thread3 = new Thread(this, "Thread3");
			thread3.start();
			System.out.println("finish");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println(" Started");
		tables = new MultiThread("Table");
		// scanner = new Scanner(System.in);
		// System.out.println(" Table of : "+scanner.nextInt());
		tables.start();

	}

}
