package projetojava.controller;

import java.util.ArrayList;
import java.util.List;

import projetojava.model.Aluno;





public class ControllerAlunoDisciplina {
	
	public static List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	/*metodo para buscar aluno por nome*/
	public static Aluno BuscaAlunoNome (String nome){
		Aluno alunno = new Aluno();
		
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase(nome)) {
				
				
				
				alunno = aluno;
				
				break;
			  }else {
				  
				  alunno = null;
				  
			  }
		 }	
		
		return alunno;
     }
	
	public static void editarAluno(int op ,String string, Aluno alunoEditar) {
		
		
	               int i =	alunos.indexOf(alunoEditar);
		
	               alunos.get(i).setNome(string);
		
	           if(op == i) {
	        	   
	        	   
	        	   
	           }else if(op == 2) {
	        	   
	        	   
	        	   
	           }
	        	   
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
