
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setSalario(3000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d1);
		
		System.out.println("A soma das bonificaçoes foi de " + controle.getSoma());
	}

}
