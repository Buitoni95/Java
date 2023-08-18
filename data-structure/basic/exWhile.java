import java.util.Scanner;

public class exWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int num = entrada.nextInt();
		int fat = num;

		while(num >= 1)
		{	num--;
			if (num > 0)
			{
				fat *= num;
			}
			
		}
		System.out.println("Fatorial do número é " + fat);
		entrada.close();

	}

}
