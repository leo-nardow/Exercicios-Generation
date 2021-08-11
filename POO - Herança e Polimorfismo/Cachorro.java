package POO;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String som, String locomover, String comida) {
		super(nome, idade, som, locomover, comida);
		setLocomover("Correr");
		setComida("Ração");
	}
}
