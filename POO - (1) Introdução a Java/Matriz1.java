package Turma29;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 * */

public class Matriz1 {
	public static void main (String args[]) {
		int[][] m = new int [3][3];
		int i, j, cont=0;
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				System.out.println("Digite um valor: ");
				m[i][j] = ler.nextInt();
				if (m[i][j]>10) {
					cont++;
				}
			}
		}
		
		System.out.printf("A matriz possui %d valores maiores do que 10\n", cont);
	}
}
