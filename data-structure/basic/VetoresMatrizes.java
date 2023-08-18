import java.util.Scanner;
import java.util.Random;

public class VetoresMatrizes {
	public static void printMatriz(int matriz[][])
	{
		for (int i = 0; i < matriz.length; i++) 
		{
			for (int j = 0; j < matriz[0].length; j++) 
				{
					System.out.print(matriz[i][j] + "\t");
				}
			System.out.println();
		}

	}
	
	public static int geraNum(int a)
		{
			Random gerador = new Random();
			int num = gerador.nextInt(1,a);
			return num;
			
		}
	public static int[][] geraMatriz(int max_line, int max_column, boolean random, boolean preencher)
	{
		int line;
		int column;
		if (random == true)
				{
					line = geraNum(max_line);
					column = geraNum(max_column);
					//System.out.print(line +" " +column);
				}
		else 
			{
				line = max_line;
				column = max_column;
			}
				
		int matriz1[][] = new int[line][column];
		
		if (preencher == true)
		{
			preencheMatriz(matriz1);
		}
		
		return matriz1;
	}
	public static int[][] preencheMatriz(int matriz[][])
		{
			for(int i = 0; i <matriz.length; i++)
				{
					for(int j = 0; j < matriz[0].length; j++)
						{
							matriz[i][j] = geraNum(10);
						}
				}
			return matriz;
		}
	public static double[] preencheVetor(double vetor[])
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 10 números seguidos");
		
		double somatorio = 0;
		
		for(int i = 0; i< vetor.length; i++) 
			{
				vetor[i] = entrada.nextDouble();
				System.out.println("numero " + vetor[0]);
				
			}
		for(int i = 0; i < vetor.length; i++)
			{
				somatorio += vetor[i];
			}
		System.out.println("Somatório: " + somatorio);
		
		entrada.close();
		return vetor;
	}
	public static int[] quantidadeNum(int vetor[])
		{	
			Scanner entrada = new Scanner(System.in);
			System.out.println("Didite 10 números seguidos");
			
			for(int i = 0; i < vetor.length; i++)
				{
					vetor[i] = entrada.nextInt();
					
				}
			System.out.println("Digite um número");
			int num = entrada.nextInt();
			int qtd = 0;
			for(int i = 0; i < vetor.length; i++)
				{
					if(vetor[i] == num)
						{
							qtd += 1;
						}
				}
			System.out.println("Tem " + qtd + " números " + num + " no vetor");
			
			entrada.close();
			
			return vetor;
		}
	public static int[][] somaDiagonal(int matriz[][])
		{
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite 9 números");
			for(int i = 0; i < matriz.length; i++)
				{
					for(int j = 0; j < matriz[0].length; j++)
					{
						int num = entrada.nextInt();
						matriz[i][j] = num;
					}
				}
			int soma = 0;
			for(int i = 0; i <  matriz.length; i++)
				{
					for(int j = 0; j < matriz[0].length; j++)
						{
							if (i == j)
									{
										soma += matriz[i][j];
									}
						}
				}
			System.out.print("A soma da siagonal príncipal é " + soma);
			entrada.close();
			return matriz;
		}
	public static boolean buscaNumero(int matriz[][], int n)
		{
			 printMatriz(matriz);			
			 for(int i = 0; i < matriz.length; i++)
			 	{
				 	for(int j = 0; j < matriz[0].length; j ++)
				 		{
				 			if(matriz[i][j] == n)
				 				{
				 					return true;
				 				}
				 		}
			 	}
			 
			return false;
			
		}
	public static int[][] somaMatriz(int matriz[][], int matriz1[][])
		{
			int matriz_resultante[][] = new int[3][3];
			
			for(int i = 0; i < matriz.length; i++)
				{
					for(int j = 0; j < matriz[0].length; j++)
						{
						matriz_resultante[i][j] = matriz[i][j] + matriz1[i][j];
						}
					
				}
			return matriz_resultante;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercicio 1
		//double vetor[] = new double[10];
		//preencheVetor(vetor);
	
		//Exercicio 2
		//int vetor1[] = new int[10];
		//quantidadeNum(vetor1);
	
		// Exercicio 3
		//int matriz[][] = new int[3][3];
		//somaDiagonal(matriz);
		
		//System.out.print(buscaNumero(geraMatriz(5,5,false, true),4));
		//System.out.print(buscaNumero(geraMatriz(10,10,true, true),4));
		//Exercicio 4
		int matriz[][] = geraMatriz(3,3,false,true);
		int matriz1[][] = geraMatriz(3,3,false,true);
		printMatriz(matriz);
		printMatriz(matriz1);
		printMatriz(somaMatriz(matriz, matriz1));
	}

}
