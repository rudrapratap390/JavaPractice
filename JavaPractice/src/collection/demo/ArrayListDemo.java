package collection.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/*
 * use arraylist when 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(1);
		numList.add(new Integer(3));
		numList.add(new Integer(2));
		numList.add(0,8);
		System.out.println(numList.get(3));
		System.out.println("original"+numList);
		
		Set<Integer> numSet = new HashSet<>();
		//numSet=(Set<Integer>) numList;
		
		numSet.addAll(numList);
		numList.clear();
		//numList=(ArrayList<Integer>) numSet;
		numList.addAll(numSet);
		System.out.println("After removing duplicates"+numList);
		
		/*for(int index=0;index<numList.size();index++) {
			System.out.println(numList.get(index));
		}*/
		
		/*Collections.reverse(numList);
		Collections.sort(numList);
				*/
		/*Iterator<Integer> numListItr = numList.iterator();
		
		while(numListItr.hasNext()) {
			
			System.out.println(numListItr.next());
			
		}*/
		


	}

}
