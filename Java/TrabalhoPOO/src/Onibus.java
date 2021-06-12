import java.util.Scanner;

public class Onibus extends Metodos
{
	private String modelo;
	private int anoFab;
	private String marca;
	private double kilometragem;
	private Motorista motorista;
	private int assentos[][] = new int[8][4];
	private boolean temRota = false;
	

	public void cadastra(){
		
		Scanner sc = new Scanner(System.in);
		String modelo,marca;
		int anoF;
		double kilometros;
		
		System.out.println("\nModelo do onibus: ");
		modelo = sc.next();
		this.setModelo(modelo);
				
		System.out.println("Ano de fabricacao: ");
		anoF = sc.nextInt();
		this.setAnoFab(anoF);
				
		System.out.println("Marca do Onibus: ");
		marca = sc.next();
		this.setMarca(marca);
				
		System.out.println("Kilometragem do Onibus: ");
		kilometros = sc.nextDouble();
		this.setKilometragem(kilometros);
		
	}
	
	public void alterar()
	{
		int op;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("\n1- Modelo");
			System.out.println("2- Marca");
			System.out.println("3- Kilometragem");
			System.out.println("Digite a opcao que deseja alterar: ");
			op = sc.nextInt();
		}while(op < 1 || op > 3);
		
		if(op == 1)
		{
			String Modelo;
			System.out.println("Digite o modelo do onibus: ");
			Modelo = sc.next();
			this.setModelo(Modelo);
		}
		
		else if(op == 2)
		{
			String Marca;
			System.out.println("Digite a marca do onibus: ");
			Marca = sc.next();
			this.setMarca(Marca);
		}
		
		else
		{
			double Kilometragem;
			System.out.println("Digite a kilometragem do onibus: ");
			Kilometragem = sc.nextDouble();
			this.setKilometragem(Kilometragem);
		}
		
		System.out.println("Alteracao salva com sucesso!");
	}
	
	public boolean getTemRota() {
		return this.temRota;
	}
	public void setTemRota() {
		this.temRota = true;
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
		System.out.println("\n0 - Assento livre | 1 - Assento ocupado\n");
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
}