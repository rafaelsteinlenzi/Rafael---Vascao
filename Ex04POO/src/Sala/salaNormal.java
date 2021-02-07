package Sala;

public class salaNormal extends salaAula {

	private int assento = 1;
	private int quadro = 1;
	private int mesaProf = 1;
	
	
	
		public salaNormal(int capacidadeFisica, String identificacao, String identifSalaAula, int assento, int quadro,
			int mesaProf) {
		super(capacidadeFisica, identificacao, identifSalaAula);
		this.assento = assento;
		this.quadro = quadro;
		this.mesaProf = mesaProf;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public int getQuadro() {
		return quadro;
	}

	public void setQuadro(int quadro) {
		this.quadro = quadro;
	}

	public int getMesaProf() {
		return mesaProf;
	}

	public void setMesaProf(int mesaProf) {
		this.mesaProf = mesaProf;
	}
	
	
	
}
