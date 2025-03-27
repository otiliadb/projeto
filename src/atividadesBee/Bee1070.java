package atividadesBee;

import java.util.Scanner;

public class Bee1070 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		System.out.println("Informe o valor de X:");
		int n = teclado.nextInt();
		if (n % 2 == 0) {
			n++;
		}
		for (int cont=0; cont < 6; cont++) {
			System.out.println(n);
			n+=2;
		}
		
		teclado.close();
	}
}
