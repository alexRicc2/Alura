import java.util.Scanner;

public class Motorista extends Metodos {
	
	private int mCnh; 
	private Data mDataAdimissao;
	private String mNome;
	
	public void cadastra(){
		
			String nome;
			int cnh;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nDigite o nome do motorista: ");
			nome = sc.next();
			this.setNome(nome);
			
			System.out.println("Digite o numero da CNH: ");
			cnh = sc.nextInt();
			this.setCnh(cnh);
			
			System.out.print("Digite a data de admissao no formato dd mm aaaa: ");
			int dia = sc.nextInt();
			int mes = sc.nextInt();
			int ano = sc.nextInt();
			
			Data data1 = new Data(dia,mes,ano);
			this.setDataAdimissao(data1);
			
			System.out.println("\nO(a) motorista "+ this.getNome() + " foi cadastrado(a) com sucesso!");
			System.out.println("O(a) motorista tem data de admissao em "+ this.getDataAdimissao().getData());
	}
	
	public void alterar()
	{
		int op;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("\n1- CNH");
			System.out.println("2- Nome");
			System.out.println("Digite a opcao que deseja alterar: ");
			op = sc.nextInt();
		}while(op < 1 || op > 2);
		
		if(op == 1)
		{
			int cnh;
			System.out.println("Digite o numero da CNH: ");
			cnh = sc.nextInt();
			this.setCnh(cnh);
		}
		
		else
		{
			String nome;
			System.out.println("Digite o nome: ");
			nome = sc.next();
			this.setNome(nome);
		}
		
		System.out.println("Alteracao salva com sucesso!");
	}
	
	public int getCnh() {
		return mCnh;
	}
	public void setCnh(int cnh) {
		if(cnh > 0)
			this.mCnh = cnh;
		else
			System.out.println("Numero da CNH invalido!");
	}
	public Data getDataAdimissao() {
		return mDataAdimissao;
	}
	public void setDataAdimissao(Data dataAdimissao) {
		this.mDataAdimissao = dataAdimissao;
	}
	public String getNome() {
		return mNome;
	}
	public void setNome(String nome) {
		if(nome != "")
			this.mNome = nome;
		else
			System.out.println("Nome invalido!");
	}
	
}