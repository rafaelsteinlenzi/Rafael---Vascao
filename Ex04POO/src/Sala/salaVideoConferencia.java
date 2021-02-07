package Sala;

public class salaVideoConferencia extends SalaConf {

	private int cameras;
	private int telefone;
	private int microfone;
	private int mesa;
	private int televisao;
	private boolean temWifi;
	


	public salaVideoConferencia(int capacidadeFisica, String identificacao, String identifSalaConf, int tvConectada,
			int cameras, int telefone, int microfone, int mesa, int televisao, boolean temWifi) {
		super(capacidadeFisica, identificacao, identifSalaConf, tvConectada);
		this.cameras = cameras;
		this.telefone = telefone;
		this.microfone = microfone;
		this.mesa = mesa;
		this.televisao = televisao;
		this.temWifi = temWifi;
	}

	public int getCameras() {
		return cameras;
	}

	public void setCameras(int cameras) {
		this.cameras = cameras;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getMicrofone() {
		return microfone;
	}

	public void setMicrofone(int microfone) {
		this.microfone = microfone;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public int getTelevisao() {
		return televisao;
	}

	public void setTelevisao(int televisao) {
		this.televisao = televisao;
	}

	public boolean isTemWifi() {
		return temWifi;
	}

	public void setTemWifi(boolean temWifi) {
		this.temWifi = temWifi;
	}
	
		
}
