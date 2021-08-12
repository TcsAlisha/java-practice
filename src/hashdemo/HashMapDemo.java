package hashdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		//createHashMap();
		treeMap();
	}

	private static void treeMap() {
		Map<Integer,Float> mathScores= new TreeMap<Integer,Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put( i,new Float(100 * Math.random()));
		}
		System.out.println(mathScores);
	}

	private static void createHashMap() {
		Map<String,Float> mathScores= new HashMap<String,Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put("Student"+ i,new Float(100 * Math.random()));
		}
		boolean exists = mathScores.containsKey("Student1");
		System.out.println(exists);
		mathScores.put("Student1", 34F);
		mathScores.remove("Student1");
		System.out.println(mathScores);
	}
}
