import java.util.Scanner;

public class Rotas {
	
	private int ROrigem;
	private int Rdestino;
	private int RParada1;
	private int RParada2;
	private int RParada3;
	private Onibus onibus;
	private Hora HoraIda;
	private Hora HoraChegada;
	private double Valor;	


	public void cadastra(){
		
		Scanner sc = new Scanner(System.in);
		int origem,p1,p2,p3,destino,h1,m1,h2,m2;
		double valor;
		
		
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
		
		System.out.println("Hora de saida: ");
		h1 = sc.nextInt();
		System.out.println("Minuto de saida: ");
		m1 = sc.nextInt();
		Hora hSaida = new Hora(h1,m1);
		this.setHoraIda(hSaida);
		
		System.out.println("Hora de chegada: ");
		h2 = sc.nextInt();
		System.out.println("Minuto de chegada: ");
		m2 = sc.nextInt();
		Hora hChegada = new Hora(h2,m2);
		this.setHoraChegada(hChegada);
		
		System.out.println("Valor da passagem: ");
		valor = sc.nextDouble();
		this.setValor(valor);
		
		
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
			cidadeNome = "indefinido";
		}
		return cidadeNome;
	}

	public int getDestino() {
		return this.Rdestino;
	}
	public int getOrigem() {
		return this.ROrigem;
	}

	public String getROrigem() {
		return this.mostraCidade(this.ROrigem);
		
	}



	public void setROrigem(int rOrigem) {
		ROrigem = rOrigem;
	}



	public String getRdestino() {
		return this.mostraCidade(this.Rdestino);
		
	}



	public void setRdestino(int rdestino) {
		Rdestino = rdestino;
	}



	public String getRParada1() {
		return this.mostraCidade(this.RParada1);
		
	}



	public void setRParada1(int rParada1) {
		RParada1 = rParada1;
	}



	public String getRParada2() {
		return this.mostraCidade(this.RParada2);
		
	}



	public void setRParada2(int rParada2) {
		RParada2 = rParada2;
	}



	public String getRParada3() {
		return this.mostraCidade(this.RParada3);
	}



	public void setRParada3(int rParada3) {
		RParada3 = rParada3;
	}



	public Onibus getOnibus() {
		return onibus;
	}



	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}



	public Hora getHoraIda() {
		return HoraIda;
	}



	public void setHoraIda(Hora horaIda) {
		HoraIda = horaIda;
	}



	public Hora getHoraChegada() {
		return HoraChegada;
	}



	public void setHoraChegada(Hora horaChegada) {
		HoraChegada = horaChegada;
	}



	public double getValor() {
		return Valor;
	}



	public void setValor(double valor) {
		Valor = valor;
	}
	
	public void exibeRotas(){
		System.out.println("Origem: " + this.getROrigem() + " Destino: "+ this.getRdestino() + " Hora de saida: "+ this.getHoraIda().getHora() + " Hora de chegada: "+ this.getHoraChegada().getHora() +
		" Valor da passagem: " + this.getValor());
	}
	
}
