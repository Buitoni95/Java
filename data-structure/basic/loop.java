import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// testa a condição no inicio
		int cont = 1;
		while (cont <=10) 
		{
			System.out.println(cont);
			cont++;
		}
		//testa a condição no final sempre executa pelo menos uma vez. entra no código, executa e depois testa a condição
		int num = 1;
		do 
		{
			System.out.print(num+ " ");
			num++;
		} while(num <= 10);
		
		for (int i = 9; i< 10; i++) 
		{
			System.out.print(i);
		}
		
		
		
		entrada.close();
	}

}
