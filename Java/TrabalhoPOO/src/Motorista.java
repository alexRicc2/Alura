
public class Motorista {
	
	private double Cnh;
	private Data dataAdimissao;
	private String Nome;
	
	public Motorista(double cnh, Data dataAdimissao, String nome) {
		this.Cnh = cnh;
		this.dataAdimissao = dataAdimissao;
		this.Nome = nome;
	}
	public double getCnh() {
		return Cnh;
	}
	public void setCnh(double cnh) {
		Cnh = cnh;
	}
	public Data getDataAdimissao() {
		return dataAdimissao;
	}
	public void setDataAdimissao(Data dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	
}
