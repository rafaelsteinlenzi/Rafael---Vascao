package exTransporte;

public class Automovel extends Terrestre {

	private String cor;
	private int numeroPortas;
	private String placa;
	private int numeroBancos;
	private boolean comChassi;
	

	
	public Automovel(double capacidade, double velocidade, double altura, double largura, double peso, int numeroRodas,
			int qtdAcentos, boolean isMotorizado, int qtdMarchas, int qtdBancos, String cor, int numeroPortas,
			String placa, int numeroBancos, boolean comChassi) {
		super(capacidade, velocidade, altura, largura, peso, numeroRodas, qtdAcentos, isMotorizado, qtdMarchas,
				qtdBancos);
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		this.placa = placa;
		this.numeroBancos = numeroBancos;
		this.comChassi = comChassi;
	}

	public void ligarTracao() {
		System.out.println("On");
	}

	public void darSeta() {
		System.out.println("psc");
	}
	
	public void abrirJanela() {
		System.out.println("abre");
	}
	
	public void fecharJanela() {
		System.out.println("fecha");
	}
	
	public void ligarSetaDireita() {
		System.out.println("psc");
	}
		
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumeroBancos() {
		return numeroBancos;
	}
	public void setNumeroBancos(int numeroBancos) {
		this.numeroBancos = numeroBancos;
	}
	public boolean isComChassi() {
		return comChassi;
	}
	public void setComChassi(boolean comChassi) {
		this.comChassi = comChassi;
	}
	
	
	
	
}
