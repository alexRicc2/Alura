public class TestaAnimais{
	
	public static void main(String arg[]){
		
		Gato mel = new Gato("Mel",2); //tipo de pelagem 2
		Cachorro scooby = new Cachorro("Scooby", 3); //raça tipo 3
		Sapo tob = new Sapo("toby",true);
		
		System.out.println("Nome: " + mel.getNome() + "\nTipo: " + mel.getTipo() + "\nLife time: " + mel.getLifeTime());
		System.out.println("\nNome: " + scooby.getNome() + "\nTipo: " + scooby.getTipo() + "\nLife time: " + scooby.getLifeTime());
		System.out.println("\nNome: " + tob.getNome() + "\nTipo: " + tob.getTipo() + "\nLife time: " + tob.getLifeTime());
		
		mel.miar();
		scooby.latir();
		tob.saltar();
	}
	}