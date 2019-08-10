package Lista2_repeticao;

import java.util.Scanner;

public class Exx10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float base=0,expoente=0;
		float result=1;
		
		System.out.println("Escreva a base do expoente: ");
		base = entrada.nextFloat();
		
		System.out.println("Escreva o expoente: ");
		expoente = entrada.nextFloat();
		
		for(int i=0 ; i < expoente ; i++) {
			result = result * base;
		}
		System.out.println("O resultado e: "+result);
		
		entrada.close();
	}
}