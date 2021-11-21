import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depto = 0;
		Connection conn = null;    // objeto do tipo Java Connection
		Conexao conexao = new Conexao(); // objeto do tipo Conexao
		conn = conexao.conectar();	// abrindo uma conexão com o BD
		System.out.print("------------------------------------------------------");
		System.out.print("\nDigite 0 para sair ou informe o Id do departamento.\n");
		System.out.print("------------------------------------------------------");
		do {
			System.out.print("\nId Depto: ");
			depto = sc.nextInt(); 
			
			// string com comando Select do banco de dados, inserir o nome da tabela igual ao do banco.
			String sql = "Select idDepto, nomeDepto From Departamento Where idDepto="+depto;
			
			try {
				// Criar objeto para execução de comandos SQL
				Statement comandoSQL = conn.createStatement();
				
				// Executar comando SQL e guardar o resultado
				ResultSet rs = comandoSQL.executeQuery(sql);
				
				while (rs.next()) { // lê uma linha do resultado
					System.out.println("Id: "+ rs.getInt("idDepto")+" - Nome Departamento: "+rs.getString("nomeDepto"));
				}				
			} catch (SQLException ex) {
				System.out.println("Problema Execução SQL - "+sql);
				ex.printStackTrace();
			}
		} while (depto!=0);
		
		conexao.fechar(conn); // fechando a conexão com o BD
	}
	
}
