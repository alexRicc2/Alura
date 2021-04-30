public class Conta{

    double saldo = 0;
    int agencia;
    int numero;
    String titular;
	
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
	
}
