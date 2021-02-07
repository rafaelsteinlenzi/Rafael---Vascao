package Sala;

public class salaConfNormal extends SalaConf {

	private boolean temWifi;



	public salaConfNormal(int capacidadeFisica, String identificacao, String identifSalaConf, int tvConectada,
			boolean temWifi) {
		super(capacidadeFisica, identificacao, identifSalaConf, tvConectada);
		this.temWifi = temWifi;
	}

	public boolean isTemWifi() {
		return temWifi;
	}

	public void setTemWifi(boolean temWifi) {
		this.temWifi = temWifi;
	}
	
}
