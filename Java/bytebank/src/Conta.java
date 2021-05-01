public class Conta{

    private double saldo = 0;
    private int agencia;
    private int numero;
    private Cliente titular;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	public boolean sacar(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public boolean transfere(double valor,Conta recebedor){
		if(this.saldo >= valor){
			this.sacar(valor);
			recebedor.deposita(valor);
			return true;
		}
		return false;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	
}
