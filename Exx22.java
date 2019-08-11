package Lista2_repeticao;

import java.util.Scanner;

public class Exx22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int candidato1=0;
		int candidato2=0;
		int candidato3=0;
		int votantes=0;
		int voto=0;
		
		System.out.println("Insira o numero total de votantes: ");
		votantes = entrada.nextInt();
	
		for (int i = 0; i < votantes; i++) {
			System.out.println("Insira 1-Candidato1, 2-Candidato2 e 3-Candidadato3 votante "+(i+1));
			voto = entrada.nextInt();
			switch (voto) {
				case 1 :
					candidato1++;
					break;
				case 2 :
					candidato2++;
					break;
				case 3 :
					candidato3++;
					break;
			}	
		}
		System.out.println("O candidato1 teve "+candidato1+"voto(s)");
		System.out.println("O candidato2 teve "+candidato2+"voto(s)");
		System.out.println("O candidato3 teve "+candidato3+"voto(s)");

		entrada.close();
	}

}
