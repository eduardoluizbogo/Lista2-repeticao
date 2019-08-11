package Lista2_repeticao;

import java.util.Scanner;

public class Exx24 {

	public static void main(String[] arg) {
	
		Scanner entrada = new Scanner(System.in);
		
		int qcd=0;
		int preco=0;
		float total=0;
		float media=0;
		
		System.out.println("Qual e a quantidade de CD's? ");
		qcd = entrada.nextInt();
		
		for(int i=0;i<qcd;i++) {
			System.out.println("Qual o preco do CD? "+(i+1));
			preco = entrada.nextInt();
			total += preco;			
		}	
		media = total / qcd;
		System.out.println("A media e: "+media);
		
		entrada.close();
		
	}
}
