package projetojava.model;

import java.util.ArrayList;

import java.util.List;



public class Aluno {

	
	/* atributos*/
	private String nome;
	private int idade;
	private String dataNascimneto;
	private String RG;
	private String CPF;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	
	/*lista de disciplinas do aluno*/
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	/* construtor*/
    public Aluno() { 
		
		
	}

  
    
    
    /* getters setters */
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getDataNascimneto() {
		return dataNascimneto;
	}


	public void setDataNascimneto(String dataNascimneto) {
		this.dataNascimneto = dataNascimneto;
	}


	public String getRG() {
		return RG;
	}


	public void setRG(String rG) {
		RG = rG;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getNomeMae() {
		return nomeMae;
	}


	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}


	public String getNomePai() {
		return nomePai;
	}


	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}


	public String getDataMatricula() {
		return dataMatricula;
	}


	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
    
    
	/*calcula e retorna a media das disciplinas*/
	public double mediAluno() {
		
	double mediaNota=0;
	
	for(int i=0; i<= this.disciplinas.size();i++) {
		
		mediaNota += this.disciplinas.get(i).getNotaDisciplina();
		
	}
		
	
	 return mediaNota;
	}
    
	
	
	
}
