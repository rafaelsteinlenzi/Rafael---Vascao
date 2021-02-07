package Sala;

public class labComputacao extends Laboratorio {

	private int monitores;
	private int computadores;
	
	public labComputacao(int capacidadeFisica, String identificacao, boolean temPesquisa, int monitores,
			int computadores) {
		super(capacidadeFisica, identificacao, temPesquisa);
		this.monitores = monitores;
		this.computadores = computadores;
	}

	public int getMonitores() {
		return monitores;
	}

	public void setMonitores(int monitores) {
		this.monitores = monitores;
	}

	public int getComputadores() {
		return computadores;
	}

	public void setComputadores(int computadores) {
		this.computadores = computadores;
	}
	
	
	
}
