import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		// Primeiro exercicio da lista em pdf de exercicios de estrutura condicional
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}

}
