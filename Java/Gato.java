public class Gato extends Animal{
	
	private int alturaPulo;
	private int tipoPelo;
	
	public Gato(String nome,int tipoPelo){
		super("mamifero",nome,13,4,true);
		this.tipoPelo = tipoPelo;
	}
	
	public void comunicar(){
		System.out.println("MIAU");
	}
	public void movimentar(){
		System.out.println("O gato comecou a se movimentar, pulando para todo lado e escalando arvores");
	}
	
	public void setAlturaPulo(int alturaPulo){
		this.alturaPulo = alturaPulo;
	}
	public int getAlturaPulo(){
		return this.alturaPulo;
	}
}
