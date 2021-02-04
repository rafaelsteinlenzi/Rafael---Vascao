package exTransporte;

public class Aviao extends Aereo {

	private int qtdstaff;
	private int qtdpassageiros;
	private int qtdTurbinas;
	private boolean isSafe;
	private String classe;
	public Aviao(double capacidade, double velocidade, double altura, double largura, double peso, int qtdHelice,
			String qtdMotor, int numeroParaQuedas, boolean caixaPreta, int qtdAsas, int qtdstaff, int qtdpassageiros,
			int qtdTurbinas, boolean isSafe, String classe) {
		super(capacidade, velocidade, altura, largura, peso, qtdHelice, qtdMotor, numeroParaQuedas, caixaPreta,
				qtdAsas);
		this.qtdstaff = qtdstaff;
		this.qtdpassageiros = qtdpassageiros;
		this.qtdTurbinas = qtdTurbinas;
		this.isSafe = isSafe;
		this.classe = classe;
	}
	
	public void girarDireita() {
		
	}
	
	public void girarEsquerda() {
			
		}
	
	public void soltarFumaca() {
		
	}
	
	public void ligarTurbinaDireita() {
		
	}
	
	public void ligarTurbinaEsquerda() {
		
	}	
	
	public int getQtdstaff() {
		return qtdstaff;
	}
	public void setQtdstaff(int qtdstaff) {
		this.qtdstaff = qtdstaff;
	}
	public int getQtdpassageiros() {
		return qtdpassageiros;
	}
	public void setQtdpassageiros(int qtdpassageiros) {
		this.qtdpassageiros = qtdpassageiros;
	}
	public int getQtdTurbinas() {
		return qtdTurbinas;
	}
	public void setQtdTurbinas(int qtdTurbinas) {
		this.qtdTurbinas = qtdTurbinas;
	}
	public boolean isSafe() {
		return isSafe;
	}
	public void setSafe(boolean isSafe) {
		this.isSafe = isSafe;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
}
