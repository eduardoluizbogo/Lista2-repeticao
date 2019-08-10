package Lista2_repeticao;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n=0;
		
		System.out.println("Informe o numero que desejas saber a tabuada: ");
		n = entrada.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n+" x "+i+" = "+(n * i));			
		}
		entrada.close();
	}

}
