package conexao.com.br;

import java.util.Scanner;

public class Pessoa implements Metodos {

	private String nomeCompleto;
	private String dataNascimento;
	private Categoria categoria;
	private String UF;
	private boolean isAposentado = false;
	private int qtdFuncionarios;
	private int mesesDesempregado;
	private boolean isBeneficiario = false;
	private double valorBeneficio;
	private int tempoBeneficio;
	private boolean isDesempregado = false;
	
	Scanner input = new Scanner(System.in);
	
	public Pessoa(String nomeCompleto, String dataNascimento, Categoria categoria, String uF) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.categoria = categoria;
		UF = uF;
	}
	
	
	public void validarCategoria() {
		 String resposta;
		 
		if (this.getCategoria() == categoria.EMPREGADO) {
			System.out.printf("Voc� � aposentado?");
			resposta = input.next();
			if(resposta.equals("sim")) {
				 isAposentado = true;
				 tempoBeneficio = 6;
				System.out.println("O seu benef�cio ser� de " + tempoBeneficio +" meses!");
				 valorAuxilioEmpregados();
			} 
		}
		
		if (this.getCategoria() == categoria.EMPREGADOR) {
			System.out.println("Quantos funcion�rios?");
			qtdFuncionarios = input.nextInt();
			Empregadores();
			if (this.getQtdfuncionarios() <= 10) {
				System.out.println("O benef�cio ser� de 10 meses para empregadores com at� 10 funcion�rios!");
			}
			else if (this.getQtdfuncionarios() > 10 && this.getQtdfuncionarios() < 20) {
				valorBeneficio = (qtdFuncionarios * 200) * 0.15 + (qtdFuncionarios * 200);
				System.out.println("O seu valor total ficou em R$ " + valorBeneficio);
			}
			else if(UF == "PE" || UF == "Pernambuco") {
					System.out.println("O benef�cio de moradores de Pernambuco ter� acr�scimo de 14%!");
					valorBeneficio = (qtdFuncionarios * 200) * 0.15 + (qtdFuncionarios * 200);
					valorBeneficio = (valorBeneficio * 0.14) + valorBeneficio;
					System.out.println("O seu valor total ficou em R$ " + valorBeneficio);
			}
			
		}
		
		if (this.getCategoria() == categoria.DESEMPREGADO) {
			System.out.println("H� quantos meses est� desempregado?");
			mesesDesempregado = input.nextInt();
			tempoBeneficio = 6;
			System.out.println("O seu benef�cio ser� de " + tempoBeneficio +" meses!");
				if(UF == "PE" || UF == "Pernambuco") {
					System.out.println("O benef�cio de moradores de Pernambuco ter� acr�scimo de 14%!");
				}
		}
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}




	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}




	public String getDataNascimento() {
		return dataNascimento;
	}




	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}




	public Categoria getCategoria() {
		return categoria;
	}




	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}




	public String getUF() {
		return UF;
	}




	public void setUF(String uF) {
		UF = uF;
	}

	
	

	public int getQtdfuncionarios() {
		return qtdFuncionarios;
	}


	public void setQtdfuncionarios(int qtdfuncionarios) {
		this.qtdFuncionarios = qtdfuncionarios;
	}


	public int getMesesDesempregado() {
		return mesesDesempregado;
	}


	public void setMesesDesempregado(int mesesDesempregado) {
		this.mesesDesempregado = mesesDesempregado;
	}


	@Override
	public void valorAuxilioEmpregados() {
		System.out.println("Empregados receber�o entre R$ 1000,00 e R$ 1800,00");
	}


	@Override
	public void Empregadores() {
		System.out.println("Empregadores receber� R$ 200,00 por cada " + qtdFuncionarios + " funcion�rios");	
	}


	@Override
	public void valorDesempregados() {
		if (this.getMesesDesempregado() >= 2 && this.getMesesDesempregado() <= 12) {
			System.out.println("Desempregados receber�o entre R$ 1500,00 e R$ 2300,00");
		} else {
			System.out.println("O benef�cio do desempregado n�o � v�lido!");
		}		
	}
	
	
	public void beneficioEmpregadores() {
		if (this.getCategoria().equals(categoria.EMPREGADOR) && this.getQtdfuncionarios() <= 10) {
			System.out.println("O benef�cio ser� de 10 meses para empregadores com at� 10 funcion�rios!");
		}
	}


	
	
	
	
}
