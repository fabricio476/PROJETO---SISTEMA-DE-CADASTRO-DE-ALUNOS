package projetojava.view;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projetojava.controller.ControllerAlunoDisciplina;
import projetojava.model.Aluno;
import projetojava.model.Disciplina;

public class PrimeiraClasse {
	
	/*para entrada de dados do teclado no console*/
	static Scanner scan = new Scanner(System.in);
	/* instancia __ objeto aluno*/
	static Aluno aluno;
	static Disciplina disciplinas;

	public static void main(String[] args) {
		
		
		
		
		
		int opcao=0;
		
		/*tela inicial do console*/
		do {
			
			System.out.println("-------------------------------------------------");
			System.out.println("\t 1 - Matricular Aluno");
			System.out.println("\t 2 - Lista Alunos Matriculados");
			System.out.println("\t 3 - Buscar Aluno");
			System.out.println("\t 4 - Editar Aluno");
			System.out.println("\t 5 - Excluir Aluno");
			System.out.println("\t-------------------------");
            System.out.println("\t 6 - Cadastrar Disciplina ");
            System.out.println("\t 7 - Listar Disciplinas Disponiveis");
			System.out.println("\t 8 - Editar Disciplinas");
			System.out.println("---------------------------------------------------");
			opcao = scan.nextInt();
			
			/*opçoes do menu*/
			switch (opcao) {
			
			case 1:
				aluno = new Aluno();
				
				cadastrarAluno(aluno);
				
				
				opcao = 0; /*continuar na tela inicial*/
				break;
				
	        case 2:
	        	
	        	listarAlunos();
				
	        	opcao = 0;
				break;
				
	        case 3:
		
	        	buscarAluno();
	        	
	        	opcao = 0;
		       break;
		
	        case 4:
	        	
	        	editarAluno();
		
	        	opcao =0;
		       break;
		       
	        case 5:
	        	
	        	ExcluirAluno();
	        	
	        	opcao=0;
	        	
	 	       break;  
	 	       
	        case 6:
	        	
	        	cadastarDisciplina();
	        	
	        	opcao=0;
	        	
	  	       break;  
	  	       
	        case 7:
	        	
	  	       break;  

	 	       
			default:
				break;
			}
			
			
			
			
			
			
		}while(opcao == 0 || opcao > 7);
		
	
		

		

	}
	
	/*cadastrar aluno*/
	 public static void cadastrarAluno(Aluno aluno) {
		
		System.out.println("nome do aluno :");
		aluno.setNome(scan.next());
		System.out.println("idade do aluno");
		aluno.setIdade(scan.next());
	
		ControllerAlunoDisciplina.alunos.add(aluno);
	}
	
	 /*lista os alunos matriculados*/
	 public static void listarAlunos() {
		 
		 for (Aluno aluno : ControllerAlunoDisciplina.alunos) {
			 
			 System.out.println("--------------------------------------");
			 System.out.println("Nome = "+ aluno.getNome());
			 System.out.println("Idade = "+ aluno.getIdade());
			 System.out.println("---------------------------------------");
		}
	 }
	 
	 
	 /*buscar aluno pelo nome*/
	 public static void buscarAluno() {
		 String nome;
		 aluno = new Aluno();
		 
		 System.out.println("Qual o nome do aluno?");
		 nome = scan.next();
		 
		
		aluno = ControllerAlunoDisciplina.BuscaAlunoNome(nome);
		
		    if(aluno == null) {
			
			   System.out.println("Aluno não encontrado !");
			
		    }else {
			
		     	System.out.println(aluno.toString());
			
	     	}
		 	
	 }
	 
	 /*Editar Aluno*/
	 public static void editarAluno() {
		 
		 aluno = new Aluno();
		 
		 System.out.println("Qual o nome do aluno para editar");
		 String nome = scan.next();
		 
		 aluno = ControllerAlunoDisciplina.BuscaAlunoNome(nome);
		 

			
		    if(aluno == null) {
			
			   System.out.println("Aluno não encontrado !");
			   
		    }else {
		    	
		    	int op = 0;
		     	System.out.println(" EDITAR ALUNO -> "+aluno.toString());
		     	int index = ControllerAlunoDisciplina.alunos.indexOf(aluno); /*pega o index do aluno na lista*/
		     	
		        	do {
		     		
		     		System.out.println("\t 1 - Editar NOME ");
			     	System.out.println("\t 2 - Editar IDADE ");
			     	System.out.println("\t 0 - Sair ");
		     		int opcao = scan.nextInt();
		     		
		     		if(opcao == 1) {
		     			
		     		System.out.println("Qual o novo NOME?");
		     		String nomeNovo = scan.next();
		     		ControllerAlunoDisciplina.alunos.get(index).setNome(nomeNovo); /*LOCALIZA o aluno da lista pelo INDEX e autera o NOME*/
		     			
		     			break;
		     		}else if(opcao == 2) {
		     			
		     		System.out.println("Qual o nova IDADE?");
		     		String idadeNova = scan.next();
		     		ControllerAlunoDisciplina.alunos.get(index).setIdade(idadeNova);/*LOCALIZA o aluno da lista pelo INDEX e autera a IDADE*/
		     			
		     			break;
		     			
		     		}else if(opcao == 0){
		     			
		     			break;
		     		}
			     	
		     		
		        	}while(op <=2);
		     	
		     	  	
	     	}	 
	   }
	 
	 
	 
	 
	   /* Excluir aluno da lista de alunos*/
	   public static void ExcluirAluno() {
		   
		  aluno = new Aluno(); 
		   
	      System.out.println("Qual o nome do aluno para APAGAR ?");
	      String nome = scan.next();
	      
	      
	      aluno = ControllerAlunoDisciplina.BuscaAlunoNome(nome);
	      
	      if(aluno == null) {
	    	  
	    	  System.out.println("Aluno não Encontrado !");
	    	  
	    	  
	      }else {
	    	  
	    	  ControllerAlunoDisciplina.alunos.remove(aluno);
	    	  
	    	  System.out.println("Aluno EXCLUIDO !!!!");
	    	  
	        }   
	   }
	//------------------------------------------------------------------ 
	 
	  public static void cadastarDisciplina() {
		  int op=0,ops=0;
		 
		 do {
			 
		disciplinas = new Disciplina();
		
		System.out.println(" Quer adicionar uma disciplina?");
		System.out.println(" 1 - sim | 2 - não");
		ops = scan.nextInt();
		
		  if(ops == 1) {
			
		  System.out.println("Qual o NOME da disciplina");
		  String nomeDisciplina = scan.next();
				  
		  ControllerAlunoDisciplina.disciplinasDisponiveis.add(disciplinas); 
			
			
		  }else if(ops == 2){
		 	
			
			
			 break;
		   }
		
	
			 
		   }while(op == 0);
		    
	  }
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
