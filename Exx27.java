package Lista2_repeticao;

import java.util.Scanner;

public class Exx27 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float preco=0;
		float soma=0;
		float dinheiro=0;
		float troco=0;
		
		System.out.println("Qual e o tamanho do vetor? ");
		int tam = entrada.nextInt();
		
		float[] vet = new float[tam];
		
		for (int i = 0; i < tam; i++) {
			System.out.println("Insira o preco do produto "+(i+1));
			preco = entrada.nextFloat();
			vet[i] = preco;
			soma += preco;
			}
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Produto "+i+"- "+vet[i]);
			
		}
		System.out.println("O total e: "+soma);
		
		System.out.println("Com qual valor desejas pagar? ");
		dinheiro = entrada.nextFloat();
		
		troco = dinheiro - soma;
		System.out.println("O troco e "+troco);
		
		entrada.close();
	}

}
