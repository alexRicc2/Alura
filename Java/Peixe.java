public class Peixe extends Animal{
	
	public Peixe(String nome, String tipo, int lifetime){
		super(tipo,nome,lifetime,0,false);
	}
	
	public void comunicar(){
		System.out.println("GLOB GLOB");
	}
	public void movimentar(){
		System.out.println("O peixe saiu nadando mar a fora");
	}
	
}