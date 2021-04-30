
public class TestaClasse {
		
	public static void main(String[] args) {
		Conta contaDoAlex = new Conta();
		
		contaDoAlex.agencia = 1000;
		contaDoAlex.deposita(200);
		contaDoAlex.titular = new Cliente();
		
		contaDoAlex.titular.nome = "Alex";
		
		System.out.println(contaDoAlex.titular.nome);
	}
}
