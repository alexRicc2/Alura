
public class Onibus {
	private String modelo;
	private Data dataFab;
	private String marca;
	private double kilometragem;
	private Motorista motorista;
	

	public Onibus(String modelo, Data dataFab, String marca, double kilometragem) {
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
	public Data getDataFab() {
		return dataFab;
	}
	public void setDataFab(Data dataFab) {
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
	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
}
