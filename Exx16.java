package Lista2_repeticao;

import java.util.Scanner;

public class Exx16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
				
		int[] vet = new int[5];
		float menor=0;
		float maior=0;
		float soma=0;
		
		for(int i=0; i < 5;i++) {
			System.out.println("Insira o numero "+(i+1)+": ");
			vet[i] = entrada.nextInt();
			if(i == 0) {
				menor = vet[i];
				maior = vet[i];
			}
			if(vet[i] < menor) {
				menor = vet[i];
			}if(vet[i] > maior) {
				maior = vet[i];
				}
			soma += vet[i];
		}
		System.out.println("O menor numero e: "+menor);
		System.out.println("O maior numero e: "+maior);
		System.out.println("A soma e: "+soma);
		
		entrada.close();
	}

}
