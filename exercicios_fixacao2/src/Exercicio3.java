import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		// Este exercicio é o terceiro link do youtube do pdf dos exercicios resolvidos de estrutura condicional
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		}
		else if (b < c) {
			System.out.println("MENOR = " + b);				
		}
		else {
			System.out.println("MENOR = " + c);
		}
		
		
		sc.close();
	}

}
