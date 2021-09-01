package POO;

public class ContaBancaria {
	private String nome;
	private String cpf;
	private double saldo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar (double quantia) {
		this.saldo = this.saldo + quantia;
	}

	public void sacar (double quantia) {
		if (quantia <= getSaldo()) {
			this.saldo = this.saldo - quantia;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
}
