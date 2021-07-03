import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{

	public static void main(String args[]){
		
		ArrayList<Livro> biblioteca = new ArrayList<>();
		
		int op = 1;
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			FileReader arq = new FileReader("biblioteca.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			
			while(lerArq.ready()) {
				String linha = lerArq.readLine();
				String[] linhaSeparada = linha.split(";");
				String titulo = linhaSeparada[0];
				String editora = linhaSeparada[1];
				int isbn = Integer.parseInt(linhaSeparada[2]);
				int anoPublicacao = Integer.parseInt(linhaSeparada[3]);
				String[] autores = linhaSeparada[4].split(" "); 
				
				Livro livro = new Livro(titulo, editora, isbn, anoPublicacao);
				biblioteca.add(livro);
				for(int i=0;i < autores.length; i++) {
					livro.setAutor(autores[i]);
				}
				
				
			}
		}
		catch(IOException e) {
			System.out.println("Erro\n");
		}
		
		while(op != 5){
			System.out.println("\n(1)Inserir novo livro na biblioteca");
			System.out.println("(2)Alterar titulo e ano de um livro");
			System.out.println("(3)Remover um livro");
			System.out.println("(4)Exibir biblioteca");
			System.out.println("(5)Salvar e sair");
			
			op = sc.nextInt();
			
			
			if(op ==1){
				
				int isbn, ano, quant;
				String titulo, editora;
					
				System.out.println("Editora (palavra unica): ");
				editora = sc.next(); //nextline estava bugando, e n sei usar limpador de buffer em java ainda
										//acredito que esse seja o problema
				System.out.println("Titulo (palavra unica): ");
				titulo = sc.next();
				
				System.out.println("Numero de isbn do novo livro: ");
				isbn = sc.nextInt();
				
				System.out.println("Ano de publicacao: ");
				ano = sc.nextInt();
				
				Livro livro = new Livro(titulo, editora, isbn, ano);
				biblioteca.add(livro);
				
				System.out.println("Quantidade de autores");
				quant = sc.nextInt();
				
				for(int i=0; i< quant; i++){
					
					String autor;
					
					System.out.println("Nome do autor " + i);
					autor = sc.next();
					
					livro.setAutor(autor);
				}
				
			}
			
			else if(op == 2){
				System.out.println("Isbn do livro a ser alterado: ");
				int isbn;
				
				isbn = sc.nextInt();
				for(int i=0;i<biblioteca.size();i++){
					if(isbn == biblioteca.get(i).getIsbn()){
						String novoNome;
						int novoAno;
						
						System.out.println("Novo titulo: ");
						novoNome = sc.next();
						
						System.out.println("Novo ano de publicacao: ");
						novoAno = sc.nextInt();
						
						biblioteca.get(i).setTitulo(novoNome);
						biblioteca.get(i).setAnoPublicacao(novoAno);
						
					}
				}
				
			}
			
			else if(op == 3){
				
				int pos;
				System.out.println("Digite a posicao do livro a ser removido");
				pos = sc.nextInt();
				
				biblioteca.remove(pos);
			}
			
			else if(op == 4){
				for(int i=0;i<biblioteca.size();i++){
					System.out.println("\nTitulo: " + biblioteca.get(i).getTitulo() + "\nAno: " + biblioteca.get(i).getAnoPublicacao() + "\nIsbn: " + biblioteca.get(i).getIsbn());
					System.out.print("Autores: ");
					for(int j=0;j<biblioteca.get(i).getNumAutores();j++) {
						System.out.print(biblioteca.get(i).getAutor(j)+ " ");
					}
					System.out.println();
				}
			}
			else if(op == 5) {
				
				try {
					String nome_arquivo = "biblioteca.txt";
					File arq = new File(nome_arquivo);
					FileWriter escritorLivro = new FileWriter(arq, false);
					
					for(int i=0;i<biblioteca.size();i++) {
						escritorLivro.write(biblioteca.get(i).getTitulo()+";"+
					biblioteca.get(i).getEditora()+";"+biblioteca.get(i).getIsbn()+";"+
					biblioteca.get(i).getAnoPublicacao()+";");
						for(int j=0; j<biblioteca.get(i).getNumAutores();j++) {
							escritorLivro.write(biblioteca.get(i).getAutor(j)+" ");
						}
						escritorLivro.write("\n");
					}
					escritorLivro.close();
				
				}
				catch(IOException e){
					System.out.println("Erro\n");
				}
			}
		}
	}
}
