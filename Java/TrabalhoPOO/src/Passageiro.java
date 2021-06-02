
public class Passageiro {
	
	private double RG;
	private DataHora DataNsc;
	private String nome;
	private String endereco;
	private int tipo;
	private Rotas rota;
	
	public Passageiro(double rG, DataHora dataNsc, String nome, String endereco, int tipo) {
		RG = rG;
		DataNsc = dataNsc;
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;
	}
	
	public double getRG() {
		return RG;
	}
	public void setRG(double rG) {
		RG = rG;
	}
	
	public DataHora getDataNsc() {
		return DataNsc;
	}
	public void setDataNsc(DataHora dataNsc) {
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
