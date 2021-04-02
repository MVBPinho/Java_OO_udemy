package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite 1 valor inteiro: ");
		int a = sc.nextInt();
		
		System.out.printf("%d elevado a 2 = %.2f", a, Math.pow(a, 2));
		System.out.println();
		System.out.printf("raiz quadrada do %d = %.2f", a, Math.sqrt(a));
		System.out.println();
		System.out.printf("valor absoluto de %d = %d", a, Math.abs(a));
		
		sc.close();	
	}
}