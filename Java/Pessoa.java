public class Pessoa{
	
	private String nome;
	private int idade;
	private char sexo;
	private int faltas;
	
	public Pessoa(String nome, int idade, char sexo, int faltas){
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.faltas = faltas;
		}
	public String getNome(){
		return this.nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void atualizaFaltas(int faltas){
		if(faltas >= 0)this.faltas = faltas;
	}
	
	public void envelhece(){
		this.idade++;
	}
}