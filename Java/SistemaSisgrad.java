import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class SistemaSisgrad{
	
	

	public static void main(String args[]){
		
		ArrayList<Professor> corpoDocente = new ArrayList<>();
		ArrayList<Aluno> turma = new ArrayList<>();
		
		int op=1;
		Scanner sc = new Scanner(System.in);
		
		try {
			FileReader arq = new FileReader("alunos.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			
			while(lerArq.ready()) {
				String linha = lerArq.readLine();
				Aluno aluno = new Aluno(linha);
				turma.add(aluno);
				
			}
			FileReader arq2 = new FileReader("professores.txt");
			BufferedReader lerArq2 = new BufferedReader(arq2);
			
			while(lerArq2.ready()) {
				String linha = lerArq2.readLine();
				Professor professor = new Professor(linha);
				corpoDocente.add(professor);
				
			}
		}
		catch (IOException e) {
			System.out.println("Erro\n");
		}
		
		
		while(op != 7){
			
			System.out.println("\nSistema sisgrad");
			System.out.println("(1) Inserir Aluno");
			System.out.println("(2) Inserir Professor");
			System.out.println("(3) Remover Aluno");
			System.out.println("(4) Remover professor");
			System.out.println("(5) Printar lista de alunos");
			System.out.println("(6) Printar lista de professores");
			System.out.println("(7) Salvar e sair");
			
			
			
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
			else if(op == 7) {
				
				try {
					String nome_arquivo = "alunos.txt";
					String nome_arquivo2 = "professores.txt";
					File arq = new File(nome_arquivo);
					File arq2 = new File(nome_arquivo2);
					FileWriter escritorAluno = new FileWriter(arq, false);
					FileWriter escritorProfessor = new FileWriter(arq2,false);
					
					for(int i=0; i < corpoDocente.size(); i++) {
						escritorProfessor.write(corpoDocente.get(i).getNome() + "\n");
					}
					for(int i=0; i < turma.size(); i++) {
						escritorAluno.write(turma.get(i).getNome() + "\n");
					}
					escritorProfessor.close();
					escritorAluno.close();
				}
				catch (IOException e) {
					System.out.println("Erro\n");
				}
			}
			
		}
		
		
	}
}