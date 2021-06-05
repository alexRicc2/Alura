import java.util.Scanner;

public class Motorista {
	
	private double Cnh;
	private Data dataAdimissao;
	private String Nome;
	
	public void cadastra(){
		
			String nome;
			double Cnh;
			int ano,mes,dia,hora,minuto;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o nome do motorista: ");
			nome = sc.next();
			this.setNome(nome);
			
			System.out.println("Digite o numero da CNH: ");
			Cnh = sc.nextDouble();
			this.setCnh(Cnh);
			
			System.out.println("DATA DE ADIMISSAO");
			System.out.println("Ano: ");
			ano = sc.nextInt();
			System.out.println("Mes: ");
			mes = sc.nextInt();
			System.out.println("Dia: ");
			dia = sc.nextInt();
			
			
			Data data1 = new Data(dia,mes,ano);
			this.setDataAdimissao(data1);
			
			System.out.println("O motorista "+ this.getNome() + " Foi cadastrado com sucesso");
			System.out.println("O motorista tem data de admissao em "+ this.getDataAdimissao().getData());
	}
	
	public double getCnh() {
		return Cnh;
	}
	public void setCnh(double cnh) {
		Cnh = cnh;
	}
	public Data getDataAdimissao() {
		return dataAdimissao;
	}
	public void setDataAdimissao(Data dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	
}
