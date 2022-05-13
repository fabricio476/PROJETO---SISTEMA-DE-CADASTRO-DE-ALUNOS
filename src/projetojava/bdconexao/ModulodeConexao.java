package projetojava.bdconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModulodeConexao {
	
	
	private static final String DRIVER = "org.hsqldb.jdbc.JDBCDriver";
	
	private static final String PATHBASE = "C:\\Sistema_de_cadastro_de_alunos\\BD\\bancoDeDados";
	
	private static final String URL ="jdbc:hsqldb:file:" + PATHBASE;
	
	
	private static final String USER = "SA";
	private static final String PASS ="";
	
	
	private static Connection conexao = null;
	
	
	private static void conexao() {
		
		if(conexao == null) {
			
			
			try {
				
				Class.forName(DRIVER);
				
				conexao = DriverManager.getConnection(URL, USER, PASS);
				
				
			} catch ( Exception e) {
				
				
                System.out.println("Erro na Conexão");
				
			}
			
		}
		
			
	}
	
	
	public static Connection getConexao() {
		
		conexao();
		
		return conexao;
	}
	
	public static void closeConexao() {
		
		try {
			conexao.close();
			
		} catch (SQLException e) {
	
			System.out.println("erro ao fechar conexão");
		}
		
	}
	
	
	public static void closeConexao(PreparedStatement pst) {
		
		try {
			pst.close();
			closeConexao();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public static void closeConexao(PreparedStatement pst, ResultSet rs) {
		
		try {
			rs.close();
			closeConexao(pst);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	

}
