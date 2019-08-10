package Lista2_repeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int populacaoA=80000;
		float taxaA=1.03f;
		int populacaoB=200000;
		float taxaB=1.015f;
		int i=0;
		
		while(populacaoA < populacaoB) {
			populacaoA = (int) (populacaoA * taxaA);
			populacaoB = (int) (populacaoB * taxaB);
			i++;
	}
		System.out.println("Numero de anos: "+i);

		System.out.println("Informe a população da cidade A");
		populacaoA = entrada.nextInt();
		
		System.out.println("Informe a taxa de crescimento da cidade A");
		taxaA = entrada.nextFloat();
		
		System.out.println("Informe a população da cidade B");
		populacaoB = entrada.nextInt();

		System.out.println("Informe a taxa de crescimento da cidade B");
		taxaB = entrada.nextFloat();

		if(populacaoA > populacaoB)
			if(taxaA < taxaB)
				while(populacaoA < populacaoB) {
					populacaoA = (int) (populacaoA * taxaA);
					populacaoB = (int) (populacaoB * taxaB);
					i++;
			}
			else {
				System.out.println("A taxa da cidade com maior população tem q menor");
			}
			if(populacaoA < populacaoB)
				if(taxaA > taxaB)
					while(populacaoA < populacaoB) {
						populacaoA = (int) (populacaoA * taxaA);
						populacaoB = (int) (populacaoB * taxaB);
						i++;
				}
				else {
					System.out.println("A taxa da cidade com maior população tem q menor");
				}
			
				System.out.println("Numero de anos: "+i);
				
				entrada.close();
		
	}

}
