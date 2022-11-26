package treeMapExercise;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExercise {
	public static void main(String[]args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		Set<Integer> ki = map.keySet();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		for (Integer i : ki) {
			System.out.print(map.get(i)+" ");
		}
		System.out.println();
	}
}
