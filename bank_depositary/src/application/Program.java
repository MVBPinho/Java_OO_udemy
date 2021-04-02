package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		double value;
		BankAccount bankAccount;
		if(initial == 'y') {
			System.out.print("Enter initia deposit value: ");
			value = sc.nextDouble();
			bankAccount = new BankAccount(number, name, value);
		}
		else {
			bankAccount = new BankAccount(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double price = sc.nextDouble();
		bankAccount.deposit(price);
		System.out.println("Update account data: ");
		System.out.println(bankAccount);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		price = sc.nextDouble();
		bankAccount.withdraw(price);
		System.out.println("Update account data: ");
		System.out.println(bankAccount);
		
		sc.close();
	}
}