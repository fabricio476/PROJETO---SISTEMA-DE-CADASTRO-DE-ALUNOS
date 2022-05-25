package projetojava.model;

public class Curso_Disciplina {
	
	private int id;
	private int curso_id;
	private int disciplina_id;
	
	
	public Curso_Disciplina() { }
	
	


	public Curso_Disciplina(int id, int curso_id, int disciplina_id) {
		setId(id);
	    setCurso_id(curso_id);
		setDisciplina_id(disciplina_id);
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCurso_id() {
		return curso_id;
	}


	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}


	public int getDisciplina_id() {
		return disciplina_id;
	}


	public void setDisciplina_id(int disciplina_id) {
		this.disciplina_id = disciplina_id;
	}
	
	
	

}
