package Sala;

public class Escritorio extends Sala {

	private int corpoDocente;
	private int funcionarios;
	
	public Escritorio(int capacidadeFisica, String identificacao, int corpoDocente, int funcionarios) {
		super(capacidadeFisica, identificacao);
		this.corpoDocente = corpoDocente;
		this.funcionarios = funcionarios;
	}

	public int getCorpoDocente() {
		return corpoDocente;
	}

	public void setCorpoDocente(int corpoDocente) {
		this.corpoDocente = corpoDocente;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
