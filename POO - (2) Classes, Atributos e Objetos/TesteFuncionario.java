package POO;

/* Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
 * em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as
 * informações deste objeto no console.
 * */

import java.util.Scanner;

public class TesteFuncionario {
	public static void main (String args []) {
		Funcionario func = new Funcionario();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario:");
		func.setNome(ler.next());
		System.out.println("Digite o nome do funcionario:");
		func.setSalario(ler.nextInt()); 


		

		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}
}
