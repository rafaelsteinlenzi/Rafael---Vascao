package Polimorfismo;

public final class Cliente extends Pessoa {

	private double valorDescontoCliente;
	private double valorCompraCliente;
	
	public Cliente(String nome, int idade, float salario, double valorDesconto, double valorCompra,
			float valorDescontoCliente, double valorCompraCliente) {
		super(nome, idade, salario, valorDesconto, valorCompra);
		this.valorDescontoCliente = valorDescontoCliente;
		this.valorCompraCliente = valorCompraCliente;
	}

	@Override
	public double getValorDesconto() {
		return valorCompraCliente * 0.05;
	}

	@Override
	public double getValorCompra() {
		return valorCompraCliente - this.getValorDesconto();
	}

	
	
	
	


	
		
}
