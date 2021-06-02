
public class Rotas {
	
	private String ROrigem;
	private String Rdestino;
	private String RParada1;
	private String RParada2;
	private String RParada3;
	private Onibus onibus;
	
	
	public Rotas(String rOrigem, String rdestino, String rParada1, String rParada2, String rParada3, Onibus onibus) {
		ROrigem = rOrigem;
		Rdestino = rdestino;
		RParada1 = rParada1;
		RParada2 = rParada2;
		RParada3 = rParada3;
		this.onibus = onibus;
	}
	
	public String getROrigem() {
		return ROrigem;
	}
	public void setROrigem(String rOrigem) {
		ROrigem = rOrigem;
	}
	public String getRdestino() {
		return Rdestino;
	}
	public void setRdestino(String rdestino) {
		Rdestino = rdestino;
	}
	public String getRParada1() {
		return RParada1;
	}
	public void setRParada1(String rParada1) {
		RParada1 = rParada1;
	}
	public String getRParada2() {
		return RParada2;
	}
	public void setRParada2(String rParada2) {
		RParada2 = rParada2;
	}
	public String getRParada3() {
		return RParada3;
	}
	public void setRParada3(String rParada3) {
		RParada3 = rParada3;
	}
	public Onibus getOnibus() {
		return onibus;
	}
	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}
	
}
