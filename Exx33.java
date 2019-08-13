package Lista2_repeticao;

import java.util.Scanner;

public class Exx33 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float divida=0;
		
		System.out.println("Qual e o valor da divida?");
		divida = entrada.nextFloat();
		
		float dividaA= divida;
		float dividaB= (float) (divida * 1.10);
		float dividaC= (float) (divida * 1.15);
		float dividaD= (float) (divida * 1.20);
		float dividaE= (float) (divida * 1.25);
		float jurosA= 0;
		float jurosB= (float) (divida*0.10);
		float jurosC= (float) (divida*0.15);
		float jurosD= (float) (divida*0.20);
		float jurosE= (float) (divida*0.25);

		
		System.out.println("Divida // Juros // Q. parcelas // Valor das parcelas");
		System.out.println(dividaA+"    "+jurosA+"      1                "+divida);
		System.out.println(dividaB+"    "+jurosB+"    3                "+divida * 1.10 / 3);
		System.out.println(dividaC+"    "+jurosC+"    6                "+divida * 1.15 / 6);
		System.out.println(dividaD+"    "+jurosD+"    9                "+divida * 1.20 / 9);
		System.out.println(dividaE+"    "+jurosE+"    12               "+divida * 1.25 / 12);
	
	entrada.close();
	}
}


