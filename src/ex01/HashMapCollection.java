package ex01;

import java.util.HashMap;

public class HashMapCollection {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(33, "Toy");
		map.put(47, "Box1");

		map.put(67, "Robot");
		map.put(47, "Box2");
		map.put(33, "Toy2");
		
		System.out.println(map.get(33));
		
		System.out.println(map.clone());
		
		map.remove(33);
		
		System.out.println(map.get(33));
		
	}

}
