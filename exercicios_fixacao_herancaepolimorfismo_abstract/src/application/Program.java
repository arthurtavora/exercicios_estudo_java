package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 List<TaxPayer> list = new ArrayList<>();
		 
		 System.out.print("Enter the number of tax payers: ");
		 int N = sc.nextInt();
		 
		 for (int i = 0; i < N ; i++) {
			 System.out.println("Tax payer #" + (i + 1) + " data:");
			 System.out.print("Individual or company (i/c)? ");
			 char type = sc.next().charAt(0);
			 System.out.print("Name: ");
			 sc.nextLine();
			 String name = sc.nextLine();
			 System.out.print("Anual income: ");
			 double anualIncome = sc.nextDouble();
			 if (type == 'i') {
				System.out.print("Health expenses: ");
				double healthExpenses = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenses));
			}
			 else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
			}		
		}
		 System.out.println();
		 System.out.println("TAXES PAID:");
		 for (TaxPayer payer : list) {
			 System.out.printf("%s: $ %.2f%n", payer.getName(), payer.tax());
		 }
		 System.out.println();
		 double totalTaxes = 0.00;
		 for (TaxPayer payer : list) {
			 totalTaxes += payer.tax();
		}
		 System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		 sc.close();
	}
}
