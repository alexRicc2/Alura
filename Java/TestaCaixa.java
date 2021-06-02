public class TestaCaixa{
	
	public static void main(String[] args){
		
		Caixa caixa1 = new Caixa();
		Caixa caixa2 = new Caixa();
		Caixa caixa3 = new Caixa();
		Caixa caixa4 = new Caixa();
		Caixa caixa5 = new Caixa();

		caixa1.entrouNaFila();
		caixa1.entrouNaFila();
		
		caixa2.entrouNaFila();
		
		caixa4.entrouNaFila();caixa4.entrouNaFila();caixa4.entrouNaFila();caixa4.entrouNaFila();
		caixa4.saiuDaFila();
		
		System.out.println("Ha " + caixa1.getPessoasNaFila() + " na fila do caixa1");
		System.out.println("Ha " + caixa2.getPessoasNaFila() + " na fila do caixa2");
		System.out.println("Ha " + caixa3.getPessoasNaFila() + " na fila do caixa3");
		System.out.println("Ha " + caixa4.getPessoasNaFila() + " na fila do caixa4");
		System.out.println("Ha " + caixa5.getPessoasNaFila() + " na fila do caixa5");
	}
	
	
}