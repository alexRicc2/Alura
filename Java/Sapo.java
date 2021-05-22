public class Sapo extends Animal{
	
	private boolean venenoso;
	
	public Sapo(String nome, boolean venenoso){
		super("Anfibio",nome,3,4,false);
		this.venenoso = venenoso;
	}
	
	public void comunicar(){
		System.out.println("CROAC CROAC, acho que eh esse o som do sapo kkkkkkk");
	}
	public void movimentar(){
		System.out.println("O sapo saiu pulando para todo lado");
		super.setFome(true);
	}
	
	public boolean getVenenoso(){
		return this.venenoso;
	}
	
	
}