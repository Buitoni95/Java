import java.util.Scanner;

public class exDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int num = entrada.nextInt();
		int cont = 1;
		do 
		{
			if (num % cont == 0)
			{
				System.out.println("O número " + cont + " é dividor de " + num);
			}
			cont++;
		} while(cont <= num);
		
		entrada.close();
	}

}
