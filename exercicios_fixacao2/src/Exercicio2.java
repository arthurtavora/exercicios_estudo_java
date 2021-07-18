import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// Este exercicio é o segundo link do youtube do pdf dos exercicios resolvidos de estrutura condicional
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta, r1, r2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		delta = B * B - 4 * A * C;
		r1 = (-B + Math.sqrt(delta)) / (2 * A);
		r2 = (-B - Math.sqrt(delta)) / (2 * A);
		
		sc.close();
		
			
		if (A == 0) {
			System.out.println("Impossivel calcular");
		}
		else if (delta < 0) {
			
			System.out.println("Impossivel calcular");	
		}
		else {
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
	}
		
		
}
