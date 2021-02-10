
package conexao.com.br;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexao {
	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		
		String comando = "CREATE TABLE IF NOT EXISTS BENEFICIARIO ("
				+ "id serial not null,"
				+ "nome varchar(40) not null,"
				+ "telefone varchar(15) not null);";
		
		try {
			Statement statement = conn.createStatement();
			statement.execute(comando);
			
			String insert = "INSERT INTO BENEFICIARIO (nome, telefone) values ('Pelé', '4799796262')";
			statement.execute(insert);
			
			String insert2 = "INSERT INTO BENEFICIARIO (nome, telefone) values ('Teso', '479918563')";
			statement.execute(insert2);
			
			String insert3 = "INSERT INTO BENEFICIARIO (nome, telefone) values ('Andre', '4733870172')";
			statement.execute(insert3);
			
			String insert4 = "INSERT INTO BENEFICIARIO (nome, telefone) values ('Andorinha', '479632689')";
			statement.execute(insert4);
			
			String insert5 = "INSERT INTO BENEFICIARIO (nome, telefone) values ('Thuane', '4799653215')";
			statement.execute(insert5);
			
			System.out.println("comando executado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Deu ruim " + e.getMessage());
			e.printStackTrace();
		}
				
			
		
		}
}
