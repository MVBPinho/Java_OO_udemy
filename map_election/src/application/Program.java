package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		String path = "/home/pinho/git/curso_oo_udemy/map_election/in";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Map<String, Integer> election = new HashMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int number = Integer.parseInt(fields[1]);
				if(election.containsKey(name))
					election.put(name, number + election.get(name));
				else 
					election.put(name, number);
				line = br.readLine();
			}
			
			System.out.println("Enter file full path: " + path);
			for (String c : election.keySet()) {
				System.out.println(c + ": " + election.get(c));
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
