package Lista2_repeticao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float nota=0;
		
		do {
			System.out.print("Informe uma nota de 0 a 10: ");
			nota = entrada.nextFloat();
			
			System.out.println("A sua nota foi: "+nota);
			
			if(nota < 0 || nota > 10)
				System.out.println("Nota invalida, digite novamente! \n");
		
		}while(nota < 0 || nota > 10);

		entrada.close();
	
		

	}

}
