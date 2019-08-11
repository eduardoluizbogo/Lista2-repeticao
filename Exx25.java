package Lista2_repeticao;

import java.util.Scanner;

public class Exx25 {

	public static void main(String[] arg) {
		
		Scanner entrada = new Scanner(System.in);

			for (int j = 1; j < 51; j++) {
				System.out.println(j+" - "+(j * 1.99));	
		}
			entrada.close();
	}
}
