package conexao.com.br;


import java.util.Random;
import java.util.Scanner;

public class Empregado extends Pessoa {

	private boolean isAposentado;
	private int valorBeneficio;
	private int tempoBeneficio;
	
	public Empregado(String nomeCompleto, String dataNascimento, Categoria categoria, String estado,
			boolean isAposentado) {
		super(nomeCompleto, dataNascimento, categoria, estado);
		this.isAposentado = isAposentado;
	}

	public void validaSeAposentado() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("\nBeneficiario é aposentado? ");
		String resposta = input.next();
		if (resposta.equals("sim")) {
			isAposentado();
		}
		
	}
	
	public boolean isAposentado() {
		return isAposentado;
	}

	public int getValorBeneficio() {
		
		Random valorRandom = new Random();
		
		if (!isAposentado) {
			
			valorBeneficio = valorRandom.nextInt(1800) + 1000;
		} else {
			int percentAposentado;
			valorBeneficio = valorRandom.nextInt(1800) + 1000;
			percentAposentado = (valorBeneficio * 30) / 100;
			valorBeneficio = percentAposentado + valorBeneficio;
		}

		return valorBeneficio;
		
	}

	public int getTempoBeneficio() {
		if (!isAposentado) {
			tempoBeneficio = 3;
		} else {
			tempoBeneficio = 6;
		}
		return tempoBeneficio;
	}

	@Override
	public String toString() {
		return "Empregado [isAposentado=" + isAposentado + ", valorBeneficio=" + valorBeneficio + ", tempoBeneficio="
				+ tempoBeneficio + "]";
	}
	
	
	
}
