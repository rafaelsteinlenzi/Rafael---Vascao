import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String resposta;
		
		do  {
			cadastroNovoBeneficiario();
			
			System.out.println("Você gostaria de informar um novo beneficiário?");
			resposta = input.next();
		} while (resposta.equals("sim"));
			
		
		
	}
	
	public static void cadastroNovoBeneficiario() {
		Scanner input = new Scanner(System.in);
		String nome;
		String dataNascimento;
		Categoria categoria = null;
		String estado = null;
		
		ArrayList<Pessoa> beneficiarios = new ArrayList<>();
		
		System.out.println("Qual seu nome completo?");
		nome = input.next();
		
		System.out.println("Qual data de Nascimento?");
		dataNascimento = input.next();
		
		System.out.println("Qual a sua categoria?");
		
		System.out.println("1 - Empregado");
		System.out.println("2 - Empregador");
		System.out.println("3 - Desempregado");
		
		
		switch (input.nextInt()) {
		case 1:
			categoria = categoria.EMPREGADO;
			break;
		
		case 2:	
			categoria = categoria.EMPREGADOR;
			break;
					
		case 3:
			categoria = categoria.DESEMPREGADO;
			break;

		default:
				break;
			}
		
		System.out.println("Qual o seu estado?");
		estado = input.next();
		
		
		
		Pessoa newBeneficiario = new Pessoa(nome, dataNascimento, categoria, estado);
		
		ExibirCadastroBeneficiarios(beneficiarios);
		
		
		newBeneficiario.validarCategoria();	
		
		
		
		
	}
	
	
	public static void ExibirCadastroBeneficiarios(ArrayList<Pessoa> listarBeneficiarios) {
				
		
		for (Pessoa p : listarBeneficiarios) {
			listarBeneficiarios.add(p);
			if (p != null) {
				System.out.println("O número de beneficiários é: " + listarBeneficiarios.size());
			}
			
		}
			
		
	}
	
	
}
