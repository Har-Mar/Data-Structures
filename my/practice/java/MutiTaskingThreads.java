package practice.java.impl;

/**
 * Hello World! 
 * Inside Sum of int Thread-0
 * result9
 * Inside subtractThread-1
 * Inside division of int main
 * Always executed finally
 * Inside division of int Thread-2
 *  Always executed finally
 *  result0
 *  result9
 *
 */
public class MutiTaskingThreads  {


	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello World! ");
		MutiTaskingThreads obj = new MutiTaskingThreads();
	 
		Thread t1 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	int result =obj.sum(4, 5);
		   	 System.out.println("result" + result);
		    }
		});  
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	int result = obj.subtract(14, 5);
		   	 System.out.println("result" + result);
		    }
		});  
		t2.start();
		
		Thread t3 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	 int result = obj.division(4, 5);
		    	 System.out.println("result" + result);
		    }
		});  
		t3.start();

		try {
			obj.division(10, 10);
		} catch (RuntimeException ex) {
			System.out.println("Message is :" + ex.getMessage());
		}

	}

	public int sum(int a, int b) {
		System.out.println("Inside Sum of int "+Thread.currentThread().getName());
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int subtract(int a, int b) {
		System.out.println("Inside subtract "+Thread.currentThread().getName());
		try {
			Thread.currentThread();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a - b;
	}

	private int division(int a, int b) {
		System.out.println("Inside division of int "+Thread.currentThread().getName());
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException ex) {
			System.out.println(" ArithmeticException  in catch");
			throw new RuntimeException("Don't divide by zero");

		} finally {
			System.out.println(" Always executed finally");
		}
		return c;
	}

	
}