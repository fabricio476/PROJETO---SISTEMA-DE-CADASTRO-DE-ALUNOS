package projetojava.interfaces;


import java.util.List;

import projetojava.model.Aluno;
import projetojava.model.Curso;
import projetojava.model.Curso_Disciplina;
import projetojava.model.Disciplina;

public interface SecretarioDAO {

	
	 public boolean cadastrarAlunoCurso(Aluno aluno);
	 
	 public List<Aluno> listarAlunos();
	 
	 public boolean editarAluno(Aluno aluno);
	 
	 public boolean excluirAluno(Aluno aluno);
	 
	 public Aluno buscarPorNome(String nome);
	 
		
//------------------------------------------------------------------------	 
	 
	 public boolean cadstrarDisciplina(Disciplina disciplina);
	 
	 public List<Disciplina> listarDisciplinas();
	 
	 public boolean aditarDisciplina(Disciplina Disciplina);
	 
//--------------------------------------------------------------------	 
	
	 public boolean cadstrarCurso(Curso curso);
	
	 public List<Curso> listarCursos();
	
	 public boolean aditarCurso(Curso curso);
	 
	 public List<Curso_Disciplina> listarDisciplinasPorCurso(String id_curso);
	 
	
}
