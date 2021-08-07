package Turma29;

import java.util.Scanner;

/*5 - Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 *Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 * */

public class MediaNota {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		float n1, n2, n3;
		
		System.out.println("Digite as notas do aluno: ");
		n1 = ler.nextFloat();
		n2 = ler.nextFloat();
		n3 = ler.nextFloat();
		
		n1 = (n1*2 + n2*3 + n3*5)/10;
		
		System.out.println("A media é: "+n1);
		
	}
}
