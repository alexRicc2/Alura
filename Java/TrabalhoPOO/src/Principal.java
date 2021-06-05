import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

public static void main(String args[]) {
		
		//Cadastros sistemaC = new Cadastros();
		
		
		int op = -1,decisao = -1, opSistemas = -1,i;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Passageiro> passageirosLista = new ArrayList<>();
		ArrayList<Rotas> rotasLista = new ArrayList<>();
		ArrayList<Onibus> onibusLista = new ArrayList<>();
		ArrayList<Motorista> motoristaLista = new ArrayList<>();
		
		while(opSistemas != 0) {
		
			System.out.println("\n1 - Sistema de Cadastros");
			System.out.println("2 - Mostrar cadastros");
			System.out.println("3 - Comprar Passagens");
			System.out.println("Sua escolha: ");
			opSistemas = sc.nextInt();
			
			if(opSistemas == 1) {
				
				while(op != 0) {
					System.out.println("\nSistema de cadastros");
					System.out.println("(1)Passageiro");
					System.out.println("(2)Rota");
					System.out.println("(3)Cadastrar um Onibus");
					System.out.println("(4)Cadastrar um Motorista");
					System.out.println("(0)Sair do Sistema de cadastros");
					System.out.println("Sua escolha: ");
					op = sc.nextInt();
					
					
					if(op == 1){ //cadastro de Passageiros
						
						System.out.println("\n(1)Cadastrar um Passageiro");
						System.out.println("(2)Alterar um Passageiro");
						System.out.println("(3)Excluir um Passageiro");
						System.out.println("Sua escolha: ");
						decisao = sc.nextInt();
						
						if(decisao == 1) {
							Passageiro p1 = new Passageiro();
							p1.cadastra();
							passageirosLista.add(p1);
						}
						else if(decisao == 3) {
							System.out.println("Ha "+ passageirosLista.size() +" passageiros cadastrados");
							for(i=0;i<passageirosLista.size();i++) {
								System.out.println(i+": ");
								passageirosLista.get(i).apresentaPassageiro();
								
							}
							System.out.println("Numero do passageiro a ser excluido");
							i = sc.nextInt();
							
							passageirosLista.remove(i);
						}
					}
					
					if(op == 2){ //cadastro de ROTAS, necessario um onibus
						
						if(onibusLista.isEmpty()) {
								System.out.println("Sem onibus pre cadastrados");
							}
						else{
							Rotas r1 = new Rotas();
							
							r1.cadastra();
							System.out.println("Onibus disponiveis para esta rota: ");
							
							for(i=0;i<onibusLista.size();i++) {
									System.out.println("Onibus indice[" + i + "] " + onibusLista.get(i).getModelo());
								}
							System.out.println("\nNumero do onibus para a rota: ");
							i = sc.nextInt();
							
							r1.setOnibus(onibusLista.get(i));
							
							rotasLista.add(r1);
							
							System.out.println("Cadastro da rota para "+ r1.getRdestino() +" foi cadastrada com sucesso!");
								
							
						}
					}
					
					if(op == 3) { // cadastro de onibus, necessario um motorista
					
						
						System.out.println("\n(1)Cadastrar um Onibus");
						System.out.println("(2)Alterar um Onibus");
						System.out.println("(3)Excluir um Onibus");
						System.out.println("Sua escolha: ");
						
						decisao = sc.nextInt();
						
						if(decisao == 1) { //cadastra onibus
							
							
							if(motoristaLista.isEmpty()) {
								System.out.println("Sem motorista pre cadastrados");
							}
							else {
								Onibus o1 = new Onibus();
								o1.cadastra();
								
								System.out.println("Motoristas disponiveis para este onibus: ");
								
								for(i=0;i<motoristaLista.size();i++) {
									System.out.println("Motorista indice[" + i + "] " + motoristaLista.get(i).getNome());
								}
								System.out.println("\nNumero do motorista para o Onibus: ");
								i = sc.nextInt();
								o1.setMotorista(motoristaLista.get(i));
								onibusLista.add(o1);
								
								System.out.println("Onibus de modelo: "+ o1.getModelo()+ "foi cadastrado com sucesso!");
								
							}
						}
						if(decisao == 2) {
							for(i=0;i<onibusLista.size();i++) {
								System.out.println("onibus indice[" + i + "] " + onibusLista.get(i).getModelo());
							}
							System.out.println("Numero do Onibus a ser alterado: ");
							i = sc.nextInt();
							
						}
						else if(decisao == 3) { //deleta onibus
							
							System.out.println("Excluindo um Onibus");
							for(i=0;i<onibusLista.size();i++) {
								System.out.println("Onibus " + i + " " + onibusLista.get(i).getModelo());
							}
							System.out.println("\nNumero do onibus para ser excluido: ");
							i = sc.nextInt();
							
							onibusLista.remove(i);
							
							System.out.println("Onibus removido");
								
						}
					}
					
					if(op == 4) { //cadastra motorista
						
						Motorista m1 = new Motorista();
						m1.cadastra();
						
						motoristaLista.add(m1);
					}
					
					}
				}
			if(opSistemas == 2) {
				System.out.println("\n1- Lista de passageiros");
				System.out.println("2- Lista de rotas");
				System.out.println("3- Lista de onibus");
				System.out.println("4- Lista de motorista");
				System.out.println("Sua escolha: ");
				op = sc.nextInt();
				
				
				if(op == 1) {
					System.out.println("Ha "+ passageirosLista.size() +" passageiros cadastrados");
					for(i=0;i<passageirosLista.size();i++) {
						passageirosLista.get(i).apresentaPassageiro();
					
					}
				}
				
				if(op == 2) {
					System.out.println("Ha "+ rotasLista.size() +" rotas cadastrados");
					for(i=0;i<rotasLista.size();i++) {
						System.out.println(i+1);
						rotasLista.get(i).exibeRotas();
					}
				}
				
				if(op == 3) {
				
					System.out.println("Ha "+ onibusLista.size() +" onibus cadastrados");
					for(i=0;i<onibusLista.size();i++) {
						System.out.println(i+1 + "- "+ onibusLista.get(i).getModelo());
						onibusLista.get(i).exibirAssentos();
					}
				}
				
				if(op == 4) {
					
					System.out.println("Ha "+ motoristaLista.size() +" motoristas cadastrados");
					for(i=0;i<motoristaLista.size();i++) {
						System.out.println(i+1 + "- "+ motoristaLista.get(i).getNome());
					}
				}
			}
			
			if(opSistemas == 3){ //Compra passagens
				
				int posPassageiro,posRota,j,x,y;
				
				System.out.println("Escolha o passageiro que ira comprar a passagem");
				for(i=0;i<passageirosLista.size();i++){
					System.out.println(i + " - " + passageirosLista.get(i).getPNome());	
				}
				
				System.out.println("Digite a posicao do passageiro desejado: ");
				
				posPassageiro = sc.nextInt();
				
				System.out.println("Escolha a rota que ira comprar");
				
				for(j=0;j<rotasLista.size();j++){
					System.out.println("Rota "+j);
					rotasLista.get(j).exibeRotas();
				}
				posRota = sc.nextInt();
				
				System.out.println("Escolha seu assento no onibus");
				rotasLista.get(posRota).getOnibus().exibirAssentos();
				System.out.println("Digite as coordenadas do assento Ex.: 7 2: "); //-> Exemplo: 0 1, 2 0, 3 2, ...
				x = sc.nextInt();
				y = sc.nextInt();
				
				rotasLista.get(posRota).getOnibus().setAssentos(x,y); //marca que ocupou o assento
				
				
				passageirosLista.get(posPassageiro).setPassagens(rotasLista.get(posRota)); //adiciona a rota na lista de passagens do passageiro
				
				
				
				
			
			}
	}
}
}
