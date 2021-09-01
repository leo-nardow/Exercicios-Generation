package POO;

public class Animal {
	private String nome;
	private int idade;
	private String som;
	private String locomover;
	private String comida;


	public Animal (String nome, int idade, String som, String locomover, String comida) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.locomover = locomover;
		this.comida = comida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getLocomover() {
		return locomover;
	}

	public void setLocomover(String locomover) {
		this.locomover = locomover;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}
}
