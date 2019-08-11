package Lista2_repeticao;

import java.util.Scanner;

public class Exx20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int[10];
		int soma=0;
		int media=0;
		
		for(int i=0; i < 10;i++) {
			System.out.println("Insira notas: ");
			vet[i] = entrada.nextInt();
			soma += vet[i];
		}
		media = soma / 10;
		System.out.println("A media e: "+media);
		
		entrada.close();
	}
	

}
