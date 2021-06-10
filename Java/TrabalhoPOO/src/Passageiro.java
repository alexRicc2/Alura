import java.util.Scanner;
import java.util.ArrayList;

public class Passageiro extends Metodos{
	
	Scanner sc = new Scanner(System.in);
	
	private int pRG;
	private Data pDataNsc;
	private String pNome;
	private String pEndereco;
	private String pProfissao;
	private int pCod;
	private ArrayList<Rotas> passagens = new ArrayList<>();
	
	
	public void cadastra()
	{
		String nome, endereco, profissao;
		int cod, rg;
		
		System.out.println("(1)Cadastrar um passageiro");
		
		System.out.println("\n\nDigite o codigo do passageiro: ");
		cod = sc.nextInt();
		this.setPCod(cod);
		
		System.out.println("Digite o nome do passageiro: ");
		nome = sc.nextLine();
		this.setPNome(nome);
		
		System.out.println("Digite o numero do RG: ");
		rg = sc.nextInt();
		this.setPRG(rg);
		
		System.out.println("Digite o endereco do passageiro: ");
		endereco = sc.nextLine();
		this.setPEndereco(endereco);
		
		System.out.println("Digite a profissao do passageiro: ");
		profissao = sc.nextLine();
		this.setPProfissao(profissao);
		
		System.out.println("Data de Nascimento");
		System.out.print("Digite a data no formato dd mm aaaa: ");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
										
		Data data = new Data(dia,mes,ano);
		this.setPDataNsc(data);
											
		System.out.println("O passageiro "+ getPNome() + " foi cadastrado com sucesso");
	}
	
	public void alterar()
	{
		int op;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("(2)Alterar um passageiro");
			System.out.println("\n1- Nome");
			System.out.println("2- Endereco");
			System.out.println("3- Profissao");
			System.out.println("Digite a opcao que deseja alterar: ");
			op = sc.nextInt();
		}while(op < 1 || op > 3);
		
		if(op == 1)
		{
			String nome;
			System.out.println("Digite o nome do passageiro: ");
			nome = sc.nextLine();
			this.setPNome(nome);
		}
		
		else if(op == 2)
		{
			String endereco;
			System.out.println("Digite o endereco do passageiro: ");
			endereco = sc.nextLine();
			this.setPEndereco(endereco);
		}
		
		else
		{
			String profissao;
			System.out.println("Digite a profissao do passageiro: ");
			profissao = sc.nextLine();
			this.setPProfissao(profissao);
		}
		
		System.out.println("Alteracao salva com sucesso!");
	}
	
	public int getPRG() {
		return pRG;
	}
	public void setPRG(int rG) {
		if(rg > 0)
			this.pRG = rG;
		else
			System.out.println("RG Invalido!");
	}
	
	public Data getPDataNsc() {
		return pDataNsc;
	}
	public void setPDataNsc(Data dataNsc) {
		this.pDataNsc = dataNsc;
	}
	
	public String getPNome() {
		return pNome;
	}
	public void setPNome(String nome) {
		if(nome != "")
			this.pNome = nome;
		else
			System.out.println("Nome invalido!");
	}
	
	public String getPProfissao() {
		return pProfissao;
	}
	public void setPProfissao(String profissao) {
		if(profissao != "")
			this.pProfissao = profissao;
		else
			System.out.println("Profissao invalida!");
	}
	
	public String getPEndereco() {
		return pEndereco;
	}
	public void setPEndereco(String endereco) {
		if(endereco != "")
			this.pEndereco = endereco;
		else
			System.out.println("Endereco invalido!");
	}
	
	public int getPCod() {
		return pCod;
	}
	public void setPCod(int tipo) {
		if(tipo >= 0)
			this.pCod = tipo;
		else
			System.out.println("Codigo invalido!");
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