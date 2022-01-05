package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<String> cities = new ArrayList<>();
		cities.add("dd");	
	cities.add("london");
	cities.add("newyork");
	cities.add("newyork");
	cities.add("India");
	for(String T : cities) {
		System.out.println(T);
		
	}
	//System.out.println(cities.get(0));
	System.out.println(cities.size());
}
	}

//LinkedList<String> cities = new LinkedList<>();
//list maintain ordering, not in set
//duplicate allowed in list , not in set
//hashmap key value, no duplicate, unordered