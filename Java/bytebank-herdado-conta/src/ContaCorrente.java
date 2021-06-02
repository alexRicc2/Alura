
public class ContaCorrente extends Conta{
	
	public ContaCorrente(int agencia, int numero) {
		
		super(agencia, numero);
		
	}
	public void deposita(double valor) {
		 super.saldo += valor;
	}
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacar(valorASacar);
	}
}
