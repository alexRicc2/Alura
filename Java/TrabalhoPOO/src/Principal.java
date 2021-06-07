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
					
					
					if(op == 1){ //Menu Paasageiro
						
						System.out.println("\n(1)Cadastrar um Passageiro");
						System.out.println("(2)Alterar um Passageiro");
						System.out.println("(3)Excluir um Passageiro");
						System.out.println("Sua escolha: ");
						decisao = sc.nextInt();
						
						if(decisao == 1) { //Cadastra Passageiro
							Passageiro p1 = new Passageiro();
							p1.cadastra();
							passageirosLista.add(p1);
						}
						else if(decisao == 3) { //Deleta Passsageiro
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
					
					if(op == 2){ //Menu Rotas, necessario pelo menos um onibus
						
						
						System.out.println("\n(1)Cadastrar uma Rota");
						System.out.println("(2)Alterar uma Rota");
						System.out.println("(3)Excluir uma Rota");
						System.out.println("Sua escolha: ");
						decisao = sc.nextInt();
						
						if(decisao == 1){ //Cadastra uma Rota
							if(onibusLista.isEmpty()) {
									System.out.println("Sem onibus pre cadastrados");
								}
							else{
								Rotas r1 = new Rotas();
								
								r1.cadastra();
								System.out.println("Onibus disponiveis para esta rota: ");
								
								for(i=0;i<onibusLista.size();i++) {
										if(onibusLista.get(i).getTemRota() == false)System.out.println("Onibus indice[" + i + "] " + onibusLista.get(i).getModelo());
										
									
								}
								System.out.println("\nNumero do onibus para a rota: ");
								i = sc.nextInt();
								
								onibusLista.get(i).setTemRota();
								//System.out.println("valor do temRota : "+ onibusLista.get(i).getTemRota());
								r1.setOnibus(onibusLista.get(i));
								
								rotasLista.add(r1);
								
								System.out.println("Cadastro da rota para "+ r1.getRdestino() +" foi cadastrada com sucesso!");
									
								
							}
						if(decisao == 2); //Altera uma rota
						if(decisao == 3){ //Deleta uma Rota 
							
							System.out.println("Ha "+ rotasLista.size() +" rotas cadastradas");
							for(i=0;i<rotasLista.size();i++) {
								System.out.println(i+": ");
								rotasLista.get(i).exibeRotas();
								
							}
							System.out.println("Numero da rota a ser excluida");
							i = sc.nextInt();
							
							rotasLista.remove(i);
							
						}
						}
					}
					
					if(op == 3) { // Menu Onibus, necessario pelo menos um motorista
					
						
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
						if(decisao == 2) { // altera Onibus
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
					
					if(op == 4) { //Menu motorista
						
						System.out.println("\n(1)Cadastrar um Motorista");
						System.out.println("(2)Alterar um Motorista");
						System.out.println("(3)Excluir um Motorista");
						System.out.println("Sua escolha: ");
						
						decisao = sc.nextInt();
						
						if(decisao == 1){
						
						Motorista m1 = new Motorista();
						m1.cadastra();
						
						motoristaLista.add(m1);
						}
						if(decisao == 2); //Altera Motorista
						if(decisao == 3){ //Deleta Motorista
							
							System.out.println("Ha "+ motoristaLista.size() +" motoristas cadastrados");
							for(i=0;i<rotasLista.size();i++) {
								System.out.println(i+": ");
								motoristaLista.get(i).getNome();
							}
							System.out.println("Numero do motorista a ser excluido");
							i = sc.nextInt();
							
							motoristaLista.remove(i);
						}
					}
					
					}
				}
			if(opSistemas == 2) { //Sistema mostra Cadastrados
				System.out.println("\n1- Lista de passageiros");
				System.out.println("2- Lista de rotas");
				System.out.println("3- Lista de onibus");
				System.out.println("4- Lista de motorista");
				System.out.println("Sua escolha: ");
				op = sc.nextInt();
				
				
				if(op == 1) { //Mostra Passageiros Cadastrados
					System.out.println("Ha "+ passageirosLista.size() +" passageiros cadastrados");
					for(i=0;i<passageirosLista.size();i++) {
						passageirosLista.get(i).apresentaPassageiro();
					
					}
				}
				
				if(op == 2) { //Mostra Rotas cadastradas
					System.out.println("Ha "+ rotasLista.size() +" rotas cadastrados");
					for(i=0;i<rotasLista.size();i++) {
						System.out.println(i+1);
						rotasLista.get(i).exibeRotas();
					}
				}
				
				if(op == 3) { //Mostra Onibus cadastrados
				
					System.out.println("Ha "+ onibusLista.size() +" onibus cadastrados");
					for(i=0;i<onibusLista.size();i++) {
						System.out.println(i+1 + "- "+ onibusLista.get(i).getModelo());
						onibusLista.get(i).exibirAssentos();
					}
				}
				
				if(op == 4) { //Mostra Motorista Cadastrado
					
					System.out.println("Ha "+ motoristaLista.size() +" motoristas cadastrados");
					for(i=0;i<motoristaLista.size();i++) {
						System.out.println(i+1 + "- "+ motoristaLista.get(i).getNome());
					}
				}
			}
			
			if(opSistemas == 3){ // Sistema Compra passagens
				
				int posPassageiro,posRota,j,x,y,origem,destino;
				
				System.out.println("Escolha o passageiro que ira comprar a passagem");
				for(i=0;i<passageirosLista.size();i++){
					System.out.println(i + " - " + passageirosLista.get(i).getPNome());	
				}
				
				System.out.println("Digite o indice do passageiro desejado: ");
				
				posPassageiro = sc.nextInt();
				
				for(j=0;j<rotasLista.size();j++){
					System.out.println("Rota "+j);
					rotasLista.get(j).exibeRotas();
				}
				
				System.out.println("Escolha a cidade de origem: ");
				System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
				origem = sc.nextInt();
				
				System.out.println("Escolha a cidade destino: ");
				System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
				destino = sc.nextInt();
				
				
				for(j=0;j<rotasLista.size();j++) {
					if(origem == rotasLista.get(j).getOrigem() && destino == rotasLista.get(j).getDestino()) {
						System.out.println("Rota "+j);
						rotasLista.get(j).exibeRotas();
					}
				}
				
				
				System.out.println("Digite o indice da rota que ira comprar: ");
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
