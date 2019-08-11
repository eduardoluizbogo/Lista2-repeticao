package Lista2_repeticao;

import java.util.Scanner;

public class Exx36 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int voto = 0 ;
		int candidato1=0;
		int candidato2=0;
		int candidato3=0;
		int candidato4=0;
		float votonulo=0;
		float votobranco=0;
		float numvotos=-1;
		float percentagemnulo=0;
		float percentagembranco=0;
		

		do {
			System.out.println("1 - Jose\n2 - Joao\n3 - Marcio\n4 - Flavio\n5 - Voto nulo\n6 - Voto em branco");
			voto = entrada.nextInt();
			numvotos++;
			switch(voto) {
			case 1:
				candidato1++;
				break;
			case 2:
				candidato2++;
				break;
			case 3:
				candidato3++;
				break;
			case 4:
				candidato4++;
				break;
			case 5:
				votonulo++;
				break;
			case 6:
				votobranco++;
				break;				
			}			
		}while(voto != 0);
				
		percentagemnulo = (votonulo / numvotos) * 100 ;
		percentagembranco = (votobranco / numvotos) * 100;
		
		System.out.println("Jose teve "+candidato1+"voto(s)");
		System.out.println("Joao teve "+candidato2+"voto(s)");
		System.out.println("Marcio teve "+candidato3+"voto(s)");
		System.out.println("Flavio teve "+candidato4+"voto(s)");

		System.out.println("O total de votos nulo e: "+votonulo);
		
		System.out.println("O total de votos em branco e: "+votobranco);
		
		System.out.println("A percentagem de votos nulos sobre o total de votos e: "+percentagemnulo+"%");
		
		System.out.println("A percentagem de votos em branco sobre o total de votos e: "+percentagembranco+"%");

		entrada.close();
	}

}
