package collection.demo;

import java.util.LinkedList;
//insertion and removal is better in linked list the array list

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> numList = new LinkedList<>();
		numList.add(2);
		numList.add(4);
		numList.add(5);
		numList.add(0, 3);
		System.out.println(numList.get(0));

		
		
		

	}

}
