import java.util.ArrayList;
import java.util.Scanner;

public class SistemaSisgrad{
	
	

	public static void main(String args[]){
		
		ArrayList<Professor> corpoDocente = new ArrayList<>();
		ArrayList<Aluno> turma = new ArrayList<>();
		
		int op=1;
		Scanner sc = new Scanner(System.in);
		
		while(op != 0){
			
			System.out.println("\nSistema sisgrad");
			System.out.println("(1) Inserir Aluno");
			System.out.println("(2) Inserir Professor");
			System.out.println("(3) Remover Aluno");
			System.out.println("(4) Remover professor");
			System.out.println("(5) Printar lista de alunos");
			System.out.println("(6) Printar lista de professores");
			
			
			
			op = sc.nextInt();
			
			if(op == 1){
				
				String nome;
				System.out.println("Digite o nome do aluno: ");
				
				nome = sc.next();
				
				Aluno aluno = new Aluno(nome);
				turma.add(aluno);
			}
			else if(op == 2){
				String nome;
				System.out.println("Digite o nome do Professor: ");
				
				nome = sc.next();
				
				Professor professor = new Professor(nome);
				corpoDocente.add(professor);
			}
			else if(op == 3){
				
				int pos;
				System.out.println("Digite a posicao do aluno a ser retirado: ");
				
				pos = sc.nextInt();
				turma.remove(pos);
			}
			else if(op == 4){
				
				int pos;
				System.out.println("Digite a posicao do professor a ser retirado: ");
				
				pos = sc.nextInt();
				corpoDocente.remove(pos);
			}
			else if(op == 5){
				for(int i = 0 ; i< turma.size(); i++){
					System.out.println(turma.get(i).getNome());
				}
			}
			else if(op == 6){
				for(int i=0; i < corpoDocente.size(); i++){
					System.out.println(corpoDocente.get(i).getNome());
				}
			}
			
		}
		
		
	}
}