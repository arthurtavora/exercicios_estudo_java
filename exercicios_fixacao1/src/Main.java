import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado, area, preco;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroQuadrado = sc.nextDouble();
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.println("Entrada:");
		System.out.printf("%.1f%n", largura);
		System.out.printf("%.1f%n",comprimento);
		System.out.printf("%.2f%n", metroQuadrado);
		System.out.println("Saída:");
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
		
		// Este exercício corresponde ao vídeo no youtube que consta no pdf do primeiro exercício do curso
	}

}
