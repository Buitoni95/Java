import java.util.Scanner;
public class exCinema {
	public static int ingressosVendidos;
	public static double totalArrecadado;
	public static int lugares[][] = new int[8][20];
	public static Scanner entrada = new Scanner(System.in);
	public static String fileiras[] = {"A", "B", "C", "D", "E", "F", "G", "H"};
	
	public static void printMatriz(int matriz[][])
	{	
		
		int p = 1;
		for (int i = 0; i < matriz.length; i++) 
		{	
			if(i == 0)
			{
				while ( p != matriz[0].length + 1)
				{
					if (p == 1)
					{	
						System.out.print("\t" + p + "\t");
					}
					else
					{
						System.out.print(p + "\t");
					}
				p++;
				}
				System.out.println();
				System.out.println();
			}
			System.out.print(fileiras[i]+ "\t");
			for (int j = 0; j < matriz[0].length; j++) 
			{
					System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

	}
	public static int retornaFileira(String fila)
	{
		int indiceFileira = 0;
		
		for(String i : fileiras)
		{
			if(fila.equals(i))
			{
					return indiceFileira;
			}
			else
			{
				indiceFileira ++;
			}
		}
		
	return indiceFileira;
	}
	public static boolean verificaFila(String fila)
	{
			for(String i : fileiras)
			{
				if(fila.equals(i))
				{
						return true;
				}
			}
			
		return false;
	}
	public static boolean verificaPoltrona(String poltrona)
	{	
		String poltronas[] = new String[lugares[0].length];
		
		for(int i = 0; i < poltronas.length; i++)
		{
			poltronas[i] = Integer.toString(i+1);
		}
			
		for(String i : poltronas)
		{
			if(poltrona.equals(i))
			{
				return true;
			}
		}
			
		return false;
	}
	public static void vendeIngresso()
	{
		System.out.print("Informe a fila: ");
		String fila = entrada.nextLine().substring(0);
		if (verificaFila(fila) == true)
		{	
			
			System.out.print("Informe a posição da poltrona: ");
			String poltrona = entrada.nextLine();
			
			
			
			if(verificaPoltrona(poltrona) == true )
			{
				int lugar = Integer.parseInt(poltrona);
				lugar -= 1;
				int n_fileira = retornaFileira(fila);
				if(lugares[n_fileira][lugar] == 0)
				{
					
					lugares[n_fileira][lugar] = 1;
					ingressosVendidos += 1;
					totalArrecadado += 45;
					System.out.println("Compra efetuada com sucesso!");
					
				}
				else
				{
					System.out.println("Erro: Poltrona não disponível!");
				}
			}
			else
			{
				System.out.println("Poltrona Inexistente");
			}
		}
		else
		{
			System.out.println("Fileira inexistente");
		}
	}
	
	public static void main(String[] args) {
		ingressosVendidos = 0;
		totalArrecadado = 0;
		
		
		String opcao;
		
		do
		{

			System.out.println("1 - Visualizar lugares dispoíveis");
			System.out.println("2 - Realizar compra de ingresso");
			System.out.println("3 - Exibir relatório");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			
			opcao = entrada.nextLine().substring(0);
			
			switch (opcao)
			{
				case "1":
					printMatriz(lugares);
					break;
				case "2":
					vendeIngresso();
					break;
				case "3":
					System.out.println("Ingressos Vendidos............: " + ingressosVendidos);
					System.out.println("Total Arrecadado..............: R$ " + totalArrecadado);
					break;
				case "4":
					opcao = "4";
					break;
				default:
					System.out.println("Opção Inválida. Escolha novamente.");
			}
		} while(opcao != "4");
		System.out.println("Programa finalizado.");
	}

}
