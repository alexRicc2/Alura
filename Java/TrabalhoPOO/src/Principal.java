import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

public static void main(String args[]) {
		
		Cadastros sistemaC = new Cadastros();
		
		
		int op = -1,decisao = -1, opSistemas = -1;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Passageiro> passageirosLista = new ArrayList<>();
		ArrayList<Rotas> rotasLista = new ArrayList<>();
		ArrayList<Onibus> onibusLista = new ArrayList<>();
		ArrayList<Motorista> motoristaLista = new ArrayList<>();
		
		while(opSistemas != 0) {
		
			System.out.println("\n1 - Sistema de Cadastros");
			System.out.println("2 - Mostrar cadastros");
			System.out.println("3 - Comprar Passagens");
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
					
					
					if(op == 1){
						
						Passageiro p1 = new Passageiro();
						p1.cadastra();
						passageirosLista.add(p1);
						
					}
					
					if(op == 2){
						int i;
						if(onibusLista.isEmpty()) {
								System.out.println("Sem onibus pre cadastrados");
							}
						else{
							Rotas r1 = new Rotas();
							
							r1.cadastra();
							for(i=0;i<onibusLista.size();i++) {
									System.out.println("Onibus " + i + " " + onibusLista.get(i).getModelo());
								}
							System.out.println("Numero do onibus para a rota: ");
							i = sc.nextInt();
							
							r1.setOnibus(onibusLista.get(i));
							
							rotasLista.add(r1);
								
							
						}
					}
					
					if(op == 3) {
						int i;
						
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
								
								for(i=0;i<motoristaLista.size();i++) {
									System.out.println("Motorista " + i + " " + motoristaLista.get(i).getNome());
								}
								System.out.println("Numero do motorista para o Onibus: ");
								i = sc.nextInt();
								o1.setMotorista(motoristaLista.get());
								onibusLista.add(o1);
								
							}
						}
						if(decisao == 2) {
							for(i=0;i<onibusLista.size();i++) {
								System.out.println("onibus " + i + " " + onibusLista.get(i).getModelo());
							}
							System.out.println("Numero do Onibus a ser alterado: ");
							i = sc.nextInt();
							
							Onibus o = sistemaC.alteraOnibus(onibusLista.get(i));
							onibusLista.remove(i);
							onibusLista.add(o);
						}
						else if(decisao == 3) { //deleta onibus
							
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
				op = sc.nextInt();
				
				if(op == 3) {
					int i;
					System.out.println("Ha "+ onibusLista.size() +" onibus cadastrados");
					for(i=0;i<onibusLista.size();i++) {
						System.out.println(i+1 + "- "+ onibusLista.get(i).getModelo());
					}
				}
				
				if(op == 4) {
					int i;
					System.out.println("Ha "+ motoristaLista.size() +" motoristas cadastrados");
					for(i=0;i<motoristaLista.size();i++) {
						System.out.println(i+1 + "- "+ motoristaLista.get(i).getNome());
					}
				}
			}
			
			if(opSistemas == 3){ //Compra passagens
				
				int i;
				
				System.out.println("Escolha o passageiro que ira comprar a passagem");
				for(i=0;i<passageirosLista.size();i++){
					System.out.println(i+1 + " - " + passageirosLista.get(i).getNome);	
				}
				
				System.out.println("Digite a posicao do passageiro desejado: ");
				posPassageiro = sc.nextInt();
				
				System.out.println("Escolha a rota que ira comprar");
				
				for(j=0;j<rotasLista.size();j++){
					System.out.println("Rota "+j);
					rotasLista.get(j).exibeRota();
				}
				posRota = sc.nextInt();
				
				passageirosLista.get(posPassageiro).setPassagens(rotasLista.get(posRotas));
				
				
				
				
			}
			}
	}
}
