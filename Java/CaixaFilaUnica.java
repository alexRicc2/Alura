public class CaixaFilaUnica{
	
	private static int pessoasNaFila = 0;
	
	public int getPessoasNaFila(){
		return this.pessoasNaFila;
	}
	
	public static void entrouNaFila(){ //entra um na fila geral
		CaixaFilaUnica.pessoasNaFila++;
	}
	public void atende(){ //cada caixa atende o seu, mas sai 1 da fila geral
		if(this.pessoasNaFila > 0){
			this.pessoasNaFila--;
		}
	}
	
}