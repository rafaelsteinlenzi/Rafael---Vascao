package exTransporte;

public class Aquatico extends Transporte {

	private boolean remo;
	private int qtdAcentos;
	private boolean isMotorizado;
	private String portoEstacionado;
	private int qtdPassageiros;
	
	
	
	
	public Aquatico(double capacidade, double velocidade, double altura, double largura, double peso, boolean remo,
			int qtdAcentos, boolean isMotorizado, String portoEstacionado, int qtdPassageiros) {
		super(capacidade, velocidade, altura, largura, peso);
		this.remo = remo;
		this.qtdAcentos = qtdAcentos;
		this.isMotorizado = isMotorizado;
		this.portoEstacionado = portoEstacionado;
		this.qtdPassageiros = qtdPassageiros;
	}

	public void navegar() {
		
	}
	
	public void virarEstibordo() {
		
	}
	
	public void virarBombordo() {
		
	}
	
	public void atracar() {
		
	}
	
	public void resgatar() {
		
	}

	public boolean isRemo() {
		return remo;
	}

	public void setRemo(boolean remo) {
		this.remo = remo;
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

	public String getPortoEstacionado() {
		return portoEstacionado;
	}

	public void setPortoEstacionado(String portoEstacionado) {
		this.portoEstacionado = portoEstacionado;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	
	
}
