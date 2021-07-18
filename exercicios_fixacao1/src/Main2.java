import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		int a, b, soma;
		a = sc.nextInt();
		b = sc.nextInt();
		soma =  a + b;
		
		System.out.println("Saída:");
		System.out.println("SOMA = " + soma);
		
		sc.close();
		

	}

}
