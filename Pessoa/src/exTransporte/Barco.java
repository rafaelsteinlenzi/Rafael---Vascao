package exTransporte;

public class Barco extends Aquatico {

	private boolean vela;
	private String capitao;
	private String nomeEmbarcacao;
	private boolean boteSalvaVidas;
	private int qtdtripulantes;
	
	public Barco(double capacidade, double velocidade, double altura, double largura, double peso, boolean remo,
			int qtdAcentos, boolean isMotorizado, String portoEstacionado, int qtdPassageiros, boolean vela,
			String capitao, String nomeEmbarcacao, boolean boteSalvaVidas, int qtdtripulantes) {
		super(capacidade, velocidade, altura, largura, peso, remo, qtdAcentos, isMotorizado, portoEstacionado,
				qtdPassageiros);
		this.vela = vela;
		this.capitao = capitao;
		this.nomeEmbarcacao = nomeEmbarcacao;
		this.boteSalvaVidas = boteSalvaVidas;
		this.qtdtripulantes = qtdtripulantes;
	}
	
	public void velejar() {
		
	}
	
	public void ancorar() {
			
		}
	
	public void localizar() {
		
	}
	
	public void descerTripulanteaoMar() {
		
	}
	
	public void subirTripulante() {
		
	}

	public boolean isVela() {
		return vela;
	}

	public void setVela(boolean vela) {
		this.vela = vela;
	}

	public String getCapitao() {
		return capitao;
	}

	public void setCapitao(String capitao) {
		this.capitao = capitao;
	}

	public String getNomeEmbarcacao() {
		return nomeEmbarcacao;
	}

	public void setNomeEmbarcacao(String nomeEmbarcacao) {
		this.nomeEmbarcacao = nomeEmbarcacao;
	}

	public boolean isBoteSalvaVidas() {
		return boteSalvaVidas;
	}

	public void setBoteSalvaVidas(boolean boteSalvaVidas) {
		this.boteSalvaVidas = boteSalvaVidas;
	}

	public int getQtdtripulantes() {
		return qtdtripulantes;
	}

	public void setQtdtripulantes(int qtdtripulantes) {
		this.qtdtripulantes = qtdtripulantes;
	}

}
