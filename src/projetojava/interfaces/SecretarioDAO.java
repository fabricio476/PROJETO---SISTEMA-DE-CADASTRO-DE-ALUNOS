package projetojava.interfaces;


import java.util.List;

import projetojava.model.Aluno;

public interface SecretarioDAO {

	
	 public boolean cadastrarAluno(Aluno aluno);
	 
	 public List<Aluno> listarAlunos();
	 
	 public boolean editarAluno(Aluno aluno);
	 
	 public boolean excluirAluno(Aluno aluno);
		
//------------------------------------------------------------------------	 
	
	
	
	
	
	
}
