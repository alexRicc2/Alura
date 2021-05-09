public class Funcionario extends Pessoa{
	
	private double salario;
	private int profissao = 1;
	
	public Funcionario(String nome, int idade, char sexo, int faltas, double salario){
		super(nome,idade,sexo,faltas);
		this.salario = salario;
	}
	
	public void aumentarSalario(double aumento){
		if(aumento > 0){
			this.salario += aumento;
		}
	}
	public double getSalario(){
		return this.salario;
	}
	
	public void subeCargo(){
		this.profissao++;
	}
	
	public int getProfissao(){
		return this.profissao;
	}
}