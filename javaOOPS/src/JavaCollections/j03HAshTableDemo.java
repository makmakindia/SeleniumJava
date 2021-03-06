package JavaCollections;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class j03HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(0, "Hello");
		ht.put(1,"Bye");
		ht.put(42,"Morning");
		ht.put(3,"Evening");
		String s1=ht.get(1);
		System.out.println(s1);
		System.out.println(ht.get(42));
		System.out.println(ht.remove(42)); // rEMOVE ELEMENT FROM HASHmAP
		System.out.println(ht);
		
		Set s=ht.entrySet();
		Iterator it=s.iterator();
		//System.out.println(it.next()); // both key and value print together
		
		while(it.hasNext()) {
		
			 Map.Entry me=(Map.Entry)it.next();
			 System.out.println(" Key :"+me.getKey()+" Value :"+me.getValue());
		}
		
		/* HashMap
		1. Non Synchronized and not thread safe , other threads are not waiting and accessed non synchronized manner 
		 - possible to get thread failed for program		
		2. accepts Null keys and Null values 
		3. Iterating the values 
		
		HashTable 
		1. Synchronized , used in multi threading apps 
		->  Operation is perfoemed only  one program is accessing table other thread should be waiting state
		2. Not allows  NULL Keys and Values
		3. Enumurator 
		
		
		*/
	}

}
