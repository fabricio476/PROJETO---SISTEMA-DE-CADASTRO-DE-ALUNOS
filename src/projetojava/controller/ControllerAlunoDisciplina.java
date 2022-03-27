package projetojava.controller;

import java.util.ArrayList;
import java.util.List;

import projetojava.model.Aluno;
import projetojava.model.Disciplina;





public class ControllerAlunoDisciplina {
	
	public static List<Disciplina> disciplinasDisponiveis = new ArrayList<Disciplina>();
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
	

	 /* buscar disciplina */
	 public static Disciplina BuscarDisciolina(String nome) {
		 
		 Disciplina disciplinna = new Disciplina();
		 
		 for(Disciplina disciplina : disciplinasDisponiveis) {
			
		     if(disciplina.getNomeDisciplina().equalsIgnoreCase(nome)){
		    	 
		    	 disciplinna = disciplina;
		    	 
		    	 break;
		    	 
		      }else {
		    	  
		    	  disciplinna = null;
		    	  
		      }
			  
		  }
		 
		 
		return disciplinna; 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
