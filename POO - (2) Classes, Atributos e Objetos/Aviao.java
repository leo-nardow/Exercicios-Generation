package POO;

public class Aviao {
	private String modelo;
	private String cor;
	private int veloInicial;
	private int veloAtual;

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getVelocidadeInicial() {
		return veloInicial;
	}

	public void setVelocidadeInicial(int veloInicial) {
		this.veloInicial = veloInicial;
	}
	
	public int getVelocidadeAtual() {
		return veloAtual;
	}

	public void setVelocidadeAtual(int acelera) {
		this.veloAtual = this.veloInicial + acelera;
	}
}
