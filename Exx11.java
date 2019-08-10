package Lista2_repeticao;

import java.util.Scanner;

public class Exx11{
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int vet[] = new int[10];
		int par=0;
		int impar=0;
		
		for(int i=0; i < 10; i++) {
			System.out.println("Insira o numero "+(i+1)+": ");
		vet[i] = entrada.nextInt();
			if(vet[i] % 2 == 0)
				par++;
			else
				impar++;
		}
		System.out.println("Quantidade de numeros pares: "+par);
		System.out.println("Quantidade de numeros impares: "+impar);

		entrada.close();
	}
}
