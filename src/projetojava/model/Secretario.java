package projetojava.model;

import java.util.Objects;

import projetojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{

	/*parametros*/
	private String login = "admin";
	private String senha = "admin";
	
	/*construtor*/
	public Secretario(){
		
	
	}
	
	
	/*construtor 2*/
	public Secretario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}




	/*geters e seters*/
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}



    
	
	


	@Override
	public int hashCode() {
		return Objects.hash(login, senha);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Secretario other = (Secretario) obj;
		return Objects.equals(login, other.login) && Objects.equals(senha, other.senha);
	}


	@Override
	public boolean autenticar(String login, String senha) {
		
		boolean check = false;
		
		if(login.equals(this.login) && senha.equals(this.senha)) {
			
			check =true;
			
		}	
		return check;
	}
	
	
	
	
	

}
