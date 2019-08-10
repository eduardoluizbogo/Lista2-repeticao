package Lista2_repeticao;

import java.util.Scanner;

public class Exx14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int aux = -1;
		
	    for (int i = 0; i < 10; i++) {
	    	vet1[i] = i + 1;
	    }
	    for (int i2 = 0; i2 < 10; i2++) {
	    		aux = aux + 2;
	    		vet2[i2] = aux;
	    }
	    for (int i3 =0; i3 < 10;i3++) 
	    	System.out.println(vet1[i3]+"/"+vet2[i3]);
	    
	    entrada.close();
	    System.out.println("sddss");
	 }
}

	


