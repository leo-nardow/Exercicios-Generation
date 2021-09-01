package Turma29;

import java.util.Scanner;

public class IdadeWhile {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int i=0,m1=0,m2=0;
		
		while (i!=-99) {
			System.out.println("Digite a idade: ");
			i=ler.nextInt();
			if (i>50) {
				m2++;
			}
			if(i<21) {
				m1++;
			}
			System.out.println("O total de pessoas com menos de 21 anos: "+m1+"\n O total de pessoas com mais de 50 anos: "+m2);
			
		}
		
	}
}
