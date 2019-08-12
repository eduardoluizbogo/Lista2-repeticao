package Lista2_repeticao;

import java.util.Scanner;

public class Exx35 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int cod=0;
		int quant=0;
		float preco100=0;
		float preco101=0;
		float preco102=0;
		float preco103=0;
		float preco104=0;
		float preco105=0;

		float precototal=0;
		
		
		do {
			System.out.print("Digite o codigo do produto (insira 0 para sair): ");
			cod = entrada.nextInt();
			if(cod != 0) {
			System.out.print("Insira o quantidade desse produto: ");
			quant = entrada.nextInt();
			}
			switch(cod) {
			
			case 100:
				preco100 = (float) (1.20 * quant);
				precototal =(float) ((float) precototal + (1.20 * quant));
				break;
			case 101:
				preco101 = (float) (1.30 * quant);
				precototal =(float) ((float) precototal + (1.30 * quant));
				break;
			case 102:
				preco102 = (float) (1.50 * quant);
				precototal =(float) ((float) precototal + 1.50 * quant);
				break;
			case 103:
				preco103 = (float) (1.20 * quant);
				precototal =(float) ((float) precototal + 1.20 * quant);
				break;
			case 104:
				preco104 = (float) (1.30 * quant);
				precototal =(float) ((float) precototal + 1.30 * quant);
				break;
			case 105:
				preco105 = (float) (1.00 * quant);
				precototal =(float) ((float) precototal + 1.00 * quant);
				break;
			}
		}while(cod != 0);
		System.out.println("Cachorro Quente: "+preco100);
		System.out.println("Bauru Simples: "+preco101);
		System.out.println("Bauru com ovo: "+preco102);
		System.out.println("Hambúrguer: "+preco103);
		System.out.println("Cheeseburguer: "+preco104);
		System.out.println("Refrigerante: "+preco105);
		System.out.println("O preco total e: "+precototal);
		
		entrada.close();
	}

}
