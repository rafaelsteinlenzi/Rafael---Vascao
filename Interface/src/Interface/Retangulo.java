package Interface;

public class Retangulo extends FigurasGeometricas implements IArea {

	private double base;
	private double altura;
	


	public Retangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public final double getArea() {
		return base * altura;
	}

	
	
	
	
	
}
