import java.util.Scanner;
import java.util.ArrayList;

public class Passageiro extends Metodos {
	
	Scanner sc = new Scanner(System.in);
	
	private int PRG;
	private Data PDataNsc;
	private String PNome;
	private String PEndereco;
	private String PProfissao;
	private int PCod;
	private ArrayList<Rotas> passagens = new ArrayList<>();
	
	
	public void cadastra()
	{
		String nome, endereco, profissao;
		int ano,mes,dia, cod, rg;
		
		System.out.println("\n\nDigite o codigo do passageiro: ");
		cod = sc.nextInt();
		System.out.println("Digite o nome do passageiro: ");
		nome = sc.next();
		System.out.println("Digite o numero do RG: ");
		rg = sc.nextInt();
		System.out.println("Digite o endereco do passageiro: ");
		endereco = sc.next();
		System.out.println("Digite a profissao do passageiro: ");
		profissao = sc.next();
		System.out.println("Data de Nascimento");
		System.out.println("Ano: ");
		ano = sc.nextInt();
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("Dia: ");
		dia = sc.nextInt();
										
		Data data = new Data(dia,mes,ano);
		
		this.PRG = rg;
		this.PProfissao = profissao;
		this.PNome = nome;
		this.PEndereco = endereco;
		this.PCod = cod;
											
		System.out.println("O passageiro "+ getPNome() + " foi cadastrado com sucesso");
	}
	
	public int getPRG() {
		return PRG;
	}
	public void setPRG(int rG) {
		PRG = rG;
	}
	
	public Data getPDataNsc() {
		return PDataNsc;
	}
	public void setPDataNsc(Data dataNsc) {
		PDataNsc = dataNsc;
	}
	
	public String getPNome() {
		return PNome;
	}
	public void setPNome(String nome) {
		this.PNome = nome;
	}
	
	public String getPProfissao() {
		return PProfissao;
	}
	public void setPProfissao(String profissao) {
		this.PProfissao = profissao;
	}
	
	public String getPEndereco() {
		return PEndereco;
	}
	public void setPEndereco(String endereco) {
		this.PEndereco = endereco;
	}
	
	public int getPCod() {
		return PCod;
	}
	public void setPCod(int tipo) {
		this.PCod = tipo;
	}
	public void apresentaPassageiro() {
		int i;
		System.out.println("Passageiro " + this.getPNome() + " Possui "+ passagens.size() +" passagens");
		for(i=0;i<passagens.size();i++) {
			passagens.get(i).exibeRotas();
			
		}
		
	}
	public void setPassagens(Rotas passagem){
		this.passagens.add(passagem);
		System.out.println("Passagem para " + passagem.getRdestino()+ " comprada!");
	}
	
}