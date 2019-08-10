package Lista2_repeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		String nome;
		float idade;
		float salario;
		String sexo;
		String estadocivil;
		
		do {
		System.out.println("Digite o seu nome: ");
		nome = entrada.next();
		}while(nome.length() > 3);
			
		do {
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextFloat();

		}while(idade < 0 && idade > 150);
		
		do {
		System.out.println("Digite o seu salario: ");
		salario = entrada.nextFloat();
		}while(salario < 0);
		
		do {
		System.out.println("Digite M - Masculino e F - Feminino: ");
		sexo = entrada.next();
		}while(!"f".equalsIgnoreCase(sexo)||!"m".equals(sexo));
		
		do {
		System.out.println("Digite S-Solteiro, C-Casado, V-Viuvo ou D-Divorciado: ");
		estadocivil = entrada.next();
		}while(!"s".equals(sexo) || !"c".equals(sexo) || !"v".equals(sexo) || !"d".equals(sexo));
		

		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário: "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado civil: "+estadocivil);

		entrada.close();
	}

}
