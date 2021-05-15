import java.util.ArrayList;
import java.util.Scanner;

public class Livro{
	
	private int isbn;
	private String titulo;
	private String editora;
	private int anoPublicacao;
	private int numPags;
	
	ArrayList<String> autores = new ArrayList<>();
	
	public Livro(int isbn, String titulo, String editora, int ano, int paginas){
		this.isbn = isbn;
		this.titulo = titulo;
		this.editora = editora;
		this.anoPublicacao = ano;
		this.numPags = paginas;
	}
	
	public int getIsbn(){
		return this.isbn;
	}
	public void setIsbn(int isbn){
		this.isbn = isbn;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getEditora(){
		return this.editora;
	}
	public int getAnoPublicacao(){
		return this.anoPublicacao;
	}
	public void setAnoPublicacao(int ano){
		this.anoPublicacao = ano;
		
	}
	public int getNumPags(){
		return this.numPags;
	}
	
	public void setAutor(String autor){
		
		autores.add(autor);
	}
	public void getAutores(){
		
		System.out.println(autores);
	}
	
	public static void main(String args[]){
		
		ArrayList<Livro> biblioteca = new ArrayList<>();
		
		int op = 1;
		
		
		Scanner sc = new Scanner(System.in);
		
		while(op != 0){
			System.out.println("\n(1)Inserir novo livro na biblioteca");
			System.out.println("(2)Alterar titulo e ano de um livro");
			System.out.println("(3)Remover um livro");
			System.out.println("(4)Exibir biblioteca");
			
			op = sc.nextInt();
			
			
			if(op ==1){
				
				int isbn, ano, paginas, quant;
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
				
				System.out.println("Numero de paginas: ");
				paginas = sc.nextInt();
				
				Livro livro = new Livro(isbn, titulo, editora, ano, paginas);
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
					System.out.println("Titulo: " + biblioteca.get(i).getTitulo() + " Ano: " + biblioteca.get(i).getAnoPublicacao() + " Isbn: " + biblioteca.get(i).getIsbn());
				}
			}
		}
	}
}