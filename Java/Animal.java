public abstract class Animal{
	
	private String tipo;
	private String nome;
	private int lifeTime;
	private int quantPatas;
	private boolean domestico;
	private boolean fome;
	
	public Animal(String tipo, String nome, int lifeTime, int quantPatas, boolean domestico){
		this.tipo = tipo;
		this.nome = nome;
		this.lifeTime = lifeTime;
		this.quantPatas = quantPatas;
		this.domestico = domestico;
	}
	
	public abstract void comunicar();
	public abstract void movimentar();
	
	public void alimenta(){
		this.fome = false;
	}
	public String getNome(){
		return this.nome;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	public int getLifeTime(){
		return this.lifeTime;
	}
	public int getQuantPatas(){
		return this.quantPatas;
	}
	public boolean getDomestico(){
		return this.domestico;
	}
	public void setFome(boolean fome){
		this.fome = fome;
	}
}