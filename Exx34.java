package Lista2_repeticao;

import java.util.Scanner;

public class Exx34 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float num = 0 ;
		int intervalo1=0;
		int intervalo2=0;
		int intervalo3=0;
		int intervalo4=0;
		
		System.out.println("Digite numeros, se quiser sair digite um numero negativo!");

		do {
			num = entrada.nextFloat();
			if(num >= 0 && num <= 25)
				intervalo1++;
			if(num >= 26 && num <= 50)
				intervalo2++;
			if(num >= 51 && num <= 75)
				intervalo3++;
			if(num >= 76 && num <= 100)
				intervalo4++;				
		}while(num > 0);
		
		System.out.println("Existem "+intervalo1+" numeros no intervalo 0-25");
		System.out.println("Existem "+intervalo2+" numeros no intervalo 26-50");
		System.out.println("Existem "+intervalo3+" numeros no intervalo 51-75");
		System.out.println("Existem "+intervalo4+" numeros no intervalo 76-100");

		entrada.close();
	}

}
