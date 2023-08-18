import java.util.Scanner;
public class exWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Você terá que digitar 10 números");
		int cont = 1;
		double numero = 0;
		while (cont <= 10)
		{	System.out.println("Digite um número");
			numero +=  entrada.nextDouble();
			cont++;
		}
		double media = numero / 10;
		System.out.println("A média dos números é " + media);
		entrada.close();
	}

}
