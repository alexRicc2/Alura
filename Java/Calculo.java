import java.util.Scanner;

public class Calculo{
	public int soma(int a, int b){
		return a+b;
	}
	public double soma(double a, double b){
		return a+b;
	}
	public int subtrai(int a, int b){
		return a-b;
	}
	public double subtrai(double a, double b){
		return a-b;
	}
	public int multiplica(int a, int b){
		return a*b;
	}
	public double multiplica(double a, double b){
		return a*b;
	}
	public double divide(double a,double b){
		if(b != 0)return a/b;
		System.out.println("impossivel dividir por 0");
		return 0;
	}
	
	public static void main(String args[]){
		
		Calculo conta = new Calculo();
		double resultado;
		double num1,num2;
		int op;
		
		System.out.println("Digite dois numeros: ");
		Scanner num = new Scanner( System.in );
		
		num1 = num.nextDouble();
		num2 = num.nextDouble();
		
		System.out.println("Digite 1 para somar\nDigite 2 para subtrair\nDigite 3 para multiplicar\nDigite 4 para dividir\n");
		
		op = num.nextInt();
		
		
		if(op == 1)resultado = conta.soma(num1,num2);
		else if(op == 2)resultado = conta.subtrai(num1,num2);
		else if(op == 3)resultado = conta.multiplica(num1,num2);
		else resultado = conta.divide(num1,num2);
		
		System.out.println("Resultado da conta = " + resultado);
	}
}