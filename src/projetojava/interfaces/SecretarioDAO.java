package projetojava.interfaces;


import java.util.List;

import projetojava.model.Aluno;
import projetojava.model.Disciplina;

public interface SecretarioDAO {

	
	 public boolean cadastrarAluno(Aluno aluno);
	 
	 public List<Aluno> listarAlunosCurso();
	 
	 public boolean editarAluno(Aluno aluno);
	 
	 public boolean excluirAluno(Aluno aluno);
	 
	 public Aluno buscarPorNome(String nome);
	 
		
//------------------------------------------------------------------------	 
	 
	 public boolean cadstrarDisciplina(Disciplina disciplina);
	 
	 public List<Disciplina> listarDisciplinas();
	 
	 public boolean aditarDisciplina(Disciplina Disciplina);
	
	
	
	
	
	
}
