package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class j03HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			
			hm.put(0, "Hello");
			hm.put(1,"Bye");
			hm.put(42,"Morning");
			hm.put(3,"Evening");
			String s1=hm.get(1);
			System.out.println(s1);
			System.out.println(hm.get(42));
			System.out.println(hm.remove(42)); // rEMOVE ELEMENT FROM HASHmAP
			System.out.println(hm);
			
			Set s=hm.entrySet();
			Iterator it=s.iterator();
			//System.out.println(it.next()); // both key and value print together
			
			while(it.hasNext()) {
			
				 Map.Entry me=(Map.Entry)it.next();
				 System.out.println(" Key :"+me.getKey()+" Value :"+me.getValue());
			}
			
			
	}

}
