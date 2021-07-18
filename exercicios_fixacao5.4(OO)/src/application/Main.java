package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		
		//Este código foi produzido inteiramente por mim antes de assistir a solução do exercício proposto.
		//Mantive o código para comparar a minha solução com a solução real do exercício.
		//Comparar as duas formas foi de grande aprendizado para perceber as diferenças entre os dois.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bankaccount = new BankAccount();
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		bankaccount.setAccnumber(number);
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		bankaccount.setName(name);
		System.out.print("Is there a initial deposit (y/n)? ");
		char question = sc.next().charAt(0);
		if (question == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			bankaccount.deposit(deposit);
		}
		else {
			System.out.println();
		}
		System.out.println("Account data:");
		System.out.println(bankaccount);
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bankaccount.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(bankaccount);
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bankaccount.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(bankaccount);
		sc.close();
	}

}
