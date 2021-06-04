
public class Rotas {
	
	private int ROrigem;
	private int Rdestino;
	private int RParada1;
	private int RParada2;
	private int RParada3;
	private int onibus;
	private Hora HoraIda;
	private Hora HoraChegada;
	private double Valor;
	
	public Rotas(int origem, int destino) {
		
		this.ROrigem = origem;
		this.Rdestino = destino;
		
	}
	
	

	public Rotas(int rOrigem, int rdestino, int rParada1, int rParada2, int rParada3, int onibus, Hora horaIda,
			Hora horaChegada, double valor) {
		super();
		ROrigem = rOrigem;
		Rdestino = rdestino;
		RParada1 = rParada1;
		RParada2 = rParada2;
		RParada3 = rParada3;
		this.onibus = onibus;
		HoraIda = horaIda;
		HoraChegada = horaChegada;
		Valor = valor;
	}



	public void mostraCidade(int cidade) {
		
		
		switch(cidade) {
		case 1: 
			System.out.println("Sao jose do Rio Preto");
			break;
			
			default:
			System.out.println("Nada");
		}
		
	}



	public int getROrigem() {
		return ROrigem;
	}



	public void setROrigem(int rOrigem) {
		ROrigem = rOrigem;
	}



	public int getRdestino() {
		return Rdestino;
	}



	public void setRdestino(int rdestino) {
		Rdestino = rdestino;
	}



	public int getRParada1() {
		return RParada1;
	}



	public void setRParada1(int rParada1) {
		RParada1 = rParada1;
	}



	public int getRParada2() {
		return RParada2;
	}



	public void setRParada2(int rParada2) {
		RParada2 = rParada2;
	}



	public int getRParada3() {
		return RParada3;
	}



	public void setRParada3(int rParada3) {
		RParada3 = rParada3;
	}



	public int getOnibus() {
		return onibus;
	}



	public void setOnibus(int onibus) {
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
	
	
	
}
