package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		list.add("Zeca");
		list.add("Ronaldo");
		list.add("Rita");
		
		System.out.println("Tamanho da lista -> " + list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
		System.out.println(name);
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);
		
	}

}
