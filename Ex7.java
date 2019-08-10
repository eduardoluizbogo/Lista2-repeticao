package Lista2_repeticao;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1=0;
		int n2=0;

		System.out.println("Escreva um numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Escreva um numero: ");
		n2 = entrada.nextInt();
		
		if(n1 > n2)
			for (int i = n2+1; i < n1; i++) {
				System.out.println(i);
			}
		if(n1 < n2)
			for (int i = n1+1; i < n2; i++) {
				System.out.println(i);
		}
		entrada.close();
	}
}
		


