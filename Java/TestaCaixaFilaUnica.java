public class TestaCaixaFilaUnica{
	
	public static void main(String[] args){
		
		CaixaFilaUnica caixa1 = new CaixaFilaUnica();
		CaixaFilaUnica caixa2 = new CaixaFilaUnica();
		CaixaFilaUnica caixa3 = new CaixaFilaUnica();
		CaixaFilaUnica caixa4 = new CaixaFilaUnica();
		CaixaFilaUnica caixa5 = new CaixaFilaUnica();
		
		CaixaFilaUnica.entrouNaFila();
		CaixaFilaUnica.entrouNaFila();
		CaixaFilaUnica.entrouNaFila();
		
		caixa3.atende(); //o caixa 3 atendeu uma pessoa
		
		System.out.println("Ha " + caixa1.getPessoasNaFila() + " na fila do caixa1");
		System.out.println("Ha " + caixa2.getPessoasNaFila() + " na fila do caixa2");
		System.out.println("Ha " + caixa3.getPessoasNaFila() + " na fila do caixa3");
		System.out.println("Ha " + caixa4.getPessoasNaFila() + " na fila do caixa4");
		System.out.println("Ha " + caixa5.getPessoasNaFila() + " na fila do caixa5");
		
	}
	
}