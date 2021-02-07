package Sala;

public class labFisica extends Laboratorio{

	private boolean temMaterial;

	public labFisica(int capacidadeFisica, String identificacao, boolean temPesquisa, boolean temMaterial) {
		super(capacidadeFisica, identificacao, temPesquisa);
		this.temMaterial = temMaterial;
	}

	public boolean isTemMaterial() {
		return temMaterial;
	}

	public void setTemMaterial(boolean temMaterial) {
		this.temMaterial = temMaterial;
	}
	
	
	
}
