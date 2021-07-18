package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer accNumber = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String accHolder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(accNumber, accHolder, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f", acc.getBalance());
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
