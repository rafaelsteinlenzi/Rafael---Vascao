package Interface;

public abstract class FigurasGeometricas {
	
	private String nome;

	
	
	public FigurasGeometricas(String nome) {
		super();
		this.nome = nome;
	}



	public abstract double getArea();
	
	
}
