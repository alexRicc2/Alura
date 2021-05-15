import java.util.ArrayList;

public class Turma{
	
	public static void main(String args[]){
		
		ArrayList<Aluno> turma = new ArrayList<>();
		
		Aluno alex = new Aluno("Alex",19,'M',0,8.5);
		Aluno mariana = new Aluno("Mariana", 22, 'F', 0, 7.94);
		Aluno bianca = new Aluno("Bianca", 19, 'F', 4, 3.24);
		
		
		turma.add(alex);
		turma.add(mariana);
		turma.add(bianca);
	}
	
}