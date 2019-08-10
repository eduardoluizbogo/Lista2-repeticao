package Lista2_repeticao;

import java.util.Scanner;

public class Exx13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        int num = 1;
        int conta = 1;

            System.out.println("Insira um numero: ");
            num = entrada.nextInt();
            
            for(int i = 1;i <= num; i++){
                conta = conta * i;
            }
            
            System.out.println("!" + num + " = " + conta);
           
            entrada.close();
    }
}

		




