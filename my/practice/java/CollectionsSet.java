package practice.java.impl;

import java.util.*;
/*
 * [34, 22, 10, 60, 30]
 * The sorted set is:
 * [10, 22, 30, 34, 60]
 * 
 */

public class CollectionsSet {

	Set<Integer> a1 = new HashSet<Integer>();
	public static void main(String[] args) {
	int count[] = {34,22,10,60,30,22};
    Set<Integer> set = new HashSet<Integer>();
    try {
       for(int i = 0; i < 5; i++) {
          set.add(count[i]);
       }
       System.out.println(set);

       Set sortedSet = new TreeSet<Integer>(set);
       System.out.println("The sorted set is:");
       System.out.println(sortedSet);

       System.out.println("The First element of the set is: "+ (((SortedSet<Integer>) set).first()));
       System.out.println("The last element of the set is: "+ (((SortedSet<Integer>) set).last()));
    }
    catch(Exception e) {}
 }
	
	
}
