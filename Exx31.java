package Lista2_repeticao;

import java.util.Scanner;

public class Exx31 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numalto=0;
		float alturaalto=0;
		int nummenor=0;
		float alturamenor=0;
		float[][] vet = new float[3][2];
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(j == 0) {
					System.out.print("Insira o codigo do aluno: ");
					vet[i][j] = entrada.nextFloat();
				}
					if(j == 1){
						System.out.print("Insira a altura do aluno: ");
						vet[i][j] = entrada.nextFloat();
						}
						if(i==0 && j==1) {
							System.out.println("entrei!");
							alturaalto = vet[i][j];
							numalto = (int) vet[i][0];
							alturamenor = vet[i][j];
							nummenor = (int) vet[i][0];
						}
						if(vet[i][1] < alturamenor) {
							alturamenor = vet[i][1];
							nummenor = (int) vet[i][0];
						}
						if(vet[i][1] > alturaalto) {
							alturaalto = vet[i][1];
							numalto = (int) vet[i][0];
						}
			
																			
	}
}
		System.out.println("O codigo do menor e: "+nummenor+" e a altura do menor e: "+alturamenor);
		System.out.println("O codigo do maior e: "+numalto+" e a altura do maior e: "+alturaalto);

		entrada.close();
	}
}
