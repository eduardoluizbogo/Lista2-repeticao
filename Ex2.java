package Lista2_repeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String user;
		String senha;
		
		
		do {
		System.out.println("Insira o nome de usuario: ");
		user = entrada.next();
		
		System.out.println("Insira a senha: ");
		senha = entrada.next();
		
		if(user.equalsIgnoreCase(senha))
			System.out.println("O usuario e a senha sao iguais.");
		
		}while(user.equalsIgnoreCase(senha));
		
		entrada.close();

	}

}
