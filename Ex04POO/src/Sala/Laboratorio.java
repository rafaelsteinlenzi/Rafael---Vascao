package Sala;

public class Laboratorio extends Sala {

	private boolean temPesquisa;

	public Laboratorio(int capacidadeFisica, String identificacao, boolean temPesquisa) {
		super(capacidadeFisica, identificacao);
		this.temPesquisa = temPesquisa;
	}

	public boolean isTemPesquisa() {
		return temPesquisa;
	}

	public void setTemPesquisa(boolean temPesquisa) {
		this.temPesquisa = temPesquisa;
	}
	
	
	
}
