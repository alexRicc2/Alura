public class Hora
{
	private String horaFormatada;
	
	public void setHora(int hora, int minuto)
	{
		if((hora > -1 && hora < 24) && (minuto > -1 && minuto < 60))
			this.horaFormatada = hora + ":" + minuto;
		
		else
			System.out.println("Horario invalido!");
	}
	
	public String getHora()
	{
		return this.horaFormatada;
	}
	
	public Hora(int hora, int minuto)
	{
		setHora(hora, minuto);
	}
	
}