import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Para inserir a conex�o no projeto jdbc:
Clicar com o bot�o direito do mouse em cima do projeto, ir em Build Path > Configure Build Path.
na aba libraries, clica em cima no Modulepath > nos bot�es laterais direito, clicar em Add External JARs.
Localizar seu arquivo jdbc (meu caso � o sqlite) e clicar em Aplly and Close.
*Obs: N�o mover o arquivo de lugar, caso ocorra perder� sua conex�o.
Jogar o arquivo do db em cima do seu projeto, pois iremos utiliz�-lo informando 
o nome do arquivo (aula14.db) no c�digo abaixo.*/

public class Conexao {
	public Connection conectar() {
		
		try {
			Connection conn;   // objeto para conex�o com BD
			// Conex�o SQLite
			
			Class.forName("org.sqlite.JDBC");  // faz checagem para ver se a conex�o existe no Driver jdbc
			System.out.println("Driver Encontrado!");
			
			String bdUrl = "jdbc:sqlite:aula14.db"; // objeto bdUrl string de conex�o
			conn = DriverManager.getConnection(bdUrl); // conex�o com o BD
			
			/*
			Para Conex�o mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver JDBC encontrado!");
			String bdUrl = "jdbc:mysql://localhost:3306/aula14.db?useTimezone=true&serverTimezone=UTC";
			String bdUsuario = "*****";
			String bdSenha = "*****";
			conn = DriverManager.getConnection(bdUrl,bdUsuario,bdSenha);
			*/
					
			System.out.println("Conectado com Banco de Dados!");
			return conn;
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro de conex�o! Driver n�o Econtrado!");
			ex.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Erro de conex�o!");
			e.printStackTrace();
			return null;
		} 
	
	}
	
	public void fechar(Connection c) {
		try {
			c.close();
			System.out.println("\nConex�o Fechada!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}