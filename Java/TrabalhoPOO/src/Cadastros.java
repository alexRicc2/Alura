import java.util.Scanner;

public class Cadastros {

	public static void main(String args[]) {
		
		int op = -1;
		Scanner sc = new Scanner(System.in);
		
		while(op != 0) {
		System.out.println("Sistema de cadastros");
		System.out.println("(1)Cadastrar um Passageiro");
		System.out.println("(2)Cadastrar uma Rota");
		System.out.println("(3)Cadastrar um Onibus");
		System.out.println("(4)Cadastrar um Motorista");
		System.out.println("(0)Sair do Sistema");
		System.out.println("Sua escolha: ");
		op = sc.nextInt();
		
		if(op == 1) {
			
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
			System.out.println("Hora: ");
			hora = sc.nextInt();
			System.out.println("Minuto: ");
			minuto = sc.nextInt();
			
			DataHora data1 = new DataHora(hora,minuto,ano,mes,dia);
			Motorista m1 = new Motorista(Cnh,data1,nome);
			
			System.out.println("O motorista "+ m1.getNome() + " Foi cadastrado com sucesso");
		}
		}
		}
	}
