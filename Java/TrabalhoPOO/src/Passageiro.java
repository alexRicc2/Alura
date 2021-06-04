
public class Passageiro {
	
	private double RG;
	private Data DataNsc;
	private Hora HoraNsc;
	private String nome;
	private String endereco;
	private int tipo;
	private Rotas rota;
	
	public Passageiro(double rG, Data dataNsc, Hora horaNsc, String nome, String endereco, int tipo) {
		RG = rG;
		DataNsc = dataNsc;
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;
		this.HoraNsc = horaNsc;
	}
	
	
	public Hora getHoraNsc() {
		return HoraNsc;
	}

	public void setHoraNsc(Hora horaNsc) {
		HoraNsc = horaNsc;
	}
	public double getRG() {
		return RG;
	}

	public void setRG(double rG) {
		RG = rG;
	}
	
	public Data getDataNsc() {
		return DataNsc;
	}
	public void setDataNsc(Data dataNsc) {
		DataNsc = dataNsc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Rotas getRota() {
		return rota;
	}

	public void setRota(Rotas rota) {
		this.rota = rota;
	}
	
}
