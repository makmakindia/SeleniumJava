package JavaCollections;

import java.util.LinkedList;

public class j01ListLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10); // adds element to linkedlist
		ll.add(101);
		System.out.println(ll);
		ll.add(1001);
		ll.add(10001);
		
		System.out.println(ll);
		System.out.println(ll.getFirst()); // print first element
		System.out.println(ll.getLast()); // print last element
		ll.add(50);
		System.out.println(ll);
		ll.removeLast(); // remove element from liskedlist
		System.out.println(ll);
		System.out.println(ll.isEmpty()); // list is empty ?
		System.out.println(ll.size()); //size of linkedlist
		System.out.println(ll.removeAll(ll)); // remove all elements 
		System.out.println(ll);
		ll.add(0, 69); //add value at index 0
		System.out.println(ll);
		ll.set(0, 79);
		System.out.println(" set value at index  0 to 79:"+ll);
		
		
	}

}
