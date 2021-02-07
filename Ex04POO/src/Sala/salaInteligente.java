package Sala;

public class salaInteligente extends salaNormal  {

	private int pcRede;
	private int sistemaAudio;
	private int projetorAcoplado;
	



	public salaInteligente(int capacidadeFisica, String identificacao, String identifSalaAula, int assento, int quadro,
			int mesaProf, int assento2, int quadro2, int mesaProf2, int pcRede, int sistemaAudio,
			int projetorAcoplado) {
		super(capacidadeFisica, identificacao, identifSalaAula, assento, quadro, mesaProf);
		assento = assento2;
		quadro = quadro2;
		mesaProf = mesaProf2;
		this.pcRede = pcRede;
		this.sistemaAudio = sistemaAudio;
		this.projetorAcoplado = projetorAcoplado;
	}


	
	public int getPcRede() {
		return pcRede;
	}



	public void setPcRede(int pcRede) {
		this.pcRede = pcRede;
	}



	public int getSistemaAudio() {
		return sistemaAudio;
	}



	public void setSistemaAudio(int sistemaAudio) {
		this.sistemaAudio = sistemaAudio;
	}



	public int getProjetorAcoplado() {
		return projetorAcoplado;
	}



	public void setProjetorAcoplado(int projetorAcoplado) {
		this.projetorAcoplado = projetorAcoplado;
	}



	public void ligarprojetorAcoplado() {
		
	}
	
	public void desligarprojetorAcoplado() {
		
	}
	
}
