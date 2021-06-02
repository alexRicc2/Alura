
public class Onibus {
	private String modelo;
	private DataHora dataFab;
	private String marca;
	private double kilometragem;
	private Motorista motorista;
	
	public Onibus(String modelo, DataHora dataFab, String marca, double kilometragem) {
		this.modelo = modelo;
		this.dataFab = dataFab;
		this.marca = marca;
		this.kilometragem = kilometragem;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public DataHora getDataFab() {
		return dataFab;
	}
	public void setDataFab(DataHora dataFab) {
		this.dataFab = dataFab;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	
}
