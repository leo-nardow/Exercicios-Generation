package Turma29;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
 *� Os n�meros pares digitados;  
 *� A soma dos n�meros pares digitados; 
 *� Os n�meros �mpares digitados; 
 *� A quantidade de n�meros �mpares digitados.
 * */


public class Vetor2 {
	public static void main(String args[]) {
		int[] v = new int[6];
		int i,p=0;
		Scanner ler = new Scanner(System.in);
		
		for (i=0; i<6; i++) {
			System.out.println("Digite um numero:");
			v[i] = ler.nextInt();
		}
		System.out.println("Numeros pares digitados:");
		for (i=0; i<6; i++) {
			if(v[i]%2==0) {
				p = p + v[i];
				System.out.println(v[i]);
			}
		}
		System.out.println("Soma dos numeros pares digitados: "+p);
		p=0;
		System.out.println("Numeros impares digitados:");
		for (i=0; i<6; i++) {
			if(v[i]%2!=0) {
				p = p + v[i];
				System.out.println(v[i]);
			}
		}
		System.out.println("Soma dos numeros impares digitados: "+p);
	}
}
