package Turma29;

import java.util.Scanner;

public class IdadeDias {
	public static void main (String args[]) {
		int d, m, a;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite idade em anos, meses e dias: ");
		System.out.println("Anos:");
		a = ler.nextInt();
		
		System.out.println("Meses:");
		m = ler.nextInt();
		
		System.out.println("Dias:");
		d = ler.nextInt();
		
		d = d + m*30 + a*365;

		System.out.println("A idade expressa em dias é: "+ d);
		
	}
}
