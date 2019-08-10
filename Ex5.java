package Lista2_repeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 20;

		for (int i = 0; i < TAM; i++) {
			System.out.println(i);
			
		}
		for (int i = 0; i < TAM; i++) {
			System.out.print(i+" ");
		}
		entrada.close();
	}

}
