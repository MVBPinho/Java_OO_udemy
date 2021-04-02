package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("NAME: ");
		student.name = sc.nextLine();
		System.out.println("Note first quarter");
		student.grade1 = sc.nextDouble();
		System.out.println("Note second quarter");
		student.grade2 = sc.nextDouble();
		System.out.println("Note third quarter");
		student.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalGrade());
		System.out.println(student.situation());

		sc.close();
	}
}