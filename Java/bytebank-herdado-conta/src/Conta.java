
public abstract class Conta {

    protected double saldo = 0;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
  
    public Conta(int agencia, int numero ) {
    	this.agencia = agencia;
    	this.numero = numero;
    	//this.saldo = 100;
    	total++;
    	//System.out.println("Estou criando uma nova conta com valores");
    }
	
	public abstract void deposita(double valor);
	
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
	public static int getTotal() {
		return Conta.total;
	}
}
