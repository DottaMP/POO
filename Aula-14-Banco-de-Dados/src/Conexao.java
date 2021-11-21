import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Para inserir a conexão no projeto jdbc:
Clicar com o botão direito do mouse em cima do projeto, ir em Build Path > Configure Build Path.
na aba libraries, clica em cima no Modulepath > nos botões laterais direito, clicar em Add External JARs.
Localizar seu arquivo jdbc (meu caso é o sqlite) e clicar em Aplly and Close.
*Obs: Não mover o arquivo de lugar, caso ocorra perderá sua conexão.
Jogar o arquivo do db em cima do seu projeto, pois iremos utilizá-lo informando 
o nome do arquivo (aula14.db) no código abaixo.*/

public class Conexao {
	public Connection conectar() {
		
		try {
			Connection conn;   // objeto para conexão com BD
			// Conexão SQLite
			
			Class.forName("org.sqlite.JDBC");  // faz checagem para ver se a conexão existe no Driver jdbc
			System.out.println("Driver Encontrado!");
			
			String bdUrl = "jdbc:sqlite:aula14.db"; // objeto bdUrl string de conexão
			conn = DriverManager.getConnection(bdUrl); // conexão com o BD
			
			/*
			Para Conexão mysql
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
			System.out.println("Erro de conexão! Driver não Econtrado!");
			ex.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Erro de conexão!");
			e.printStackTrace();
			return null;
		} 
	
	}
	
	public void fechar(Connection c) {
		try {
			c.close();
			System.out.println("\nConexão Fechada!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}