package Sala;

public abstract class Sala {

	private int capacidadeFisica;
	private String identificacao;
	
	
	
	public Sala(int capacidadeFisica, String identificacao) {
		super();
		this.capacidadeFisica = capacidadeFisica;
		this.identificacao = identificacao;
	}

	public int getCapacidadeFisica() {
		return capacidadeFisica;
	}

	public void setCapacidadeFisica(int capacidadeFisica) {
		this.capacidadeFisica = capacidadeFisica;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	
	
}
