package Turma29;

import java.util.Scanner;

/*5 - Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 *Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
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
		
		System.out.println("A media �: "+n1);
		
	}
}
