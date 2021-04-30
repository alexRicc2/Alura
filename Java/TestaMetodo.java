public class TestaMetodo{
	
	public static void main(String args[]){

		Conta primeiraConta = new Conta();
		Conta contaAna = new Conta();
		
		contaAna.deposita(800);
		
		System.out.println(contaAna.saldo);
		System.out.println(primeiraConta.saldo);
		
		contaAna.transfere(300, primeiraConta);
		
		System.out.println(contaAna.saldo);
		System.out.println(primeiraConta.saldo);
		
	}		
	
}