import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Este exercicio é o primeiro link do youtube do pdf dos exercicios resolvidos de estrutura condicional
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sem1, sem2, notaFinal;
		
		sem1 = sc.nextDouble();
		sem2 = sc.nextDouble();
		notaFinal = sem1 + sem2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60.00) {
			
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}
}