import java.util.Scanner;

public class Cadastros {

		public Onibus cadastraOnibus(Motorista m1) {
			Scanner sc = new Scanner(System.in);
			String modelo,marca;
			int anoF;
			double kilometros;
		
				System.out.println("Modelo do onibus: ");
				modelo = sc.next();
				
				System.out.println("Ano de fabricacao: ");
				anoF = sc.nextInt();
				
				System.out.println("Marca do Onibus: ");
				marca = sc.next();
				
				System.out.println("Kilometragem do Onibus: ");
				kilometros = sc.nextDouble();
				
				Onibus o1 = new Onibus(modelo,anoF,marca,kilometros,m1);
				
				System.out.println("Onibus de modelo " + o1.getModelo()+ " Cadastrado!");
				return o1;
		}
		public Onibus alteraOnibus(Onibus o1) {
			int i;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Alterando onibus");
			
			System.out.println("(1)Mudar modelo- UNICO POSSIVEL NO MOMENTO");
			System.out.println("(2)Mudar ano de fabricacao");
			System.out.println("(3)Mudar marca");
			System.out.println("(4)Mudar kilometragem");
			i = sc.nextInt();
			
			if(i == 1) {
				String modelo;
				System.out.println("Novo modelo: ");
				modelo = sc.next();
				o1.setModelo(modelo);
				
			}
			
			
			return o1;
			
		}
		public Motorista cadastraMotorista() {
			
			String nome;
			double Cnh;
			int ano,mes,dia,hora,minuto;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("(1)Cadastrar um motorista");
			
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
			
			return m1;
		}
	}
