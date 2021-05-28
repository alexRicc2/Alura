public class Caixa{
	
	private int pessoasNaFila = 0;
	
	public int getPessoasNaFila(){
		return this.pessoasNaFila;
	}
	
	public void entrouNaFila(){
		this.pessoasNaFila++;
	}
	public void saiuDaFila(){
		if(this.pessoasNaFila > 0){
			this.pessoasNaFila--;
		}
	}
	
}