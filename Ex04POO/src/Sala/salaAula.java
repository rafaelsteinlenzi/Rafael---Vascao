package Sala;

public class salaAula extends Sala {

	private String identifSalaAula;

	public salaAula(int capacidadeFisica, String identificacao, String identifSalaAula) {
		super(capacidadeFisica, identificacao);
		this.identifSalaAula = identifSalaAula;
	}

	public String getIdentifSalaAula() {
		return identifSalaAula;
	}

	public void setIdentifSalaAula(String identifSalaAula) {
		this.identifSalaAula = identifSalaAula;
	}
	
	
	
}
