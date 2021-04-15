package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		String path = "/home/pinho/git/curso_oo_udemy/file_csv/";
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path + "a"))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String name = line.split(",")[0];
				double price = Double.parseDouble(line.split(",")[1]);
				int quantity = Integer.parseInt(line.split(",")[2]);
				
				list.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			new File(path + "/out").mkdir();
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/out/a"))){
				for(Product p : list) {
					bw.write(p.toString());
					bw.newLine();
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}