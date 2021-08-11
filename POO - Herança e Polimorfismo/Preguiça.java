package POO;

public class Preguiça extends Animal {

	public Preguiça(String nome, int idade, String som, String locomover, String comida) {
		super(nome, idade, som, locomover, comida);
		setLocomover("Escalar");
		setComida("Folhas");
	}
}