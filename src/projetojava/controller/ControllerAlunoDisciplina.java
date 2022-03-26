package projetojava.controller;

import java.util.ArrayList;
import java.util.List;

import projetojava.model.Aluno;





public class ControllerAlunoDisciplina {
	
	public static List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	
	public static Aluno BuscaAlunoNome (String nome){
		Aluno alunno = new Aluno();
		
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase(nome)) {
				
				alunno = aluno;
				
				break;
			  }
		 }	
		
		return alunno;
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
