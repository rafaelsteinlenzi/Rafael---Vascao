
package conexao.com.br;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexao {
	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		
		String comando = "CREATE TABLE IF NOT EXISTS CLIENTE ("
				+ "id serial not null,"
				+ "nome varchar(40) not null,"
				+ "email varchar(60) not null);";
		
		try {
			Statement statement = conn.createStatement();
			statement.execute(comando);
			
			String insert = "INSERT INTO CLIENTE (nome, email) values ('biro-biro', 'biro@biro.com.br')";
			statement.execute(insert);
			
			String insert2 = "INSERT INTO CLIENTE (nome, email) values ('biro', 'biro@biro.com')";
			statement.execute(insert2);
			
			String delete = "DELETE FROM CLIENTE WHERE ID = 5";
			statement.execute(delete);
			
			String update = "UPDATE cliente SET NOME = 'Kassioevascaino' where id = 4";
			statement.execute(update);
			
			String update2 = "UPDATE cliente SET NOME = 'Kassioamaovasco' where id = 3";
			statement.execute(update2);
			
			String select = "SELECT ID, NOME, EMAIL FROM CLIENTE";
			ResultSet resultset = statement.executeQuery(select);
			
			while (resultset.next()) {
				System.out.println("id: " + resultset.getInt("id"));
				System.out.println("Nome " + resultset.getString("nome"));
				System.out.println("Email: " + resultset.getString("email"));
			}
			
			System.out.println("comando executado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Deu ruim " + e.getMessage());
			e.printStackTrace();
		}
				
			
		
		}
}
