
public class TestaClasse {
		
	public static void main(String[] args) {
		Conta contaDoAlex = new Conta();
		
		contaDoAlex.setAgencia(1000);
		contaDoAlex.deposita(200);
		contaDoAlex.setTitular(new Cliente());
		
		contaDoAlex.getTitular().setNome("Alex");
		
		System.out.println("Rodando a versao com get e setters : " + contaDoAlex.getTitular().getNome());
	}
}
