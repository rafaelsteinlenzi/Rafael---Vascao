package conexao.com.br;


import java.util.Scanner;

public class Empregador extends Pessoa {

	private int qtdFuncionarios;
	private double valorBeneficio;
	private int tempoBeneficio;
			
	public Empregador(String nomeCompleto, String dataNascimento, Categoria categoria, String estado,
			int qtdFuncionarios) {
		super(nomeCompleto, dataNascimento, categoria, estado);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public void solicitarQtdFuncionarios() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos funcionários trabalham na empresa? ");
		qtdFuncionarios = teclado.nextInt();
	}
	
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}
	public double getValorBeneficio() {
		
		double percent;
		if (qtdFuncionarios <= 10) {
			valorBeneficio = 200 * qtdFuncionarios;
			percent = valorBeneficio / 100 * 18;
			valorBeneficio = valorBeneficio + percent;
		} else if (qtdFuncionarios <= 40) {
			valorBeneficio = 200 * qtdFuncionarios;
			percent = valorBeneficio / 100 * 11;
			valorBeneficio = valorBeneficio + percent;
		}

		else if (qtdFuncionarios <= 50) {
			valorBeneficio = 200 * qtdFuncionarios;
			percent = valorBeneficio / 100 * 10;
			valorBeneficio = valorBeneficio + percent;
		}
		
		return valorBeneficio;
	}
	public int getTempoBeneficio() {
		
		if (qtdFuncionarios <= 10) {
			tempoBeneficio = 10;
		} else {
			tempoBeneficio = 7;
		}
		return tempoBeneficio;
		
	}
	
	
	
}
