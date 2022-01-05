package collection;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> td = new HashMap<>();
		td.put(6, "fff");
	td.put(1,"london");
	td.put(2,"newyork");
td.put(2,"york");
	td.put(3,"Andia");
	for(Map.Entry m : td.entrySet()) {
		System.out.println(m.getKey()+" -*******- "+m.getValue());
		
	}
	//System.out.println(cities.get(0));
	System.out.println(td.size());
}
	
	}


