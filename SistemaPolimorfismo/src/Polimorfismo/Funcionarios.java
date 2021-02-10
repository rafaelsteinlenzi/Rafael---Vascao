package Polimorfismo;

public final class Funcionarios extends Pessoa {

	private double valorCompraFunc;
	private double valorDescontoFunc;
	
	public Funcionarios(String nome, int idade, float salario, double valorDesconto, double valorCompra,
			double valorCompra2, double valorDesconto2) {
		super(nome, idade, salario, valorDesconto, valorCompra);
		valorDesconto = valorDesconto2;
	}

	@Override
	public double getValorCompra() {
		return valorCompraFunc - this.getValorDesconto();
	}

	
	@Override
	public double getValorDesconto() {
		return valorDescontoFunc = valorCompraFunc * 0.25;
	}

			
}
