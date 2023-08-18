import java.util.Scanner;

public class exSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(java.util.Locale.US);
		System.out.println("Qual o tipo de combustível quer colocar?");
		char combustivel = entrada.nextLine().toLowerCase().charAt(0);
		System.out.println("E quantos litros você quer colcoar?");
		float litros = entrada.nextFloat();
		float preco_a = 3.69f;
		float preco_g = 6.19f;
		float preco_d = 4.05f;
		//Math.abs(entrada.nextInt()) serve para definir um número com abs
		switch (combustivel)
		{
			case 'a':
				System.out.println("O valor a ser pago é " + litros*preco_a + " reais");
				break;
			case 'g':
				System.out.format("O valor a ser pago é %1f reais", litros*preco_g);
				break;
			case 'd':
				System.out.println("O valor a ser pago é " + litros*preco_d + " reais");
				break;
			default:
				System.out.println("Obrigado! Voltem sempre!");
				
		}
		
		entrada.close();
	}

}
