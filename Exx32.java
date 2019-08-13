package Lista2_repeticao;

import java.util.Scanner;

public class Exx32 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 3;
		int[] cod = new int[TAM];
		int[] veiculos = new int[TAM];
		int[] acidente = new int[TAM];
		int indicemenosacidente = 0;
		int indicemaisacidente = 0;
		int mediaVeiculos = 0;
		int cont = 0;
		int mediaacidentes = 0;
		int ind1 = 0;
		int ind2 = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.print("Insira o codigo da cidade: ");
			cod[i] = entrada.nextInt();
			
			System.out.print("Insira o numero de veiculos: ");
			veiculos[i] = entrada.nextInt();
			
			System.out.print("Insira o numero de acidentes com vitimas: ");
			acidente[i] = entrada.nextInt();
			
		}
		indicemaisacidente = acidente[0];
		indicemenosacidente = acidente[0];
		
		for (int i = 0; i < TAM; i++) {
			if (acidente[i] < indicemenosacidente) {
				indicemenosacidente = acidente[i];
				ind1 = i;
			} else if (acidente[i] > indicemaisacidente) {
				indicemaisacidente = acidente[i];
				ind2 = i;
			}
			mediaVeiculos += veiculos[i];
			if(veiculos[i] <= 2000) {
				mediaacidentes += acidente[i];
				cont++;
			}
		}
		System.out.println("aaa: "+cod[ind2]);
		
		System.out.println("A cidade com maior indice de acidentes e: "+cod[ind1]+" com "+indicemaisacidente+" acidentes");
		
		System.out.println("A cidade com menor indice de acidentes e: "+cod[ind2]+" com "+indicemenosacidente+" acidentes");
		
		System.out.println("A media de veiculos das cinco cidades e: "+(mediaVeiculos/TAM));
		
		System.out.println("Media de acidentes de transitos nas cidade com menos de 2000 veiculos: "+ (mediaacidentes/cont));
	
	entrada.close();
	}

}
