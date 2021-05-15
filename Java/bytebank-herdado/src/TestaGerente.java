
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente pedro = new Gerente();
		
		pedro.setNome("pedroo");
		pedro.setSalario(3000);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
		pedro.setSenha(12);

		System.out.println(pedro.autentica(13));
	}

}
