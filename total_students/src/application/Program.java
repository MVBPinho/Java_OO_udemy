package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Students> set = new HashSet<>();
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		setCodeStudents(n, sc, set);
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		setCodeStudents(n, sc, set);
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		setCodeStudents(n, sc, set);
		System.out.print("Total students: " + set.size());
		
		sc.close();
	}
	
	public static void setCodeStudents(int n, Scanner sc, Set<Students> set) {
		for (int i = 0; i < n; i++) {
			int code = sc.nextInt();
			set.add(new Students(code));
		}
	}

}
