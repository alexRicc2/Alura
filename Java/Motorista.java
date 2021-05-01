public class Motorista{
	
	private String nome;
	private long CNH;
	private String cidadeNatal;
	private String tipoCarta;
	private int validade;
	private boolean carteiraDefinitiva;
	
	//Sobrecarga de construtores
	public Motorista(String nome, long CNH, String cidadeNatal, String tipoCarta, int validade, boolean carteiraDefinitiva){
		this.nome = nome;
		this.CNH = CNH;
		this.cidadeNatal = cidadeNatal;
		this.tipoCarta = tipoCarta;
		this.validade = validade;
		this.carteiraDefinitiva = carteiraDefinitiva;
	}
	public Motorista(String nome){
		this(nome, 0, "", "", 0, false);
	}
	public Motorista(long CNH){
		this("", CNH, "", "", 0, false);
	}
	public Motorista(String nome, long CNH){
		this(nome, CNH, "", "", 0, false);
	}
	public Motorista(String nome, long CNH,String tipoCarta){
		this(nome, CNH, "", tipoCarta, 0, false);
	}
	public Motorista(String nome, long CNH, String tipoCarta, boolean carteiraDefinitiva){
		this(nome, CNH, "", tipoCarta, 0, carteiraDefinitiva);
	}
	public Motorista(String nome, long CNH, String tipoCarta, int validade, boolean carteiraDefinitiva){
		this(nome, CNH, "", tipoCarta, validade, carteiraDefinitiva);
	}
	
	//metodos set
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCNH(long CNH){
		this.CNH = CNH;
	}
	public void setCidadeNatal(String cidadeNatal){
		this.cidadeNatal = cidadeNatal;
	}
	public void setTipoCarta(String tipoCarta){
		this.tipoCarta = tipoCarta;
	}
	public void setValidade(int validade){
		this.validade = validade;
	}
	public void setCarteiraDefinitiva(boolean carteiraDefinitiva){
		this.carteiraDefinitiva = carteiraDefinitiva;
	}
	
	//Sobrecarga de metodos
	public void setDados(String nome, long CNH, int validade, boolean carteiraDefinitiva){
		this.setNome(nome);
		this.setCNH(CNH);
		this.setValidade(validade);
		this.setCarteiraDefinitiva(carteiraDefinitiva);
	}
	public void setDados(String nome, long CNH, String cidadeNatal, String tipoCarta, int validade, boolean carteiraDefinitiva){
		this.setNome(nome);
		this.setCNH(CNH);
		this.setCidadeNatal(cidadeNatal);
		this.setTipoCarta(tipoCarta);
		this.setValidade(validade);
		this.setCarteiraDefinitiva(carteiraDefinitiva);
	}
	
	
	public static void main(String args[]){
		
		Motorista alex = new Motorista("Alex", 93892834540l);
		
		System.out.println("dono da carteira: " + alex.nome + "\nCNH: " + alex.CNH + "\ntipo da carta: " + alex.tipoCarta 
		+ "\nCarteira definitiva: "+ alex.carteiraDefinitiva);
		
		alex.setDados("Alex Ricardo", 93892834540l, 2023, true);
		
		System.out.println("\ndono da carteira: " + alex.nome + "\nCNH: " + alex.CNH + "\ntipo da carta: " + alex.tipoCarta 
		+ "\nCarteira definitiva: "+ alex.carteiraDefinitiva);
	}
	
}