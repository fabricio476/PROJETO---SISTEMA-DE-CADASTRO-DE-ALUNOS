package projetojava.view;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projetojava.controller.ControllerAlunoDisciplina;
import projetojava.model.Aluno;

public class PrimeiraClasse {
	
	/*para entrada de dados do teclado no console*/
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		/* instancia __ objeto aluno*/
		Aluno aluno;
		
		
		
		int opcao=0;
		
		/*tela inicial do console*/
		do {
			
			System.out.println("-------------------------------------------------");
			System.out.println("\t 1 - Matricular Aluno");
			System.out.println("\t 2 - Lista Alunos Matriculados");
			System.out.println("\t 3 - Apagar Aluno");
			System.out.println("\t 4 - Editar Aluno");
			System.out.println("\t 5 - Buscar Aluno");
			System.out.println("\t-------------------------");
            System.out.println("\t 6 - Cadastrar Disciplina");
			System.out.println("\t 7 - Excluir Disciplina");
			System.out.println("---------------------------------------------------");
			opcao = scan.nextInt();
			
			/*opçoes do menu*/
			switch (opcao) {
			
			case 1:
				aluno = new Aluno();
				
				cadastrarAluno(aluno);
				
				
				opcao = 0;
				break;
				
	        case 2:
	        	
	        	listarAlunos();
				
				break;
				
	        case 3:
		
		       break;
		
	        case 4:
		
		       break;
		       
	        case 5:
	        	
	 	       break;  
	 	       
	        case 6:
	        	
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
		aluno.setIdade(scan.nextInt());
	
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
	

}
