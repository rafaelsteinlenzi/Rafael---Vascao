package exTransporte;

public class Aereo extends Transporte {

	private int qtdHelice;
	private String qtdMotor;
	private int numeroParaQuedas;
	private boolean caixaPreta;
	private int qtdAsas;
	public Aereo(double capacidade, double velocidade, double altura, double largura, double peso, int qtdHelice,
			String qtdMotor, int numeroParaQuedas, boolean caixaPreta, int qtdAsas) {
		super(capacidade, velocidade, altura, largura, peso);
		this.qtdHelice = qtdHelice;
		this.qtdMotor = qtdMotor;
		this.numeroParaQuedas = numeroParaQuedas;
		this.caixaPreta = caixaPreta;
		this.qtdAsas = qtdAsas;
	}
	
	public void voar() {
		
	}
	
	public void pousar() {
			
		}
	
	public void decolar() {
		
	}
	
	public void passarTurbulencia() {
		
	}
	
	public void ligarLuzes() {
		
	}
	
	public int getQtdHelice() {
		return qtdHelice;
	}
	public void setQtdHelice(int qtdHelice) {
		this.qtdHelice = qtdHelice;
	}
	public String getQtdMotor() {
		return qtdMotor;
	}
	public void setQtdMotor(String qtdMotor) {
		this.qtdMotor = qtdMotor;
	}
	public int getNumeroParaQuedas() {
		return numeroParaQuedas;
	}
	public void setNumeroParaQuedas(int numeroParaQuedas) {
		this.numeroParaQuedas = numeroParaQuedas;
	}
	public boolean isCaixaPreta() {
		return caixaPreta;
	}
	public void setCaixaPreta(boolean caixaPreta) {
		this.caixaPreta = caixaPreta;
	}
	public int getQtdAsas() {
		return qtdAsas;
	}
	public void setQtdAsas(int qtdAsas) {
		this.qtdAsas = qtdAsas;
	}
	
	
	
}
