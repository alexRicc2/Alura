public class Principal{
	
		public static void main(String args[]){
			Pessoa joao = new Pessoa("Joao", 21, 'M', 0);
			Aluno mariana = new Aluno("Mariana", 22, 'F', 0, 7.94);
			Aluno bianca = new Aluno("Bianca", 19, 'F', 4, 3.24);
			Professor pedro = new Professor("pedro", 30, 'M', 0, 2300);
			Funcionario jorge = new Funcionario("Jorge", 24, 'M', 2, 1900);
			
			
			System.out.println("Nome: " + joao.getNome() + " idade: "+ joao.getIdade());
			System.out.println("Nome: " + mariana.getNome() + " idade: "+ mariana.getIdade() +"\nMedia: " + mariana.getMedia() );
			
			
			System.out.println("Nome: " + bianca.getNome() + " idade: "+ bianca.getIdade() +"\nMedia: " + bianca.getMedia());
			
			bianca.envelhece();
			bianca.fazExame(7.89);
			
			System.out.println("Nome: " + bianca.getNome() + " idade: "+ bianca.getIdade() +"\nMedia: " + bianca.getMedia());
		}
}