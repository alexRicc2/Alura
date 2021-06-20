public class TestaLocadora{
	
	
	public static void main(String args[]){
		
		Locadora megaFilmes = new Locadora();
		
		megaFilmes.cadastra(1); //cadastrando o filme 1 ex= vingadores
		megaFilmes.cadastra(4); //cadastra filme 4 ex= senhor dos aneis
		
		
		megaFilmes.mostraCatalogo();
		
		megaFilmes.calculaPreco();
		
		megaFilmes.Devolve();
		
	}
	
	
}