package Lista2_repeticao;

import java.util.Scanner;

public class Exx17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1=0;
		boolean nprimo=true;
		
		System.out.println("Digite um numero: ");
		n1 = entrada.nextInt();
		
		for(int i=2;i < n1;i++) {
			if(n1 % i == 0)
				nprimo = false;
					
		}
		if(nprimo)
			System.out.println("O numero "+n1+" e primo!");
		else
			System.out.println("O numero "+n1+" nao e primo!");
		
		entrada.close();
	}

}
