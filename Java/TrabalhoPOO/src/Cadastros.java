import java.util.Scanner;
import java.util.ArrayList;

public class Cadastros {

	public static void main(String args[]) {
		
		int op = -1;
		Scanner sc = new Scanner(System.in);
		ArrayList<Passageiro> passageirosLista = new ArrayList<>();
		ArrayList<Rotas> rotasLista = new ArrayList<>();
		ArrayList<Onibus> onibusLista = new ArrayList<>();
		ArrayList<Motorista> motoristaLista = new ArrayList<>();
		
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
			System.out.println("Sua escolha: ");
			
			op = sc.nextInt();
			
			if(op == 1) {
				int cod,ci;
			
				
				ci = sc.nextInt();
				
				Rotas rota = new Rotas(ci,2);
				rota.mostraCidade(ci);
			}
			
		}
		if(op == 3) {
			String modelo,marca;
			int anoF;
			double kilometros;
			int i;
			
			System.out.println("(1)Cadastrar um Onibus");
			System.out.println("(2)Alterar um Onibus");
			System.out.println("(3)Excluir um Onibus");
			System.out.println("Sua escolha: ");
			
			op = sc.nextInt();
			
			if(op == 1) {
				
				if(motoristaLista.isEmpty()) {
					System.out.println("Sem motorista pre cadastrados");
				}
				else {
				
				System.out.println("Modelo do onibus: ");
				modelo = sc.next();
				
				System.out.println("Ano de fabricacao: ");
				anoF = sc.nextInt();
				
				System.out.println("Marca do Onibus: ");
				marca = sc.next();
				
				System.out.println("Kilometragem do Onibus: ");
				kilometros = sc.nextDouble();
				
				
				for(i=0;i<motoristaLista.size();i++) {
					System.out.println("Motorista " + i + " " + motoristaLista.get(i).getNome());
				}
				System.out.println("Numero do motorista para o Onibus: ");
				i = sc.nextInt();
				
				
				Onibus o1 = new Onibus(modelo,anoF,marca,kilometros,motoristaLista.get(i));
				onibusLista.add(o1);
				
				System.out.println("Onibus de modelo " + o1.getModelo()+ " Cadastrado!");
				
				}
			}
			else if(op == 3) {
				
				System.out.println("Excluindo um Onibus");
				for(i=0;i<onibusLista.size();i++) {
					System.out.println("Onibus " + i + " " + onibusLista.get(i).getModelo());
				}
				System.out.println("Numero do onibus para ser excluido: ");
				i = sc.nextInt();
				
				onibusLista.remove(i);
				
				System.out.println("Onibus removido");
				
				
				
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
			motoristaLista.add(m1);
			
			System.out.println("O motorista "+ m1.getNome() + " Foi cadastrado com sucesso");
			System.out.println("O motorista tem data de admissao em "+ m1.getDataAdimissao().getData());
		}
		}
		}
	}
