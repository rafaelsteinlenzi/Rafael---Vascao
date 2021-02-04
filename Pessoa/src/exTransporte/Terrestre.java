package exTransporte;

public class Terrestre extends Transporte {

	private int numeroRodas;
	private int qtdAcentos;
	private boolean isMotorizado;
	private int qtdMarchas;
	private int qtdBancos;
	public Terrestre(double capacidade, double velocidade, double altura, double largura, double peso, int numeroRodas,
			int qtdAcentos, boolean isMotorizado, int qtdMarchas, int qtdBancos) {
		super(capacidade, velocidade, altura, largura, peso);
		this.numeroRodas = numeroRodas;
		this.qtdAcentos = qtdAcentos;
		this.isMotorizado = isMotorizado;
		this.qtdMarchas = qtdMarchas;
		this.qtdBancos = qtdBancos;
	}
	
	public void darRe() {
		System.out.println("Ré");
	}
	
	public void virarDireita() {
		System.out.println("Ré");
	}
	
	public void virarEsquerda() {
		System.out.println("Ré");
	}
		
	public int getNumeroRodas() {
		return numeroRodas;
	}
	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	public int getQtdAcentos() {
		return qtdAcentos;
	}
	public void setQtdAcentos(int qtdAcentos) {
		this.qtdAcentos = qtdAcentos;
	}
	public boolean isMotorizado() {
		return isMotorizado;
	}
	public void setMotorizado(boolean isMotorizado) {
		this.isMotorizado = isMotorizado;
	}
	public int getQtdMarchas() {
		return qtdMarchas;
	}
	public void setQtdMarchas(int qtdMarchas) {
		this.qtdMarchas = qtdMarchas;
	}
	public int getQtdBancos() {
		return qtdBancos;
	}
	public void setQtdBancos(int qtdBancos) {
		this.qtdBancos = qtdBancos;
	}

	
	
	
	
}
