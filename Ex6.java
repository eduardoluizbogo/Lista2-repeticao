package Lista2_repeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM=50;
		
		for (int i = 0; i < TAM; i++) {
			if(i % 2 == 1)
				System.out.println(i);
		}
		entrada.close();
	}

}
