package POO;

import java.util.Scanner;

/*Crie uma classe conta bancaria e apresente os atributos e 
 *métodos referentes esta classe, em seguida crie um objeto conta bancaria,
 *defina as instancias deste objeto e apresente as informações deste objeto no console.
 * */

public class TesteContaBancaria {
	public static void main (String args []) {
		ContaBancaria conta = new ContaBancaria();
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		conta.setNome(ler.next());

		System.out.println("Digite o seu CPF: ");
		conta.setCpf(ler.next());
		conta.setSaldo(0);

		System.out.println("Digite a quantia para deposito:");
		conta.depositar(ler.nextInt());
		System.out.println("Digite a quantia para saque:");
		conta.sacar(ler.nextInt());
		
		System.out.println("Nome: "+conta.getNome());
		
		System.out.println("CPF: "+conta.getCpf());
		
		System.out.println("Saldo da conta: "+conta.getSaldo());
		
		
	}
}
