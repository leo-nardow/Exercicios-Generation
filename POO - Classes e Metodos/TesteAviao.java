package POO;

import java.util.Scanner;

public class TesteAviao {
	public static void main (String args []) {
		Aviao aviao = new Aviao();
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o modelo do aviao: ");
		aviao.setModelo(ler.next());
		System.out.println("Digite a cor do aviao: ");
		aviao.setCor(ler.next());

		System.out.println("Digite a velocidade inicial do aviao:");
		aviao.setVelocidadeInicial(ler.nextInt());
		System.out.println("Digite a aceleração:");
		aviao.setVelocidadeAtual(ler.nextInt());

		System.out.println("Velocidade atual do aviao:"+aviao.getVelocidadeAtual());
	}
}
