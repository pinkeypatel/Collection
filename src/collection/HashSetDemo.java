package collection;


import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		cities.add("jury");
		cities.add("york");
		cities.add("India");
		cities.add("Ahmedabs");
		cities.add("India");
		for(String T : cities) {
			System.out.println(T);			
		}
		//System.out.println(cities.get(0));
		System.out.println(cities.size());
	}
	}


