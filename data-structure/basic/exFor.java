import java.util.Scanner;

public class exFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		
		System.out.println("Digite 5 números");
		for (int i = 1; i<=5; i++)
		{
			double numero = entrada.nextDouble();
			if (numero > num)
			{
				num = numero;
			}
		}
		System.out.println("O maior número é "+ num);
		entrada.close();
	}

}
