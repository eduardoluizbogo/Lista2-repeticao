package Lista2_repeticao;

import java.util.Scanner;

public class Exx23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		int turmas=0;
		int alunos=0;
		float totalalunos=0;
		float media=0;
		
		System.out.println("Quantas turmas serao registrada? ");
		turmas = entrada.nextInt();
		
		for(int i=0;i<turmas;i++) {
			System.out.println("Quantos alunos sao? ");
			alunos = entrada.nextInt();
			while(alunos < 0 || alunos > 40) {
			System.out.println("O numero de alunos nao pode exceder 40\n");
			System.out.println("Quantos alunos sao? ");
			alunos = entrada.nextInt();
			}
			totalalunos += alunos;			

		}	
		media = totalalunos / turmas;
		System.out.println("A media e: "+media);
		
		entrada.close();
	}
}
