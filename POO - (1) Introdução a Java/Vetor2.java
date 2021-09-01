package Turma29;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre: 
 *• Os números pares digitados;  
 *• A soma dos números pares digitados; 
 *• Os números ímpares digitados; 
 *• A quantidade de números ímpares digitados.
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
