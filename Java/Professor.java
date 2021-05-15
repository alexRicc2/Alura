public class Professor extends Pessoa{
	
	private double salario;
	private int aulasLecionadas = 0;
	
	public Professor(String nome, int idade, char sexo, int faltas, double salario){
		super(nome,idade,sexo,faltas);
		this.salario = salario;
	}
	public Professor(String nome){
		super(nome, 25, 'N',0);
	}
	
	public void aumentarSalario(double aumento){
		if(aumento > 0){
			this.salario += aumento;
		}
	}
	public double getSalario(){
		return this.salario;
	}
	
	public void lecionaAula(){
		this.aulasLecionadas++;
	}
}