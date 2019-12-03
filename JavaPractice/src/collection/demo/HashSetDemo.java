package collection.demo;

import java.util.HashSet;
import java.util.TreeSet;
/*
 * HashSet can store null values
 * there is no guarantee in order
 * HashSet internally uses HashMap
 * 
 * TreeSet-sorted to n natural order
 * can not store null values
 * 
 */

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> numSet = new HashSet<>();
		numSet.add(1);
		numSet.add(1);
		numSet.add(2);
		numSet.add(3);
		numSet.add(4);
		numSet.add(null);
		System.out.println(numSet);
		
		TreeSet<Integer> numSet1 = new TreeSet<>();
		
		numSet1.add(2);
		numSet1.add(1);
		numSet1.add(10);
		//numSet1.add(null);
		System.out.println(numSet1);
		
		

		
		
		

	}

}
