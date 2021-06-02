
public class Motorista {
	
	private double Cnh;
	private DataHora dataAdimissao;
	private String Nome;
	
	public Motorista(double cnh, DataHora dataAdimissao, String nome) {
		Cnh = cnh;
		this.dataAdimissao = dataAdimissao;
		Nome = nome;
	}
	public double getCnh() {
		return Cnh;
	}
	public void setCnh(double cnh) {
		Cnh = cnh;
	}
	public DataHora getDataAdimissao() {
		return dataAdimissao;
	}
	public void setDataAdimissao(DataHora dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	
}
