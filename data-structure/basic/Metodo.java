public class Metodo {
	public static double imc(double peso, double altura)
	{
		double imc = peso/(altura * altura);
		return imc;
	}
	public static int retornaSomaPrimeiros(int a)
	{	int valor = 0;
		for (int i = a; i >= 1; i--)
		{
			valor += i;
		}
		return valor;
	}
	public static int retornaMaior(int a, int b)
	{	if (a > b)
		{
			return a;
		}
	else
		{
			return b;
		}
		
	}
	public static String concatena(String a, String b)
	{
		return a+b;
	}
	public static void saudacao(String nome)
	{
		System.out.println("Olá" + nome);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(retornaMaior(2,7));
		System.out.print("\n"+ concatena("A","b")+ "\n");
		System.out.println("Victor");
		System.out.println(retornaSomaPrimeiros(5));
		System.out.println(imc(40, 1.4));
		
	}

}
