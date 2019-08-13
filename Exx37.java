package Arquivos1;

import java.util.Scanner;

public class Exx37 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String[] gabarito= {"a","b","c","d","e","e","d","c","b","a"};
		String[] respostas = new String[10];
		String repetir = " ";
		int cont=0;
		int maioracerto=0;
		int menoracerto=0;
		float media=0;
		float somaacertos=0;
		
		do {
		int acertos=0;
		
		for (int i = 0; i < respostas.length; i++) {
			System.out.println("Insira a resposta da "+(i+1));
			respostas[i] = entrada.next();
		
		}
		for (int i = 0; i < respostas.length; i++) {
			if(respostas[i].equals(gabarito[i]))
				acertos++;
		}
		
		if(cont == 0) {
			maioracerto = acertos;
			menoracerto = acertos;
		}
		if(acertos > maioracerto)
			maioracerto = acertos;
		if(acertos < menoracerto)
			menoracerto = acertos;
		
		somaacertos += acertos ;
		
		cont++;
		
		System.out.println("Outro aluno vai usar o sistema?");
		repetir = entrada.next();
		}while("sim".equalsIgnoreCase(repetir));
	
	media = somaacertos / cont;
	
	System.out.println("A media e: "+media+" acertos.");
	System.out.println("O maior numero de acertos e: "+maioracerto);
	System.out.println("O menor numero de acertos e: "+menoracerto);
	System.out.println(cont+" alunos utilizaram o sistema.");
	
	entrada.close();
	}

}
