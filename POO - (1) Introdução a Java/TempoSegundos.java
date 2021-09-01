package Turma29;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 * */

public class TempoSegundos {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int h, m, s;
		
		System.out.println("Digite o tempo de duração em segundos");
		s = ler.nextInt();
		
		m = s/60;
		s = s - m*60;
		h = m/60;
		m = m - h*60;
		
		System.out.printf("%d horas, %d minutos e %d segundos\n",h, m, s);
		
		
	}
}
