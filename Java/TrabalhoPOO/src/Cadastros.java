import java.util.Scanner;

public class Cadastros {

	public static void main(String args[]) {
		
		int op = -1;
		Scanner sc = new Scanner(System.in);
		
		while(op != 0) {
		System.out.println("Sistema de cadastros");
		System.out.println("(1)Passageiro");
		System.out.println("(2)Rota");
		System.out.println("(3)Cadastrar um Onibus");
		System.out.println("(4)Cadastrar um Motorista");
		System.out.println("(0)Sair do Sistema");
		System.out.println("Sua escolha: ");
		op = sc.nextInt();
		
		
		if(op == 2) {
			
			System.out.println("(1)Cadastrar um rota");
			System.out.println("(2)Alterar um rota");
			System.out.println("(3)Excluir um rota");
			
			op = sc.nextInt();
			
			if(op == 1) {
				int cod,ci;
			
				
				ci = sc.nextInt();
				
				Rotas rota = new Rotas(ci,2);
				rota.mostraCidade(ci);
			}
			
		}
		
		if(op == 4) {
			
			System.out.println("(1)Cadastrar um motorista");
			
			String nome;
			double Cnh;
			int ano,mes,dia,hora,minuto;
			
			System.out.println("Digite o nome do motorista: ");
			nome = sc.next();
			System.out.println("Digite o numero da CNH: ");
			Cnh = sc.nextDouble();
			System.out.println("DATA DE ADIMISSAO");
			System.out.println("Ano: ");
			ano = sc.nextInt();
			System.out.println("Mes: ");
			mes = sc.nextInt();
			System.out.println("Dia: ");
			dia = sc.nextInt();
			
			
			Data data1 = new Data(dia,mes,ano);
			Motorista m1 = new Motorista(Cnh,data1,nome);
			
			System.out.println("O motorista "+ m1.getNome() + " Foi cadastrado com sucesso");
			System.out.println("O motorista tem data de admissao em "+ m1.getDataAdimissao().getData());
		}
		}
		}
	}
