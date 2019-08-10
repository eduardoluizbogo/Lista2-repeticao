package Lista2_repeticao;

import java.util.Scanner;

public class Exx15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] vet1 = new int[37];
		int[] vet2 = new int[37];
		int[] vet3 = new int[37];
		float soma=0;
		float somatotal=0;
		
		for(int i=0;i < 37 ; i++) {
		vet1[i] = 37 - i;
		}
		
		for(int i=0;i < 37; i++) {
		vet2[i] = 38 - i;
		}
		
		for(int i=0;i < 37;i++) {
			vet3[i] = i + 1;
		}
		for(int i=0;i < 37;i++) {
			soma = (vet1[i] * vet2[i]) / vet3[i];
			somatotal = somatotal + soma;
		}
	System.out.println("Soma: "+somatotal);
	
	entrada.close();
	}

}
