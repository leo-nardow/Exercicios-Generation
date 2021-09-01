package Turma29;

import java.util.Scanner;

/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
 *(1) somar as duas matrizes 
 *(2) subtrair a primeira matriz da segunda 
 *(3) adicionar uma constante as duas matrizes
 *(4) imprimir as matrizes 
 *Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
 *Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 * */

public class Matriz2 {
	public static void main (String args[]) {
		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		int[][] m3 = new int[2][2];
		int i, j, op;
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				System.out.println("Digite um valor: ");
				m1[i][j] = ler.nextInt();
			}
		}
		for(i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				System.out.println("Digite um valor: ");
				m2[i][j] = ler.nextInt();
			}
		}
		
		System.out.println("Digite uma das opções a seguir:");
		System.out.println("(1) somar as duas matrizes ");
		System.out.println("(2) subtrair a primeira matriz da segunda ");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		System.out.println("(5) finalizar o progrma");
		op = ler.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("A soma das matrizes é: ");
				for(i=0; i<2; i++) {
					for (j=0; j<2; j++) {
						m3[i][j] = m1[i][j] + m2[i][j];
						System.out.printf("\t%d\t",m3[i][j]);
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("A subtração das matrizes é: ");
				for(i=0; i<2; i++) {
					for (j=0; j<2; j++) {
						m3[i][j] = m1[i][j] - m2[i][j];
						System.out.printf("\t%d\t",m3[i][j]);
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Digite uma constante");
				op = ler.nextInt();
				for(i=0; i<2; i++) {
					for (j=0; j<2; j++) {
						m1[i][j] = m1[i][j] + op;
						m2[i][j] = m2[i][j] + op;
						System.out.printf("\t%d\t",m1[i][j]);
					}
					System.out.println();
				}
				for(i=0; i<2; i++) {
					for (j=0; j<2; j++) {
						System.out.printf("\t%d\t",m2[i][j]);
					}
					System.out.println();
				}
				break;
			case 4:
				System.out.println("A impressão das matrizes é: ");
				System.out.println("Primeira matriz: ");
				for(i=0; i<2; i++) {
					for (j=0; j<2; j++) {
						System.out.printf("\t%d\t",m1[i][j]);
					}
					System.out.println();
				}

				System.out.println("Segunda matriz: ");
				for(i=0; i<2; i++) {
					for (j=0; j<2; j++) {
						System.out.printf("\t%d\t",m2[i][j]);
					}
					System.out.println();
				}
				break;
			default:				
		}
	}
}
