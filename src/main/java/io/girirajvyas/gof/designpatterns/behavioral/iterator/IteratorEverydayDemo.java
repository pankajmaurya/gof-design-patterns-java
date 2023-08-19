package io.girirajvyas.gof.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		//Set<String> names = new HashSet<>();
		
		names.add("Amar");
		names.add("Akbar");
		names.add("Anthony");

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			System.out.println("Removed while iterating, only supported way is via remove: " + name);
			itr.remove();
		}
		System.out.println("Names size: " + names.size());

		names.add("Amar");
		names.add("Anthony");
		// foreach: iterate over an array or iterable
		for (String name : names) {
			System.out.println(name);
		}

	}
}
