public class Aluno extends Pessoa{
	
	private double media;
	
	public Aluno(String nome, int idade, char sexo, int faltas, double media){
		
		super(nome, idade, sexo, faltas);
		this.media = media;
	}
	
	public void alteraMedia(double media){
		
		if(media >= 0 && media <= 10){
			this.media = media;
		}
	}
	
	public double getMedia(){
		return this.media;
	}
	
	public void fazExame(double notaExame){
		if(notaExame >= 5 && notaExame > this.getMedia()){
			this.media = notaExame;
		}
	}
}