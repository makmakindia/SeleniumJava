package JavaCollections;

import java.util.ArrayList;

public class j01ListsArrayList {
	
	// ArrayList, LinkedList and Vector - implements List Interface
	// Array has fixed size and arrayLiat can grow dynamically
	// Using ArrayList you can access and insert any value at any index
	// Can accept duplicate value 
	// operations add, remove , print
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("Arun");

		System.out.println(al);
		//al.add(0, "Kumar");
		al.add(0,"Student");
		al.add(0,"Student");
	
		al.add(0,"Student");
		System.out.println(al);
//		al.remove(0);
//		al.remove("Java");
//	System.out.println(al);
		
		System.out.println(al.get(2));
		System.out.println(al.contains("Testing"));
		System.out.println(al.indexOf("Student"));
		System.out.println(al.getClass());
		System.out.println(al.isEmpty());
		System.out.println(al.hashCode());
		System.out.println(al.size());
		
	}

}
