package Turma29;

import java.util.Scanner;

public class DivisoresDeOnze {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int i;
		for (i=1000;i<=1999;i++) {
			if ((i%11==5)) {
				System.out.println("O numero "+i+" deu resto 5");
			} 
		}
		
	}
}
