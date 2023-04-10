package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
//		ar.add("k");
//		ar.add("v");
//		ar.add("p");
		ar.add(3, "k");
		ar.addAll(4, ar);
		System.out.println(ar);
		
		HashMap hm = new HashMap();
		hm.put(1, "karthik");
		hm.put(2, "devi");
		hm.put(null, "devi");
		System.out.println(hm);
		
		LinkedList li = new LinkedList();
		li.push(hm);
		System.out.println(li);
		
		HashSet hs = new HashSet();
		hs.size();
	}
	

}
