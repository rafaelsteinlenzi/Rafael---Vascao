package Sala;

public class SalaConf extends Sala {

	private String identifSalaConf;
	private int tvConectada;

	public SalaConf(int capacidadeFisica, String identificacao, String identifSalaConf, int tvConectada) {
		super(capacidadeFisica, identificacao);
		this.identifSalaConf = identifSalaConf;
		this.tvConectada = tvConectada;
	}

	public String getIdentifSalaConf() {
		return identifSalaConf;
	}

	public void setIdentifSalaConf(String identifSalaConf) {
		this.identifSalaConf = identifSalaConf;
	}
	
	
	
}
