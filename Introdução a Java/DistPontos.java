package Turma29;

/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
 *A fórmula que efetua tal cálculo é: 
 *d = sqrt(pow((x2-x1),2) + pow((y2-y1),2))
 * */

import java.util.Scanner;

public class DistPontos {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.println("Digite os valores de x1, x2, y1, y2:");
		
		x1 = ler.nextFloat();
		x2 = ler.nextFloat();
		y1 = ler.nextFloat();
		y2 = ler.nextFloat();
		
		d = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		System.out.printf("A distancia vale: %.2f",d);
	}
}
