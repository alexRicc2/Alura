public class Caminhao implements Motor, Carroceria{
	
	private boolean motorLigado;
	private int rodas;
	private String modelo;
	private String marca;
	private String nome;
	private String cor;
	
	public Caminhao(String modelo, String marca, int Rodas, String nome){
		this.modelo = modelo;
		this.marca = marca;
		this.rodas = rodas;
		this.nome = nome;
	}
	
	
	public void LigaMotor(){
		if(!this.motorLigado){
			this.motorLigado = true;
			System.out.println("Motor de "+ this.getNome() + " foi ligado");
			}
		else{
			System.out.println("Motor de "+ this.getNome() + " ja estava  ligado");
		}
	}
	public void DesligaMotor(){
		if(this.motorLigado){
			this.motorLigado = false;
			System.out.println("Motor de "+ this.getNome() + " foi desligado");
		}
		else{System.out.println("Motor de "+ this.getNome() + " ja estava desligado");
		}
	}
	
	public void MudaCor(String cor){
		this.cor = cor;
		System.out.println("A cor do caminhao "+this.getNome()+ " foi mudada para "+ cor);
	}
	public void ajustaRetrovisor(){
		System.out.println("Retrovisores do caminhao "+this.getNome()+ " ajustados");
	}
	public String getNome(){
		return this.nome;
	}
}	