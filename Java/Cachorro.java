public class Cachorro extends Animal{
	
	private int raca; //raça
	
	public Cachorro(String nome,int raca){
		super("mamifero",nome,16,4,true);
		this.raca = raca;
	}
	
	public void comunicar(){
		System.out.println("AUAU");
	}
	public void movimentar(){
		System.out.println("O cachorro esta se movimentando e ficou com fome");
		super.setFome(true);
	}
	
	
	public int getRaca(){
		return this.raca;
	}
}