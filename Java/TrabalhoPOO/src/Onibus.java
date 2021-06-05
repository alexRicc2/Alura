public class Onibus
{
	private String modelo;
	private int anoFab;
	private String marca;
	private double kilometragem;
	private Motorista motorista;
	private int assentos[][] = new int[8][4];
	

	public void cadastro(){
		
		Scanner sc = new Scanner(System.in);
		String modelo,marca;
		int anoF;
		double kilometros;
		
		System.out.println("Modelo do onibus: ");
		modelo = sc.next();
				
		System.out.println("Ano de fabricacao: ");
		anoF = sc.nextInt();
				
		System.out.println("Marca do Onibus: ");
		marca = sc.next();
				
		System.out.println("Kilometragem do Onibus: ");
		kilometros = sc.nextDouble();
		
		setModelo(modelo);
		setAnoFab(anoF);
		setMarca(marca);
		setKilometragem(kilometros);
		
	}
	
    public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	} 
	 
	public String getModelo()
	{
		return modelo;
	}
	
	public void setModelo(String modelo)
	{
		if(modelo != "")
			this.modelo = modelo;
		else
			System.out.println("Modelo invalido!");
	}
	
	public int getAnoFab()
	{
		return anoFab;
	}
	
	public void setAnoFab(int anoFab)
	{
		if(anoFab > 1950 && anoFab < 2022)
			this.anoFab = anoFab;
		else
			System.out.println("Ano de fabricacao invalido");
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public void setMarca(String marca)
	{
		if(marca != "")
			this.marca = marca;
		else
			System.out.println("Marca invalida!");
	}
	
	public double getKilometragem()
	{
		return kilometragem;
	}
	
	public void setKilometragem(double kilometragem)
	{
		if(kilometragem >= 0)
			this.kilometragem = kilometragem;
		else
			System.out.println("Kilometragem invalida!");
	}
	
	public int[][] getAssentos()
	{
		return assentos;
	}
	
	public void setAssentos(int i, int j)
	{
		if((i >= 0 && i <= 7) && (j>=0 && j<=3) && (this.assentos[i][j] == 0))
			this.assentos[i][j] = 1;
		else
			System.out.println("Coordenadas de assento invalidas!");
	}
	public void exibirAssentos(){
		
		int i,j;
		System.out.println("0 - Assento livre | 1 - Assento ocupado\n");
		System.out.println("  0   1   2   3");
		for(i=0; i<8; i++)
		{
			System.out.print(i + " ");
			for(j=0; j<4; j++)
			{
				if(j == 2)
					System.out.print(" ");
				System.out.printf("[%d]", this.assentos[i][j]);
			}
			System.out.printf("\n");
		} 
		
	}
		/* Na main:
		
		objeto.exibirAssentos();
		System.out.println("Digite as coordenadas do assento: "); -> Exemplo: 0 1, 2 0, 3 2, ...
		Ler coordenadas e guardar em duas variaveis
		objeto.setAssentos(var1, var2);
		*/
}