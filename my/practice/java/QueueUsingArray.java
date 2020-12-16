package practice.java;

import java.util.Arrays;

public class QueueUsingArray {
	
	private static int size = 5;//setting the size of an array
	
	int array[] = new int[size];
	public int fin;//first element of the array
	public int fout;//last element of an array
	


	public QueueUsingArray(){
		//giving the initial index of an array
		fin = -1; 
		fout = -1;
	}
	
	public int[] enqueue(int e) {
		if(fin <= size) {
		++fout;
		array[fout]=e;
		}
      return array;
	}
	 
	public int dequeue() {
		int d = 0;
		if(size!=0) {
		fin++;
		d = array[fin];
		size--;
		}
		return d;
	}
    public void printQueue(){
		for(int i=0; i< array.length; i++){
			System.out.print(" "+array[i]);
		}
		System.out.println();
	}

	/**
	Results after excuting this main
	
	Elements in the queue are : 
        4 8 12 16 20

        Dequeued element is: 4

        Dequeued element is: 8
	**/
	public static void main(String[] args) {

		QueueUsingArray queueUsingArray = new QueueUsingArray();
		System.out.println("Elements in the queue are : ");
		queueUsingArray.enqueue(4);
		queueUsingArray.enqueue(8);
		queueUsingArray.enqueue(12);
		queueUsingArray.enqueue(16);
		queueUsingArray.enqueue(20);
		queueUsingArray.printQueue();
		int element = queueUsingArray.dequeue();
		System.out.println("\nDequeued element is: "+ element);
		element = queueUsingArray.dequeue();
		System.out.println("\nDequeued element is: "+ element);
		
	}
}
