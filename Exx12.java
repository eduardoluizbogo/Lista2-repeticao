package Lista2_repeticao;

import java.util.Scanner;

public class Exx12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num=0;
		int ultimo=0;
		int penultimo=1;
		int conta=0;
		
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();

		for(int i=0 ; i < num ; i++) {
			conta = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = conta;

			System.out.println(conta);
			
			entrada.close();
		}
	}
}


