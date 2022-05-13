package projetojava.view;

import java.sql.Connection;

import projetojava.bdconexao.ModulodeConexao;

public class TesteConexao {

	public static void main(String[] args) {
		
		
		Connection conexao = ModulodeConexao.getConexao();
		
		
		if(conexao != null) {
			
			System.out.println("Conectou !! "+conexao);
			
		}else {
			
			System.out.println("Erro na conexão !!");
		}
		
		
		

	}

}
