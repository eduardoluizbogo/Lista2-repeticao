import java.util.Scanner;

public class Exx38 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		Integer x =0;
		
		System.out.print("Insira o numero que queres invertir: ");
		x = entrada.nextInt();
		
		Integer a = new Integer(x);
		String b=a.toString();
		String c=" ";
				
		for(int i=b.length();i>0;i--)
			c = c + b.substring(i - 1, i);
		
		System.out.println("O numero invertido e: "+c);
		
		entrada.close();
	}

}
