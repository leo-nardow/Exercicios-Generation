package Turma29;

import java.util.Scanner;

/* 4 - Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
 * d = (r + s)/2, onde r = (a + b)/2 e s = (b + c)/2
 * */

public class ExpressãoMat {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		float r, s;
		
		System.out.println("Digite os valores de A, B e C: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		r = (a + b)/2;
		s = (b + c)/2;
		
		r = (r + s)/2;
		
		System.out.println("O valor de D é: "+r);
		
	}
}
