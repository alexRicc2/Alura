
public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cc.deposita(200);
		cp.deposita(100);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo() + "CP: " + cp.getSaldo());
	}
	
}
