
public class TestaClasse {
		
	public static void main(String[] args) {
		Conta contaDoAlex = new Conta();
		Conta contaDoRichard = new Conta(123, 134);
		
		contaDoAlex.setAgencia(1000);
		contaDoAlex.deposita(200);
		contaDoAlex.setTitular(new Cliente());
		
		contaDoAlex.getTitular().setNome("Alex");
		
		System.out.println("Rodando a versao com get e setters : " + contaDoAlex.getTitular().getNome());
		
		System.out.println("Total de contas: " + Conta.getTotal());
		
		Conta contaAleatoria = new Conta(2432, 23432);
		
		System.out.println("Total de contas: " + Conta.getTotal());
		
		
	}
}
