import java.util.ArrayList;
import java.util.Scanner;

public class Locadora implements Filmes, Aluga, Pagamento{
	
	private ArrayList<Filme> filmes = new ArrayList<>();
	private double PrecoUnidade = 5;
	private double valorTotal = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public void cadastra(int filme){
		Filme f = new Filme();
		f.setFilme(filme);
		this.filmes.add(f);
	}
	
	public void altera(int antigoFilme, int novoFilme){
			Filme f = new Filme();
			f.setFilme(novoFilme);
			this.filmes.remove(antigoFilme);
			this.filmes.add(f);
	}
	
	public void mostraCatalogo(){
		int i;
		System.out.println("Mostrando catalogo");
		for(i=0;i<filmes.size();i++){
			System.out.println("filme: "+filmes.get(i).getFilme());
		}
	}
	
	public void calculaPreco(){
		System.out.println("Quantos filmes voce vai comprar: ");
		int quant = sc.nextInt();
		this.valorTotal = quant*this.PrecoUnidade;
		
		System.out.println("Valor total: "+ this.valorTotal);
	}
	public void pagar(){
		System.out.println("Pagando o total de " + this.valorTotal + " Que seria retirado do saldo do cliente");
	}
	

	public void setAluga(int filme){
		int i;
		System.out.println("Alugando o filme "+ filme);
		for(i=0;i<filmes.size();i++){
			if(filme == filmes.get(i).getFilme()){
				System.out.println("Filme alugado com sucesso!");
				//adiciona o filme na lista do cliente (nao fiz a classe cliente)
			}
		}
	}
	public void Devolve(){
		System.out.println("Devolvendo os filmes");
		//devolveria todos os filmes da lista do cliente
	}

}	
	