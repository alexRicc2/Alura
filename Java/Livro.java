import java.util.ArrayList;

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
	public Livro(String titulo, String editora, int isbn, int anoPublicacao) {
		this.editora = editora;
		this.titulo = titulo;
		this.isbn = isbn;
		this.anoPublicacao = anoPublicacao;
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
	public String getAutor(int indice) {
		return autores.get(indice);
	}
	public int getNumAutores() {
		return autores.size();
	}
	
	
}