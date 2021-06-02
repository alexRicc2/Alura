
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente alex = new Gerente();
		alex.setNome("Alex");
		alex.setCpf("34346342-2");
		alex.setSalario(14600);
		
		System.out.println(alex.getNome());
		System.out.println(alex.getBonificacao());
	}

}
