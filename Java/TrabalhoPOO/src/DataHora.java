
public class DataHora {
	private int hora;
	private int minuto;
	private int ano;
	private int mes;
	private int dia;
	
	public DataHora(int hora, int minuto, int ano, int mes, int dia) {
		this.hora = hora;
		this.minuto = minuto;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
}
