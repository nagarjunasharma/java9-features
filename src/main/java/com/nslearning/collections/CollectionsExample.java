package com.nslearning.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {
		// Collections factory method demonstration Collection.of(*) examples
		// List
		System.out.println("List Example : ");
		List<String> list = List.of("Java 7", "Java 8", "Java 9");
		list.forEach((l) -> System.out.println(l));

		// Set
		System.out.println("Set Example : ");
		Set<String> set = Set.of("Java 6", "Java 7", "Java 8", "Java 9");
		set.forEach((s) -> System.out.println(s));

		// Map Example
		System.out.println("Map Example : ");
		Map<Integer, String> map = Map.of(1, "Java 9", 2, "Java 10", 3, "Java 11");
		map.forEach((k, v) -> System.out.println(k + " , " + v));

		// Map of Entries
		System.out.println("Entry Map Example : ");
		Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
		Map.Entry<Integer, String> e2 = Map.entry(102, "GoLang");
		// Creating Map using map entries
		Map<Integer, String> entrymap = Map.ofEntries(e1, e2);
		entrymap.forEach((k, v) -> System.out.println(k + " , " + v));
	}

}
