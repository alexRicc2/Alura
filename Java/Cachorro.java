public class Cachorro extends Animal{
	
	private int raca; //raça
	
	public Cachorro(String nome,int raca){
		super("mamifero",nome,16,4,true);
		this.raca = raca;
	}
	
	public void latir(){
		System.out.println("AUAU");
	}
	
	public int getRaca(){
		return this.raca;
	}
}