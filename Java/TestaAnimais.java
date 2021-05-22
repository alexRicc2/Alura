public class TestaAnimais{
	
	public static void main(String arg[]){
		
		Gato mel = new Gato("Mel",2); //tipo de pelagem 2
		Cachorro scooby = new Cachorro("Scooby", 3); //raça tipo 3
		Sapo tob = new Sapo("toby",true);
		Peixe nemo = new Peixe("nemo","peixe palhaco",10);
		
		System.out.println("Nome: " + mel.getNome() + "\nTipo: " + mel.getTipo() + "\nLife time: " + mel.getLifeTime());
		System.out.println("\n\nNome: " + scooby.getNome() + "\nTipo: " + scooby.getTipo() + "\nLife time: " + scooby.getLifeTime());
		System.out.println("\n\nNome: " + nemo.getNome() + "\nTipo: " + nemo.getTipo() + "\nLife time: " + nemo.getLifeTime());
		System.out.println("\n\nNome: " + tob.getNome() + "\nTipo: " + tob.getTipo() + "\nLife time: " + tob.getLifeTime());
		
		
		boolean valorGato = mel instanceof Animal;
		boolean valorCachorro = scooby instanceof Animal;
		boolean valorSapo = tob instanceof Animal;
		boolean valorPeixe = nemo instanceof Animal;
		
		System.out.println("\nMel eh um animal ?: " + valorGato);
		System.out.println("Scooby eh um animal ?: "+ valorCachorro);
		System.out.println("Nemo eh um animal ?: "+ valorPeixe);
		System.out.println("tob eh um animal ?: "+ valorSapo + "\n");
		
		mel.comunicar();
		scooby.comunicar();
		tob.movimentar();
		nemo.comunicar();
	}
	}