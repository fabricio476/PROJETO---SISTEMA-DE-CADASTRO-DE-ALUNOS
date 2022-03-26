package projetojava.view;

import java.io.IOException;
import java.util.Scanner;

import projetojava.model.Aluno;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		/* instancia __ objeto aluno*/
		Aluno aluno = new Aluno();
		
		/*para entrada de dados do teclado no console*/
		Scanner scan = new Scanner(System.in);
		int opcao=0;
		
		/*tela inicial do console*/
		do {
			
			System.out.println("-------------------------------------------------");
			System.out.println("\t 1 - Cadastrar aluno");
			System.out.println("\t 2 - Alunos cadastrados");
			System.out.println("\t 3 - Apagar Aluno");
			System.out.println("\t 4 - Excluir Aluno");
			System.out.println("\t 5 - Editar Aluno");
			System.out.println("\t-------------------------");
            System.out.println("\t 6 - Cadastrar Disciplina");
			System.out.println("\t 7 - Excluir Disciplina");
			System.out.println("---------------------------------------------------");
			opcao = scan.nextInt();
			
			
			
		}while(opcao == 0 || opcao > 7);
		
		
		switch (opcao) {
		
		case 1:
			
			break;
			
        case 2:
			
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
		

	}
	
	

}
