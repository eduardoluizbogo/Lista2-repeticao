package Lista2_repeticao;

import java.util.Scanner;

public class Exx21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int[5];
		int soma=0;
		int media=0;
		
		for(int i=0; i < 5;i++) {
			System.out.println("Insira a idade: ");
			vet[i] = entrada.nextInt();
			soma += vet[i];
		}
		media = soma / 5;
		System.out.println("A media e: "+media);
		
		if(media >= 0 && media <= 25)
			System.out.println("A turma e jovem!");
		else if(media > 25 && media < 60)
			System.out.println("A turma e adulta!");
		else if(media > 60)
			System.out.println("A turma e idosa!");
		
		entrada.close();
	}

}
