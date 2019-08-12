package Lista2_repeticao;

import java.util.Scanner;

public class Exx28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		float temp=0;
		float maiorTemp=0;
		float menorTemp=0;
		int cont=0;
		String valid="1";
		float soma=0;
		float media=0;
		
		do {
			System.out.print("Informe a temperatura: ");
			temp = entrada.nextFloat();
			if(cont == 0) {
				maiorTemp = temp;
				menorTemp =  temp;
			}
			if(temp < menorTemp)
				menorTemp = temp;
			if(temp > maiorTemp)
				maiorTemp = temp;
			soma += temp;
			System.out.println("Digite 1 para inserir outra temperatura e 2 para sair!");
			valid = entrada.next();
			cont++;
		}while("1".equalsIgnoreCase(valid));
		System.out.println("Voce saiu!");
		media = soma / cont;
		System.out.println("A maior temperatura e: "+maiorTemp);
		System.out.println("A menor temperatura e: "+menorTemp);
		System.out.println("A media de temperatura e: "+media);

		entrada.close();
	}

}
