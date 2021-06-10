import java.util.Scanner;

public class Rotas extends Metodos{
	
	private int rOrigem;
	private int rdestino;
	private int rParada1;
	private int rParada2;
	private int rParada3;
	private Onibus onibus;
	private Hora horaIda;
	private Hora horaChegada;
	private double valor;	


	public void cadastra(){
		
		Scanner sc = new Scanner(System.in);
		int origem, p1, p2, p3, destino;
		double Valor;
		
		System.out.println("(1)Cadastrar uma rota");
		
		
		System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
		System.out.println("Numero cidade Origem: ");
		origem = sc.nextInt();
		this.setROrigem(origem);
		
		System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
		System.out.println("Numero da primeira parada: ");
		p1 = sc.nextInt();
		this.setRParada1(p1);
		
		System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
		System.out.println("Numero da segunda  parada: ");
		p2 = sc.nextInt();
		this.setRParada2(p2);
		
		System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
		System.out.println("Numero da terceira parada: ");
		p3 = sc.nextInt();
		this.setRParada3(p3);
		
		System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
		System.out.println("Numero cidade Destino: ");
		destino = sc.nextInt();
		this.setRdestino(destino);
		
		System.out.println("Horario de saida: ");
		System.out.print("Digite o horario no formato hh mm: ");
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		Hora hSaida = new Hora(h1,m1);
		this.setHoraIda(hSaida);
		
		System.out.println("Horario de chegada: ");
		System.out.print("Digite o horario no formato hh mm: ");
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		Hora hChegada = new Hora(h2,m2);
		this.setHoraChegada(hChegada);
		
		System.out.println("Valor da passagem: ");
		Valor = sc.nextDouble();
		this.setValor(Valor);
		
	}
	
	public void alterar()
	{
		int op;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("(2)Alterar uma rota");
			System.out.println("\n1- Parada 1");
			System.out.println("2- Parada 2");
			System.out.println("3- Parada 3");
			System.out.println("4- Horario de saida");
			System.out.println("5- Horario de chegada");
			System.out.println("6 - Valor da passagem");
			System.out.println("Digite a opcao que deseja alterar: ");
			op = sc.nextInt();
		}while(op < 1 || op > 6);
		
		if(op == 1)
		{
			int p1;
			System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
			System.out.println("Numero da primeira parada: ");
			p1 = sc.nextInt();
			this.setRParada1(p1);
		}
		
		else if(op == 2)
		{
			int p2;
			System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
			System.out.println("Numero da segunda  parada: ");
			p2 = sc.nextInt();
			this.setRParada2(p2);
		}
		
		else if(op == 3)
		{
			int p3;
			System.out.println("1- RP; 2-Olimpia; 3- SP; 4-Mirassol; 5- Votuporanga");
			System.out.println("Numero da terceira parada: ");
			p3 = sc.nextInt();
			this.setRParada3(p3);
		}
		
		else if(op == 4)
		{
			System.out.println("Horario de saida: ");
			System.out.print("Digite o horario no formato hh mm: ");
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			Hora hSaida = new Hora(h1,m1);
			this.setHoraIda(hSaida);
		}
		
		else if(op == 5)
		{
			System.out.println("Horario de chegada: ");
			System.out.print("Digite o horario no formato hh mm: ");
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			Hora hChegada = new Hora(h2,m2);
			this.setHoraChegada(hChegada);
		}
		
		else
		{
			double Valor;
			System.out.println("Digite o valor da passagem: ");
			Valor = sc.nextDouble();
			this.setValor(Valor);
		}
		
		System.out.println("Alteracao salva com sucesso!");
	}

	public String mostraCidade(int cidade) {
		
		String cidadeNome;
		switch(cidade) {
		case 1: 
			cidadeNome = "Sao jose do Rio Preto";
			break;
		case 2: 
			cidadeNome = "Olimpia";
			break;
		case 3: 
			cidadeNome = "Sao Paulo";
			break;
		case 4: 
			cidadeNome = "Mirassol";
			break;
		case 5: 
			cidadeNome = "Votuporanga";
			break;
			
		default:
			cidadeNome = "Indefinido";
		}
		return cidadeNome;
	}



	public String getROrigem() {
		return this.mostraCidade(this.rOrigem);
		
	}



	public void setROrigem(int rOrigem) {
		if(rOrigem > 0 && rOrigem < 6)
			this.rOrigem = rOrigem;
		else
			System.out.println("Cidade de origem invalida");
	}



	public String getRdestino() {
		return this.mostraCidade(this.rdestino);
		
	}



	public void setRdestino(int rdestino) {
		if(rdestino > 0 && rdestino < 6)
			this.rdestino = rdestino;
		else
			System.out.println("Cidade de destino invalida");
	}



	public String getRParada1() {
		return this.mostraCidade(this.rParada1);
		
	}



	public void setRParada1(int rParada1) {
		if(rParada1 > 0 && rParada1 < 6)
			this.rParada1 = rParada1;
		else
			System.out.println("Parada 1 invalida");
	}



	public String getRParada2() {
		return this.mostraCidade(this.rParada2);
		
	}



	public void setRParada2(int rParada2) {
		if(rParada2 > 0 && rParada2 < 6)
			this.rParada2 = rParada2;
		else
			System.out.println("Parada 2 invalida");
	}



	public String getRParada3() {
		return this.mostraCidade(this.rParada3);
	}



	public void setRParada3(int rParada3) {
		if(rParada3 > 0 && rParada3 < 6)
			this.rParada3 = rParada3;
		else
			System.out.println("Parada 3 invalida");
	}



	public Onibus getOnibus() {
		return onibus;
	}



	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}



	public Hora getHoraIda() {
		return horaIda;
	}



	public void setHoraIda(Hora horaIda) {
		this.horaIda = horaIda;
	}



	public Hora getHoraChegada() {
		return horaChegada;
	}



	public void setHoraChegada(Hora horaChegada) {
		this.horaChegada = horaChegada;
	}



	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		if(valor > 0)
			this.valor = valor;
		else
			System.out.println("Valor invalido!");
	}
	
	public void exibeRotas(){
		System.out.println("Origem: " + this.getROrigem() + " Destino: "+ this.getRdestino() + " Hora de saida: "+ this.getHoraIda().getHora() + " Hora de chegada: "+ this.getHoraChegada().getHora() +
		" Valor da passagem: " + this.getValor());
	}
	
}