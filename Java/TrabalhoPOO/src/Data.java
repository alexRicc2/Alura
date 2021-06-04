public class Data
{
	private String dataFormatada;
	
	public void setData(int dia, int mes, int ano)
	{
		if((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 1900 && ano < 2022))
			this.dataFormatada = dia + "/" + mes + "/" + ano;
		
		else
			System.out.println("Data invalida!");
	}
	
	public String getData()
	{
		return this.dataFormatada;
	}
	
	public Data(int dia, int mes, int ano)
	{
		setData(dia, mes, ano);
	}
}