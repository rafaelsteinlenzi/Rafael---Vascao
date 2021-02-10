package Interface;

public class Circulo extends FigurasGeometricas implements IArea {

	private double pi = 3.14;
	private double raio;
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.pi = pi;
		this.raio = raio;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public final double getArea() {
		return pi * (raio * raio);
	}
	
	
	
}
