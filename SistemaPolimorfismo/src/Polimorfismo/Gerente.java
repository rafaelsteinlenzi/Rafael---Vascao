package Polimorfismo;

public final class Gerente extends Pessoa {

	private float valorDescontoGerente;

	

	public Gerente(String nome, int idade, float salario, double valorDesconto, double valorCompra,
			float valorDescontoGerente) {
		super(nome, idade, salario, valorDesconto, valorCompra);
		this.valorDescontoGerente = valorDescontoGerente;
	}

	@Override
	public double getValorDesconto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getValorCompra() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
