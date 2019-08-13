package Lista2_repeticao;

import java.util.Scanner;

public class Exx30 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float maisalto=0;
		float maisbaixo=0;
		float maisgordo=0;
		float maismagro=0;
		int cod=1;
		float codmaisalto=0;
		float codmaisbaixo=0;
		float codmaisgordo=0;
		float codmaismagro=0;
		float altura=0;
		float peso=0;
		float somaaltura=0;
		float mediaaltura=0;
		float somapeso=0;
		float mediapeso=0;
		int cont=0;
		
		do {
			System.out.print("Insira o codigo: ");
			cod = entrada.nextInt();
			if(cod != 0) {
			System.out.print("Insira a sua altura: ");
			altura = entrada.nextInt();
			System.out.print("Insira o seu peso: ");
			peso = entrada.nextInt();
			
			if(cont == 0) {
				maisalto = altura;
				maisbaixo = altura;
				maisgordo = peso;
				maismagro = peso;
				codmaisalto = cod;
				codmaisbaixo = cod;
				codmaisgordo = cod;
				codmaismagro = cod;
			}
			if(altura > maisalto) {
				maisalto = altura;
				codmaisalto = cod;
			}
			if(altura < maisbaixo) {
				maisbaixo = altura;
				codmaisbaixo = cod;
			}
			if(peso > maisgordo) {
				maisgordo = peso;
				codmaisgordo = cod;
			}
			if(peso < maismagro) {
				maismagro = peso;
				codmaismagro = cod;
			}
				somaaltura += altura;
				somapeso += peso;
			cont++;
			}
		}while(cod != 0);
		
		mediaaltura = somaaltura / cont;
		mediapeso = somapeso / cont;
		
		
		System.out.println("O codigo do mais alto e "+codmaisalto+" e a sua altura e: "+maisalto);
		System.out.println("O codigo do mais baixo e "+codmaisbaixo+" e a sua altura e: "+maisbaixo);
		System.out.println("O codigo do mais gordo e "+codmaisgordo+" e o seu peso e: "+maisgordo);
		System.out.println("O codigo do mais magro e "+codmaismagro+" e o seu peso e: "+maismagro);
		System.out.println("A media da altura e: "+mediaaltura);
		System.out.println("A media do peso e: "+mediapeso);

		entrada.close();
	}

}
