public class TestaCaminhao{
	
	public static void main(String args[]){
		
		Caminhao c1 = new Caminhao("Tesla","Cybertruck", 6, "Cyber");
		Caminhao c2 = new Caminhao("Volkswagen","caminhao", 10, "CaminhaoTipico");
		Caminhao c3 = new Caminhao("Marca","M1", 8, "Truckzao");
		
		c1.LigaMotor();
		c2.DesligaMotor();
		c3.ajustaRetrovisor();
		
		c2.MudaCor("laranja");
		c3.MudaCor("Preto");
		
		//sorry entregar o programa de forma bem simples, esse semana está muito corrida professor, mas eu entendi o conceito de inferface
	}
	
}