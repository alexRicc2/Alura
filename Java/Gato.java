public class Gato extends Animal{
	
	private int alturaPulo;
	private int tipoPelo;
	
	public Gato(String nome,int tipoPelo){
		super("mamifero",nome,13,4,true);
		this.tipoPelo = tipoPelo;
	}
	
	public void miar(){
		System.out.println("Miau");
	}
	
	public void setAlturaPulo(int alturaPulo){
		this.alturaPulo = alturaPulo;
	}
	public int getAlturaPulo(){
		return this.alturaPulo;
	}
}
