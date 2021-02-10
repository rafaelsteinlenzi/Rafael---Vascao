package Polimorfismo;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private float salario;
	private double valorDesconto;
	private double valorCompra;
	

	public Pessoa(String nome, int idade, float salario, double valorDesconto, double valorCompra) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.valorDesconto = valorDesconto;
		this.valorCompra = valorCompra;
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
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public abstract double getValorDesconto();

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public abstract double getValorCompra();

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorCompraCliente() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
