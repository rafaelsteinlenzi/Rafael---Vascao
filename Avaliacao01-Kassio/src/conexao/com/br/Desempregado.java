package conexao.com.br;


import java.util.Random;
import java.util.Scanner;

public class Desempregado extends Pessoa {

	private double valorBeneficio;
	private int mesesDesempregado;
	private int tempoBeneficio = 6;
	
	public Desempregado(String nomeCompleto, String dataNascimento, Categoria categoria, String estado,
			int mesesDesempregado) {
		super(nomeCompleto, dataNascimento, categoria, estado);
		this.mesesDesempregado = mesesDesempregado;
	}

	public void perguntarQuantoTempoDesempregado() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("H� quantos meses est� desempregado? ");
		mesesDesempregado = teclado.nextInt();
	}
	
	public double getValorBeneficio() {
		// H - Se estiver desempregado h� menos de 6 meses ter� uma redu��o de 10%;
				Random valorRandom = new Random();
		
				if (mesesDesempregado < 6) {
					double percent;
					valorBeneficio = valorRandom.nextInt(2300) + 1500;
					percent = valorBeneficio * 10 / 100;
					valorBeneficio = valorBeneficio - percent;
				} else {
					valorBeneficio = valorRandom.nextInt(2300) + 1500;
				}

				return valorBeneficio;
	}

	public int getMesesDesempregado() {
		return mesesDesempregado;
	}

	public int getTempoBeneficio() {
		return tempoBeneficio;
	}
	
		
}

