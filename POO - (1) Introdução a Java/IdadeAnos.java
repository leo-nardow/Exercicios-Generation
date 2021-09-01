package Turma29;

import java.util.Scanner;

public class IdadeAnos {
	public static void main (String args[]) {
		int d, m, a;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite idade em dias: ");
		d = ler.nextInt();
		
		a = d/365;
		d = d-a*365;
		m = d/30;
		d = d-m*30;
		
		System.out.println("A idade expressa em anos, meses e dias é: "+ d +"/"+m+"/"+a);
	}
}
