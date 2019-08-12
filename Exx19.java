package Lista2_repeticao;

import java.util.Scanner;

public class Exx19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1=0;
		boolean nprimo=true;
		int cont=0;
		int aux1=0;
		
		System.out.print("Digite um numero: ");
		n1 = entrada.nextInt();
		
		for (int j = 2; j < n1; j++) {
			aux1 = j;
			nprimo = true;
			for (int i = 2; i < aux1; i++) {
					cont++;
					if(aux1 % i == 0) {
						if(nprimo)
							nprimo = false;
					}
				}			
			if (nprimo) {
				System.out.println("O numero "+aux1+" e primo");
			}
		}
			System.out.println("O numero de divisoes foi: "+cont);
			
			entrada.close();
		
	}
}
				
	

