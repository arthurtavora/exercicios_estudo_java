package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		//Solu��o real feita pelo professor no exercicio proposto.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter inital deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
