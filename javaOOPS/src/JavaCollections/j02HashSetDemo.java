package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class j02HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet,  treeSet, LinkedHashSet - implements set interface
		// Does not accepts duplicate
		// no guarantee that elements stores sequential order.. Random orfder
		
		
		HashSet hs=new HashSet<String>();
		hs.add("Student1");
		hs.add("Student2");
		hs.add("Student3");
		hs.add("Student4");
		hs.add("UK");
		hs.add("RUSSIA");
		hs.add("USA");
		hs.add("USA");
		hs.add("USA");
		hs.add("USA");
		System.out.println(hs);
		
		hs.remove("USA");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.getClass());
		hs.add("INDIA");
		hs.add("he");
		hs.add("She");
		System.out.println(hs);
		//Iterator
		
		Iterator<String> i = hs.iterator();
		
		//i.next();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		
		
		
	}

}
