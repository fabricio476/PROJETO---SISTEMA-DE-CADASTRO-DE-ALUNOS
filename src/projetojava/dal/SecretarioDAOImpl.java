package projetojava.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import projetojava.bdconexao.ModulodeConexao;
import projetojava.interfaces.SecretarioDAO;
import projetojava.model.Aluno;
import projetojava.model.Curso;
import projetojava.model.Curso_Disciplina;
import projetojava.model.Disciplina;

public class SecretarioDAOImpl implements SecretarioDAO{
	
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	

	@Override
	public boolean cadastrarAlunoCurso(Aluno aluno) {
		
		conexao = ModulodeConexao.getConexao();
		
		String sql_insert = "INSERT INTO";
		
		
		
		
		return false;
	}

	@Override
	public List<Aluno> listarAlunos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluirAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Aluno buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cadstrarDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Disciplina> listarDisciplinas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean aditarDisciplina(Disciplina Disciplina) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cadstrarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean aditarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Curso_Disciplina> listarDisciplinasPorCurso(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
