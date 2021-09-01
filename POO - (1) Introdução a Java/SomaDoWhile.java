package Turma29;

import java.util.Scanner;

public class SomaDoWhile {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int i=0,soma=0;
		do {
			System.out.println("Digite um numero: ");
			i=ler.nextInt();
			soma=soma+i;
		}while(i!=0);
		
		System.out.println("O total da soma de numeros digitados eh de: "+soma);
		
	}
}