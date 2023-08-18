import java.util.Scanner;

public class exIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número para vermos se ele é múltiplo de 7");
		int numero = entrada.nextInt();
		
		if(numero % 7 == 0)
		{
			if(numero >0)
			{
				System.out.println("O número "+ numero +" é múltiplo de 7 e é positivo");
			}
			else
			{
				System.out.println("O número "+ numero + " é múltiplo de 7 mas é negativo");
			}
		}
		else 
		{
			if(numero >0)
			{
				System.out.println("O número "+ numero + "não é múltiplo de 7 mas é positivo");
			}
			else
			{
				System.out.println("O número "+ numero +" não é múltiplo de 7 e não é positivo");
			}
		}
		
		entrada.close();
	}

}
