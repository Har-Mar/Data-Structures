package my.practice.java;

import java.util.Arrays;

public class StackUsingArray {
	int array[] = new int[size];
	public int bottom;//first element of the array
	public int Top;//last element of an array
	private static int size = 10;//setting the size of an array


	public StackUsingArray(){
		//giving the initial index of an array
		bottom = -1; 
		Top = -1;
	}
	
	public int[] push(int e) {
		if(bottom <= size) {
		++Top;
		array[Top]=e;
		}
      return array;
	}
	
	public boolean empty() {
		boolean boolval = true;
		if(Top == -1) {
			System.out.println("\nStack is empty.");
		}
		return boolval;
	}
	
	public boolean full() {
		boolean boolval = false;
		if(Top == size - 1) {
			System.out.println("\nStack has elements.\n");
		}
	    return boolval;	
	}
	
	 
	public int pop() {
		int d = 0;
		if(size!=0) {
		d = array[Top];
		Top--;
		size--;
		}
		return d;
	}
	
	public int getSize() {
		return size;		
	}
		
	public int peek() {
		return array[bottom + 1];
	}
	
	public int lastvalue() {
		return array[Top];
	}
	
	
	/*
	 * Before pushing values into a stack.
	 * Stack is empty.
	 * Is the stack empty : true
	 * Size of the array is : 10
	 * Stack has elements.
	 * Is the stack empty : false
	 * Values in a Stack are : [4, 8, 12, 16, 20, 24, 28, 32, 36, 40]
	 * First value of the stack : 4
	 * Last popped out element is : 36
	 * Last value of the stack : 32
	 * 
	 */
	public static void main(String[] args) {
        int resultarray[],element;
		StackUsingArray customstack = new StackUsingArray();
		System.out.println("\nBefore pushing values into a stack.");
		System.out.println("\nIs the stack empty : " + customstack.empty());
		System.out.println("\nSize of the array is : " + customstack.getSize());
		
		resultarray = customstack.push(4);
		resultarray = customstack.push(8);
		resultarray = customstack.push(12);
		resultarray = customstack.push(16);
		resultarray = customstack.push(20);
		resultarray = customstack.push(24);
		resultarray = customstack.push(28);
		resultarray = customstack.push(32);
		resultarray = customstack.push(36);
		resultarray = customstack.push(40);
		System.out.println("Is the stack empty : " + customstack.full());
		System.out.println("\nValues in a Stack are : " + Arrays.toString(resultarray));
		System.out.println("\nFirst value of the stack : " + customstack.peek());
		element = customstack.pop();
		element = customstack.pop();
		System.out.println("\nLast popped out element is : " +element);
		System.out.println("\nLast value of the stack : " + customstack.lastvalue());
	}
}

