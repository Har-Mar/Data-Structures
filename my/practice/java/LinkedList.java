package practice.java;

public class LinkedList {
	int data;
	LinkedList head;
	LinkedList next;
	
	public void add(int data) {
		
		LinkedList node = new LinkedList();
		
		node.data = data;
		
		if(head == null) {
			System.out.println("Head is at :"+head);
			head = node;
		}
		
		else {
			LinkedList n = head;
		
			while(n.next!=null) {
				n = n.next;
			}
		
			n.next = node;
			System.out.println("Head is at :"+head);
			System.out.println("Data at next node : "+node.data);
		}
	}
	
	public void printLL() {
		LinkedList node = head;
		
		data++;
		while(node.next!=null) {
			node = node.next;
		}
		System.out.println("Data at node "+ data +" : "+node.data);
	}
	
	/*
	 * Output obtained is :
	 * Head is at :null
	 * Data at node 1 : 4
	 * Head is at :practice.java.LinkedList@24d46ca6
	 * Data at next node : 8
	 * Data at node 2 : 8
	 * Head is at :practice.java.LinkedList@24d46ca6
	 * Data at next node : 12
	 * Data at node 3 : 12
	 * Head is at :practice.java.LinkedList@24d46ca6
	 * Data at next node : 16
	 * Data at node 4 : 16
	 * 
	 */

	
	public static void main(String[] args) {
				LinkedList values = new LinkedList();
				values.add(4);
				values.printLL();
				values.add(8);
				values.printLL();
				values.add(12);
				values.printLL();
				values.add(16);
				values.printLL();
	}
}
