package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CollectionExample {
	
	public void arrayExample() {
		
		String lastname = "Farberov";
		System.out.println(lastname);
	
		String[] names = {"Arkady","Maya","Ethan","Nathan","Nikola"};
//		normal ==> dynamic
		for( int i =0;i<names.length;i++)
		System.out.println(names[i]);
	    
	
//	array's loop ==> for each loop
	for (String str:names) {
		
		System.out.println(str);
	}
        System.out.println("done");
	}
	
	public void setExample() {
		
		//SLL
//		HashSet<String>names = new HashSet<>();
//		names.add("Arkady");
//		names.add("Maya");
//		
//		System.out.println(names);
//		
//		Iterator<String> str = names.iterator();
//		
//		while(str.hasNext()) {
//			System.out.println(str.next());
//		}
		
		LinkedHashSet<String> names = new LinkedHashSet<>();
		names.add("Ethan");
		names.add("Nathan");
		names.add("Nikola");
		
		System.out.println(names);
		
		Iterator<String> str = names.iterator();
		while(str.hasNext()) {
			
			System.out.println(str.next());
		}
	}
	public void listExample() {
		
//		SLL
		ArrayList<String> names = new ArrayList<>();
		names.add("Farberovs");
		names.add("Arkady");
		names.add("Maya");
		
		System.out.println(names);
		System.out.println(names.get(2));
		
		names.add(0, "Family");
		names.add(3, "Ethan");
		names.add(4, "Nathan");
		names.add(5, "Nikola");
		System.out.println(names);
	}
	
	public void mapExample() {
//		SLL
		
//		HashMap<String,String> s1 = new HashMap<>();
//		s1.put("first name", "Maya");
//		s1.put("last name", "Farberov");
//		
//		System.out.println(s1);
//		System.out.println(s1.get("first name"));
		
//		DLL
		LinkedHashMap<String,String> s1 = new LinkedHashMap<>();
	    s1.put("fn", "Maya");
		
		System.out.println(s1);
		System.out.println(s1.get("fn"));
	}

	public static void main(String[] args) {
		
		CollectionExample obj = new CollectionExample();
//		obj.arrayExample();
		obj.setExample();
        obj.listExample();
        obj.mapExample();
	}

}
