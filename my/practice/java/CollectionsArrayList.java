package practice.java.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Output :
 * 
 *ArrayList Elements   :  [1, 2, 3]
 *Size of List : 3
 *Checks if there is an element 4 : false
 *Adding an Element to the list  : true
 *Sublist of elements from index value 1 through 3 are : [2, 3]
 *ArrayList Elements   :  [1, 2, 3, 4]
 *Obtaining the element from the 3rd Index value : 4
 *Hashcode for the input is : 2432963
 *[1, 2, 3, 4]
 *Element at index 3 : 2
 *After performing remove operation List is : [1, 3, 4]
 *
 *
 */
public class CollectionsArrayList{

	public static void main(String[] args) {
		  List<String> a1 = new ArrayList<String>();
	      a1.add("1");
	      a1.add("2");
	      a1.add("3");
	      System.out.print("ArrayList Elements   :  ");
	      System.out.print(a1);
	      System.out.println("\nSize of List : "+a1.size());
	      System.out.println("Checks if there is an element 4 : "+a1.contains("4"));
	      System.out.println("Adding an Element to the list  : "+a1.add("4"));
	      System.out.println("Sublist of elements from index value 1 through 3 are : "+a1.subList(1, 3));
	      System.out.print("ArrayList Elements   :  ");
	      System.out.print(a1);
	      System.out.println("\nObtaining the element from the 3rd Index value : "+a1.get(3));
	      if(a1.size()!=0) {
	      System.out.println("Hashcode for the input is : "+a1.hashCode());
	      System.out.print("List before applying remove operation  : "+a1);
	      System.out.println("\nElement at index 3 : "+a1.remove(1)+"\nAfter performing remove operation List is : "+a1);
	      }  
	      }
}
