import java.util.Scanner;// importa o pacote que permite dar entradas de dados (input)

public class myFirstProgramJava {//Classe que contém o método principal.
	public static void main(String[] args) {// Este é o método principal.
		System.out.println("Olá amigo! \nQual é o seu nome?"); // Uso do println ele pula uma liinha e o 
																// print normal não pula linha
		
		//Ler uma string do console usando a biblioteca Scanner. Fazer imput
		// as variáveis precisam ter os tipos delas declarados
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine(); // Lê a linha que foi digitada no console(apenas as entradas de texto
		
		System.out.println("Informe a sua idade: ");
		
		int idade = entrada.nextInt();
		
		//Exibir uma string usando o printf.
		System.out.printf("Olá %s!\n", nome); // ou System.out.println("Seu nome é :" + nome) %s o S indica que vai entrar uma
											// string
		System.out.println("Sua idade é: " + idade);
		

	}

}
