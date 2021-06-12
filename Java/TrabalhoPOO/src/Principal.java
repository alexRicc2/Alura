/* Autores: 
		Alex Ricardo Rodrigues Sant'Anna
		Sabrina de Oliveira Guizilini
		Sarah de Oliveira Ferreira */

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

public static void main(String args[]) {
		
		//Cadastros sistemaC = new Cadastros();
		
		int op = -1, decisao = -1, opSistemas = -1, i;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Passageiro> passageirosLista = new ArrayList<>();
		ArrayList<Rotas> rotasLista = new ArrayList<>();
		ArrayList<Onibus> onibusLista = new ArrayList<>();
		ArrayList<Motorista> motoristaLista = new ArrayList<>();
		
		while(opSistemas != 0) {
			
			do{
				System.out.println("\n\n-------- Viacao Asteroide --------\n\nMenu Principal:");
				System.out.println("\n1 - Sistema de Cadastros, Alteracao e Exclusao");
				System.out.println("2 - Mostrar cadastros");
				System.out.println("3 - Comprar Passagens");
				System.out.println("0 - Sair");
				System.out.println("Sua escolha: ");
				opSistemas = sc.nextInt();
			} while(opSistemas < 0 || opSistemas > 3);
			
			if(opSistemas == 1) {
				
				while(op != 0) {
					
					do{
						System.out.println("\nSistema de Cadastros, Alteracao e Exclusao");
						System.out.println("(1)Passageiro");
						System.out.println("(2)Motorista");
						System.out.println("(3)Onibus");
						System.out.println("(4)Rotas");
						System.out.println("(0) Voltar para Menu Principal");
						System.out.println("Sua escolha: ");
						op = sc.nextInt();
					} while (op < 0 || op > 4);
					
					
					if(op == 1){ //Passageiros
						
						do{
							System.out.println("\n(1)Cadastrar um Passageiro");
							System.out.println("(2)Alterar um Passageiro");
							System.out.println("(3)Excluir um Passageiro");
							System.out.println("Sua escolha: ");
							decisao = sc.nextInt();
						} while(decisao < 1 || decisao > 3);
						
						if(decisao == 1) {
							Passageiro p1 = new Passageiro();
							p1.cadastra();
							passageirosLista.add(p1);
						}
						
						else {
							
							if(passageirosLista.size() != 0){
							
							System.out.println("\nHa "+ passageirosLista.size() +" passageiro(s) cadastrado(s)");
							for(i=0;i<passageirosLista.size();i++) {
								passageirosLista.get(i).apresentaPassageiro(i);								
							}
							
							if(decisao == 2)
							{
								System.out.println("\nIndice do passageiro a ser alterado: ");
								i = sc.nextInt(); 
								
									if(i < passageirosLista.size() && i >= 0)
									{
										passageirosLista.get(i).alterar();
									}
									
									else
									{
										System.out.println("Desculpe, nao ha passageiros cadastrados com o codigo inserido!");
									}
					
							
							}
							
							else
							{
								System.out.println("Indice do passageiro a ser excluido: ");
								i = sc.nextInt();
								
								
									if(i < passageirosLista.size() && i >= 0)
									{
										passageirosLista.remove(i);	
										System.out.println("Passageiro excluido com sucesso!");
									}
									
									else
									{
										System.out.println("Desculpe, nao ha cadastros com o codigo inserido!");
									}
								
							}
							
						}
						
						
						else
						{
							System.out.println("Nao ha passageiros cadastrados no sistema.");
						}
						}
					}
					
					if(op == 4){ //Rotas, necessario um onibus
					
						do{
							System.out.println("\n(1)Cadastrar uma Rota");
							System.out.println("(2)Alterar uma Rota");
							System.out.println("(3)Excluir uma Rota");
							System.out.println("Sua escolha: ");
							decisao = sc.nextInt();
						} while(decisao < 1 || decisao > 3);
						
						if(decisao == 1 ) {
							if(onibusLista.isEmpty()) {
									System.out.println("Sem onibus pre cadastrados");
								}
								
							else{
								Rotas r1 = new Rotas();
								
								r1.cadastra();
								System.out.println("\n\tOnibus disponiveis para esta rota: ");
								
								for(i=0;i<onibusLista.size();i++) {
										System.out.println("\n\tOnibus indice[" + i + "] - Modelo: " + onibusLista.get(i).getModelo());
									}
								System.out.println("\nIndice do onibus para a rota: ");
								i = sc.nextInt();
								
		
									if(i < onibusLista.size() && i >= 0)
									{
										r1.setOnibus(onibusLista.get(i));
										rotasLista.add(r1);
								
										System.out.println("A rota para "+ r1.getRdestino() +" foi cadastrada com sucesso!");
									}
									
									else
									{
										System.out.println("Desculpe, nao ha onibus cadastrados com o codigo inserido!");
									}
									
							}
						}
						
						else {
							if(rotasLista.size() != 0){
							
							System.out.println("\nHa "+ rotasLista.size() +" rota(s) cadastrada(s)");
							for(i=0;i<rotasLista.size();i++) {
								rotasLista.get(i).exibeRotas(i);
							}
							
							if(decisao == 2)
							{
								System.out.println("Indice da rota a ser alterada: ");
								i = sc.nextInt(); 
							
									if(i < rotasLista.size() && i >= 0)
									{
										rotasLista.get(i).alterar();
									}
									
									else
									{
										System.out.println("Desculpe, nao ha rotas cadastradas com o codigo inserido!");
									}
								
							}
							
							else
							{
								System.out.println("Indice da rota a ser excluida: ");
								i = sc.nextInt(); 
							
						
										if(i < rotasLista.size() && i >= 0)
										{
											rotasLista.remove(i);	
											System.out.println("Rota excluida com sucesso!");
										}
										
										else
										{
											System.out.println("Desculpe, nao ha rotas cadastradas com o codigo inserido!");
										}
									
								
							}
						}
							
						else
						{
							System.out.println("Nao ha rotas cadastradas no sistema.");
						}
					}
				}
					
					if(op == 3) { //Onibus, necessario um motorista
					
						do{
							System.out.println("\n(1)Cadastrar um Onibus");
							System.out.println("(2)Alterar um Onibus");
							System.out.println("(3)Excluir um Onibus");
							System.out.println("Sua escolha: ");
							decisao = sc.nextInt();
						} while(decisao < 1 || decisao > 3);
						
						if(decisao == 1) { //cadastra onibus
							
							if(motoristaLista.isEmpty()) {
								System.out.println("Sem motorista pre cadastrados");
							}
							else {
								Onibus o1 = new Onibus();
								o1.cadastra();
								
								System.out.println("\n\tMotoristas disponiveis para este onibus: ");
								
								for(i=0;i<motoristaLista.size();i++) {
									System.out.println("\tMotorista indice[" + i + "] - Nome: " + motoristaLista.get(i).getNome());
								}
								System.out.println("\nIndice do motorista para o Onibus: ");
								i = sc.nextInt(); 
								

									if(i < motoristaLista.size() && i >= 0)
									{
										o1.setMotorista(motoristaLista.get(i));
										onibusLista.add(o1);
								
										System.out.println("\nOnibus de modelo: "+ o1.getModelo()+ " foi cadastrado com sucesso!");
									}
									
									else
									{
										System.out.println("Desculpe, nao ha motoristas cadastrados com o codigo inserido!");
									}
											
							}
						}
						
						else{
							if(onibusLista.size() != 0){
							for(i=0;i<onibusLista.size();i++) {
								System.out.println("\n["+i+"] - Onibus " + onibusLista.get(i).getModelo());
							}
							
							if(decisao == 2)
							{
								System.out.println("\nIndice do Onibus a ser alterado: ");
								i = sc.nextInt(); 
								
	
									if(i < onibusLista.size() && i >= 0)
									{
										onibusLista.get(i).alterar();
									}
									
									else
									{
										System.out.println("\nDesculpe, nao ha onibus cadastrados com o codigo inserido!");
									}
								
							}
							
							else
							{
								System.out.println("\nIndice do Onibus a ser excluido: ");
								i = sc.nextInt(); 
								
					
										if(i < onibusLista.size() && i >= 0)
										{
											onibusLista.remove(i);
											System.out.println("Onibus excluido com sucesso!");
										}
										
										else
										{
											System.out.println("Desculpe, nao ha onibus cadastrados com o codigo inserido!");
										}
									
								
							}
		
						}
						else
						{
							System.out.println("Nao ha onibus cadastrados no sistema.");
						}
						
						}
						
					
					}
					
					if(op == 2) { //Motorista
						
						do{
							System.out.println("\n(1)Cadastrar um Motorista");
							System.out.println("(2)Alterar um Motorista");
							System.out.println("(3)Excluir um Motorista");
							System.out.println("Sua escolha: ");
							decisao = sc.nextInt();
						}while(decisao < 1 || decisao > 3);
						
						if(decisao == 1){
							Motorista m1 = new Motorista();
							m1.cadastra();
							
							motoristaLista.add(m1);
						}
						
						else {
							if(motoristaLista.size() != 0){
							for(i=0;i<motoristaLista.size();i++) {
								System.out.println("["+i+"] - Motorista " + motoristaLista.get(i).getNome());
							}
							
							if(decisao == 2)
							{
								System.out.println("Indice do Motorista a ser alterado: ");
								i = sc.nextInt(); 
								
							
									if(i < motoristaLista.size() && i >= 0)
									{
										motoristaLista.get(i).alterar();
									}
									
									else
									{
										System.out.println("Desculpe, nao ha motoristas com o codigo inserido!");
									}
								
								
							}
							
							else
							{
								System.out.println("\nIndice do Motorista a ser excluido: ");
								i = sc.nextInt(); 
								
								
									if(i < motoristaLista.size() && i >= 0)
									{
										motoristaLista.remove(i);
								
										System.out.println("Motorista excluido com sucesso!");
									}
									
									else
									{
										System.out.println("Desculpe, nao ha motoristas com o codigo inserido!");
									}
																
							}
							
							}
						
							else
							{
								System.out.println("Nao ha motoristas cadastrados no sistema.");
							}
						}
					}
					
				
				
				} 
			}
		
				
			if(opSistemas == 2) { //Mostra os cadastros
				
				do{
					System.out.println("\nMostrar Cadastros");
					System.out.println("1- Lista de passageiros");
					System.out.println("2- Lista de rotas");
					System.out.println("3- Lista de onibus");
					System.out.println("4- Lista de motorista");
					System.out.println("Sua escolha: ");
					op = sc.nextInt();
				} while (op < 0 || op > 4);
				
				if(op == 1) {
					System.out.println("\nHa "+ passageirosLista.size() +" passageiro(s) cadastrado(s)");
					for(i=0;i<passageirosLista.size();i++) {
						passageirosLista.get(i).apresentaPassageiro();
					
					}
				}
				
				if(op == 2) {
					System.out.println("\nHa "+ rotasLista.size() +" rota(s) cadastrada(s)");
					for(i=0;i<rotasLista.size();i++) {
						System.out.println(i+1);
						rotasLista.get(i).exibeRotas();
					}
				}
				
				if(op == 3) {
				
					System.out.println("\nHa "+ onibusLista.size() +" onibus cadastrado(s)");
					for(i=0;i<onibusLista.size();i++) {
						System.out.println(i+1 + "- "+ onibusLista.get(i).getModelo());
						onibusLista.get(i).exibirAssentos();
					}
				}
				
				if(op == 4) {
					
					System.out.println("\nHa "+ motoristaLista.size() +" motorista(s) cadastrado(s)");
					for(i=0;i<motoristaLista.size();i++) {
						System.out.println(i+1 + "- "+ motoristaLista.get(i).getNome());
					}
				}
			}
			
			if(opSistemas == 3){ //Compra passagens
			
				System.out.println("\nComprar Passagens");
			
				if(rotasLista.size() != 0 && passageirosLista.size() != 0) {
				
				int posPassageiro,posRota,j,x,y;
				
				System.out.println("\nEscolha o passageiro que ira comprar a passagem");
				for(i=0;i<passageirosLista.size();i++){
				System.out.println("[" + i + "] " + passageirosLista.get(i).getPNome());	
				}
				
				System.out.println("\nDigite o indice do passageiro desejado: ");
				posPassageiro = sc.nextInt(); 
				
				for(int aux=0; aux<passageirosLista.size(); aux++)
				{
					if(aux == posPassageiro)
					{
						System.out.println("\nEscolha a rota que ira comprar");
				
						for(j=0;j<rotasLista.size();j++){
							//System.out.println("Rota "+j);
							rotasLista.get(j).exibeRotas(j);
						}
						posRota = sc.nextInt(); 
						
						for(int aux1=0; aux1<rotasLista.size(); aux1++)
								{
									if(aux1 == posRota)
									{
										System.out.println("Escolha seu assento no onibus");
										rotasLista.get(posRota).getOnibus().exibirAssentos();
										System.out.println("\nDigite as coordenadas do assento Ex.: 7 2: "); //-> Exemplo: 0 1, 2 0, 3 2, ...
										x = sc.nextInt(); 
										y = sc.nextInt(); 
										
										rotasLista.get(posRota).getOnibus().setAssentos(x,y); //marca que ocupou o assento
										
										
										passageirosLista.get(posPassageiro).setPassagens(rotasLista.get(posRota)); //adiciona a rota na lista de passagens do passageiro

									}
									
									else
									{
										System.out.println("Desculpe, nao ha rotas cadastradas com o codigo inserido!");
									}
								}		
						
					}									
					else
					{
						System.out.println("Desculpe, nao ha passageiros cadastrados com o codigo inserido!");
					}
				}			
				
			}
			
			else{
				System.out.println("\nNao ha cadastros suficientes para realizar a compra de passagens.");
			}
			}
			
			}   
			} 
		} 
