package Lista2_repeticao;

import java.util.Scanner;

public class Exx29 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n=0;
		int start=1;
		int end=0;
		
		System.out.println("Informe o numero que desejas saber a tabuada: ");
		n = entrada.nextInt();
		
		while(start > end) {			
			System.out.println("Comeca por: ");
				start = entrada.nextInt();
			System.out.println("Termina em: ");
				end = entrada.nextInt();
		if(start > end)
			System.out.println("O numero que comeca tem que ser menor que o que termina");
		}
		System.out.println("Montar a tabuada de: "+n);
		System.out.println("Comeca por: "+start);
		System.out.println("Termina em: "+end);

		System.out.println("Vou montar a tabuada de "+n+" começando em "+start+" e terminando em "+end+": ");
		
		for (int i = start; i <= end; i++) {
			System.out.println(n+" x "+i+" = "+(n * i));			
		}
		entrada.close();

	}

}
