package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class j01ListVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.addAll(ar);
		//System.out.println(ar);
		
		Vector lv=new Vector();
		
		Vector vClone=new Vector();
		
		
		
		lv.add(1);
		lv.add(2);
		lv.add("Arun");
		lv.add("Student");
		lv.add(3);
		System.out.println(lv);
		lv.addAll(4,ar);
		System.out.println(lv);
		
		vClone = (Vector) lv.clone(); // Clone list
		System.out.println(vClone);
		
		lv.removeAll(ar);
		System.out.println(lv);

		
	}

}
