package exTransporte;

public class Transporte {

	private double capacidade;
	private double velocidade;
	private double altura;
	private double largura;
	private double peso;
	
	public Transporte(double capacidade, double velocidade, double altura, double largura, double peso) {
		super();
		this.capacidade = capacidade;
		this.velocidade = velocidade;
		this.altura = altura;
		this.largura = largura;
		this.peso = peso;
	}
	
	public void ligar() {
		System.out.println("Ligando");
	}
	
	public void desligar() {
		System.out.println("Desligando");
	}
	
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void frear() {
		System.out.println("Freiando");
	}
	
	public void buzinar() {
		System.out.println("Bip");
	}
	
	
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
