package projetojava.model;

public abstract class Pessoa {
	
	/*atributos*/
	protected int id;
	protected String nome;
	protected String idade;
	protected String dataNascimneto;
	protected String RG;
	protected String CPF;
	protected String nomeMae;
	protected String nomePai;
	
	
	
	/*gets e sets*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
