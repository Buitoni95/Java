import java.util.Scanner;

public class exElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para ser compradado com outro");
		double numero1 = entrada.nextDouble();
		System.out.println("Digite um número para ser comparado com o número digitado anteriormente");
		double numero2 = entrada.nextDouble();
		
		if(numero1 > numero2)
		{
			System.out.println("O primeiro número digitado (" + numero1 + ") é maior que o segundo (" + numero2 + ")");
		}
		else if(numero2 > numero1)
		{
			System.out.println("O segundo número digtado (" + numero2 + ") é maior que o primeiro (" + numero1 + ")");
		}
		else
		{
			System.out.println("Os dois numeros (" + numero1 + ") e o (" + numero2 + ") são iguais");
		}
		entrada.close();
	}

}
