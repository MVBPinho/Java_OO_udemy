package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println("-------------------------");

		Set<String> set1 = new TreeSet<>();

		set1.add("TV");
		set1.add("Tablet");
		set1.add("Notebook");

		set1.remove("Tablet");
		
		for (String p : set1) {
			System.out.println(p);
		}

		System.out.println("-------------------------");

		Set<String> set2 = new LinkedHashSet<>();

		set2.add("TV");
		set2.add("Tablet");
		set2.add("Notebook");

		set2.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set2) {
			System.out.println(p);
		}

		System.out.println("-------------------------");

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
