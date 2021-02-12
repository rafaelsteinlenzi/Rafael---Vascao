package conexao.com.br;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Conexao {

	public static void main(String[] args) {
		
		Connection conn = new ConnectionFactory().getConnection();
		
		String criarTabela = "CREATE TABLE IF NOT EXISTS BENEFICIARIOS ("
				+ "id serial not null,"
				+ "nome varchar (40) not null," 
				+ "datanascmto varchar(20) not null,"
				+ "categoria varchar(60) not null,"
				+ "estado varchar(10) not null,"
				+ "aposentado varchar(5),"
				+ "qtdfuncionarios integer, "
				+ "tempodesemprego integer,"
				+ "valorBeneficio decimal(10, 2));";
				
		try {
			Statement statement = conn.createStatement();
			statement.execute(criarTabela);
			System.out.println("Tabela criada com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Deu ruim: " + e.getMessage());
			e.printStackTrace();
		}
		
Scanner input = new Scanner(System.in);

String resposta;
System.out.println("\n\nVocê gostaria de informar um novo beneficiário?");
resposta = input.next();

while (resposta.equals("sim")) {
	
	try {
		Statement statement = conn.createStatement();
		statement.execute(InserirBeneficiario());											
		System.out.println("Beneficiario adicionado com sucesso!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Deu ruim: " + e.getMessage());
		e.printStackTrace();
	}
	
	System.out.println("\n\nVocê gostaria de informar um novo beneficiário?");
	resposta = input.next();
	}


	try {
		
		Statement statement = conn.createStatement();
		
		String select = "SELECT * from BENEFICIARIOS;";
		ResultSet resultSet =  statement.executeQuery(select);
		
		while (resultSet.next()) {
			System.out.println("ID: " + resultSet.getInt("id"));
			System.out.println("Nome: " + resultSet.getString("nome"));
			System.out.println("Data de Nascimento: " + resultSet.getString("datanascmto"));
			System.out.println("Categoria: " + resultSet.getString("categoria"));
			System.out.println("Estado: " + resultSet.getString("estado"));
			System.out.println("Aposentado: " + resultSet.getString("aposentado"));
			System.out.println("Quantidade de Funcionarios: " + resultSet.getInt("qtdFuncionarios"));
			System.out.println("Tempo Desempregado: " + resultSet.getInt("tempoDesemprego"));
			System.out.println("Valor do Beneficio: R$ " + resultSet.getDouble("valorBeneficio"));
		}
		
	} catch (SQLException e) {
		
		System.out.println("Deu ruim: " + e.getMessage());
		e.printStackTrace();
	}
	
	System.out.println("\n\nVocê gostaria de deletar um beneficiário?");
	resposta = input.next();
	
	while (resposta.equals("sim")) {		
		try {
			Statement statement = conn.createStatement();
			int idBenef;
			System.out.println("\nInforme o ID do beneficiário: ");
			idBenef = input.nextInt();
			
			String delete = "DELETE FROM BENEFICIARIOS WHERE id = " + idBenef;
			ResultSet resultSet =  statement.executeQuery(delete);
			
			System.out.println("Beneficiário deletado com sucesso!");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Deu ruim: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
	
	public static String InserirBeneficiario() {
		Scanner input = new Scanner(System.in);
		String insert = "";
		
		String nome;
		String dataNascimento;
		Categoria categoria = null;
		String estado;
				
		System.out.println("\nNome completo do beneficiario: ");
		nome = input.next();
		
		System.out.println("\nData de Nascimento do beneficiario:");
		dataNascimento = input.next();
		
		System.out.println("\nEstado do beneficiario (UF): ");
		estado = input.next();
		
		System.out.println("\nCategoria do beneficiario: ");
		
		System.out.println("1 - Empregado");
		System.out.println("2 - Empregador");
		System.out.println("3 - Desempregado");
		
		switch (input.nextInt()) {
		case 1:
			categoria = Categoria.EMPREGADO;
			
			Empregado empregado = new Empregado(nome, dataNascimento, categoria, estado, false);
			empregado.validaSeAposentado();
			insert = "INSERT INTO BENEFICIARIOS (nome, datanascmto, categoria, estado, aposentado, valorBeneficio) "
					+ "values ('" + empregado.getNomeCompleto() + "','" + empregado.getDataNascimento() + "',"
							+ "'" + empregado.getCategoria() + "', '"+ empregado.getUF() +"', '" + empregado.isAposentado() + "',"
									+ "'" + empregado.getValorBeneficio() + "')";
			break;
		
		case 2:	
			categoria = Categoria.EMPREGADOR;
			Empregador empregador = new Empregador(nome, dataNascimento, categoria, estado, 0);
			empregador.solicitarQtdFuncionarios();
			insert = "INSERT INTO BENEFICIARIOS (nome, datanascmto, categoria, estado, qtdFuncionarios, valorBeneficio) "
					+ "values ('" + empregador.getNomeCompleto() + "','" + empregador.getDataNascimento() + "',"
					+ "'" + empregador.getCategoria() + "', '"+ empregador.getUF() +"','" + empregador.getQtdFuncionarios() 
					+ "','" + empregador.getValorBeneficio() + "')";
			break;
					
		case 3:
			categoria = Categoria.DESEMPREGADO;
			Desempregado desempregado = new Desempregado(nome, dataNascimento, categoria, estado, 0);
			desempregado.perguntarQuantoTempoDesempregado();
			insert = "INSERT INTO BENEFICIARIOS (nome, datanascmto, categoria, estado, tempodesemprego, valorBeneficio) "
					+ "values ('" + desempregado.getNomeCompleto() + "','" + desempregado.getDataNascimento() + "',"
					+ "'" + desempregado.getCategoria() + "', '"+ desempregado.getUF() +"','" + desempregado.getMesesDesempregado() 
					+ "','" + desempregado.getValorBeneficio() + "')";
			break;

		default:
				break;
			}
		
		return insert;
		
		
	}
	
}




