package POO;

public class Pregui�a extends Animal {

	public Pregui�a(String nome, int idade, String som, String locomover, String comida) {
		super(nome, idade, som, locomover, comida);
		setLocomover("Escalar");
		setComida("Folhas");
	}
}