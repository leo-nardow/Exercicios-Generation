package POO;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade, String som, String locomover, String comida) {
		super(nome, idade, som, locomover, comida);
		setLocomover("Correr");
		setComida("Verduras");
	}
}
