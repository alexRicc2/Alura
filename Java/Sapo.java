public class Sapo extends Animal{
	
	private boolean venenoso;
	
	public Sapo(String nome, boolean venenoso){
		super("Anfibio",nome,3,4,false);
		this.venenoso = venenoso;
	}
	
	public boolean getVenenoso(){
		return this.venenoso;
	}
	
	public void saltar(){
		System.out.println("O sapo pulou");
	}
	
}