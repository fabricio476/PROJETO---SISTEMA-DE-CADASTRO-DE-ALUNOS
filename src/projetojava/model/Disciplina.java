package projetojava.model;

public class Disciplina {
	
	/*parametro*/
	private String nomeDisciplina;
	private double notaDisciplina;
	
	/*construtor*/
	public Disciplina() {
		
		
	}

	
	/* getters e setters*/
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public double getNotaDisciplina() {
		return notaDisciplina;
	}

	public void setNotaDisciplina(double notaDisciplina) {
		this.notaDisciplina = notaDisciplina;
	}


	//---
	
	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", notaDisciplina=" + notaDisciplina + "]";
	}
	
	
	
	
	//------
	
	public String toString2() {
		return "Disciplina [Nome Disciplina :" + nomeDisciplina  + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
