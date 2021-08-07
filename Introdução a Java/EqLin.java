package Turma29;

/*Um sistema de equações lineares do tipo: 
 * 
 * ax + by = c
 * dx + ey = f
 * 
 * pode ser resolvido segundo mostrado abaixo:
 * 
 * x = (c*e - b*f)/(a*e - b*d)
 * y = (a*f - c*d)/(a*e - b*d)
 * 
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
 * */

import java.util.Scanner;

public class EqLin {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, e, f;
		float x, y;
		
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		e = ler.nextInt();
		f = ler.nextInt();
		
		x = (c*e - b*f)/(a*e - b*d);
		
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.println("O valor de x é: "+x);
		System.out.println("O valor de y é: "+y);
	}
}
