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
	static Disciplina disciplina;

	public static void main(String[] args) {
		
		ControllerAlunoDisciplina.carregarDisciplinas();
		
		
		
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
				
				
				cadastrarAluno();
				
				
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
	        	
	        	listarDisciplinas(ControllerAlunoDisciplina.disciplinasDisponiveis); /*recebe uma lista como parametro*/
	        	
	        	opcao=0;
	        	
	  	       break;  
	  	       
            case 8:
	        	
            	editarDisciplina();
	        	
	        opcao=0;
	        	
	  	       break;  

	 	       
			default:
				
				opcao =0;
				break;
			}
			
			
			
			
			
			
		}while(opcao == 0 || opcao > 7);
		
	
		

		

	}
	
	/*cadastrar aluno*/
	 public static void cadastrarAluno() {
		 
		int op=0;
		
		aluno = new Aluno();
		 
		System.out.println("nome do aluno :");
		aluno.setNome(scan.next());
		System.out.println("idade do aluno");
		aluno.setIdade(scan.next());
		
		System.out.println("Deseja adicionar disciplina ?");
		System.out.println("1- sim | 2- não");
		op = scan.nextInt();
		
		if(op == 1 ) {
			
		do {
			
			disciplina = new Disciplina();
			
			System.out.println(" - Disciplinas Disponiveis -");	
			listarDisciplinas(ControllerAlunoDisciplina.disciplinasDisponiveis); /*printa as disciplinas disponiveis*/
			System.out.println(" ");	
			System.out.println("NUMERO da disciplina para ADICIONAR !");
			op = scan.nextInt();
			
			disciplina = ControllerAlunoDisciplina.disciplinasDisponiveis.get(op-1);
			aluno.getDisciplinas().add(disciplina);
			
			System.out.println("Deseja adicionar MAIS disciplinas");
			System.out.println("1- sim | 0 - não");
			op = scan.nextInt();
			
		}while(op != 0);
		
			
		}
		
		ControllerAlunoDisciplina.alunos.add(aluno);
	}
	
	 /*lista os alunos matriculados*/
	 public static void listarAlunos() {
		 
		 for (Aluno aluno : ControllerAlunoDisciplina.alunos) {
			 
			 System.out.println("--------------------------------------");
			 System.out.println("Nome = "+ aluno.getNome());
			 System.out.println("Idade = "+ aluno.getIdade());
			 
			 System.out.println("-- Disciplinas Matriculado: --");
			 
			 /*metodo que printa uma lista de disciplinas*/
			 listarDisciplinas(aluno.getDisciplinas()); 
			 
			 System.out.println("---------------------------------------");
		}
	 }
	 
	 
	 /*buscar aluno pelo nome*/
	 public static void buscarAluno() {
		 String nome;
		 aluno = new Aluno();
		 
		 System.out.println("Qual o nome do aluno?");
		 nome = scan.next();
		 
		
		aluno = ControllerAlunoDisciplina.BuscaAlunoNome(nome); /*buscar aluno da lista pelo nome*/
		
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
		 
		 aluno = ControllerAlunoDisciplina.BuscaAlunoNome(nome); /*buscar aluno da lista pelo nome*/
		 

			
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
	      
	      
	      aluno = ControllerAlunoDisciplina.BuscaAlunoNome(nome); /*metodo que busca um objeto pelo perametro nome*/
	      
	      if(aluno == null) {
	    	  
	    	  System.out.println("Aluno não Encontrado !");
	    	  
	    	  
	      }else {
	    	  
	    	  ControllerAlunoDisciplina.alunos.remove(aluno);
	    	  
	    	  System.out.println("Aluno EXCLUIDO !!!!");
	    	  
	        }   
	   }
	//------------------------------------------------------------------ 
	 
	  /* cadastrar disciplina*/ 
	  public static void cadastarDisciplina() {
		  int op=0,ops=0;
		 
		 do {
			 
		disciplina = new Disciplina();
		
		System.out.println(" Quer adicionar uma disciplina?");
		System.out.println(" 1 - sim | 2 - não");
		ops = scan.nextInt();
		
		  if(ops == 1) {
			
		  System.out.println("Qual o NOME da disciplina");
		  String nomeDisciplina = scan.next();
		  
		  disciplina.setNomeDisciplina(nomeDisciplina);
				  
		  ControllerAlunoDisciplina.disciplinasDisponiveis.add(disciplina); 
			
		  System.out.println("Disciplina ADICIONADA");
			
		  }else if(ops == 2){
		 	
			
			
			 break;
		   }
		
	
			 
		   }while(op == 0);
		    
	  }
	  
	  /*Listar Disciplina*/
	  public static void listarDisciplinas(List<Disciplina> disciplinas) {
		  
		  for (Disciplina disciplina : disciplinas) {
			  
			  System.out.println("NUMERO: "+(disciplinas.indexOf(disciplina)+1)+" | NOME: "+ disciplina.getNomeDisciplina());
			
		}
		    
	  }
	 
	  /*editar disciplina*/
	  public static void editarDisciplina() {
		  
		  String nome;
		  disciplina = new Disciplina();
		  
		  System.out.println("Qual nome da Disciplina?");
		  nome = scan.next();
		  
		  disciplina = ControllerAlunoDisciplina.BuscarDisciolina(nome);
		  
		  int index = ControllerAlunoDisciplina.disciplinasDisponiveis.indexOf(disciplina);
		  
		  System.out.println(" DISCIPLINA = 1- EXCLUIR | 2 -EDITAR");
		  int op = scan.nextInt();
		  
		  if(op ==1) {
			
			ControllerAlunoDisciplina.disciplinasDisponiveis.remove(disciplina);  /*excluir disciplina*/
			  
		  }else if(op == 2) {
			  
			  System.out.println("Qual o NOVO nome da DISCIPLINA");
			  ControllerAlunoDisciplina.disciplinasDisponiveis.get(index).setNomeDisciplina(scan.next()); /*alterar nome da disciplina*/
			   
		  }
		  
		  
		  
	  }
	
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
