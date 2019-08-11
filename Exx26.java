package Lista2_repeticao;

import java.util.Scanner;

public class Exx26 {

	public static void main(String[] arg) {
		
		Scanner entrada = new Scanner(System.in);
		
		float preco=0;
		
		System.out.println("Insira o preco do pao: ");
		preco = entrada.nextFloat();
		
		for (int i = 1; i < 51; i++) {		
			System.out.println(1+" - "+preco * i);
		}
		entrada.close();
	}
}
