package Interface;

public class Quadrado extends FigurasGeometricas implements IArea {

	private double lado;



	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public final double getArea() {
		return lado * lado;
	}
	
	
	
}
