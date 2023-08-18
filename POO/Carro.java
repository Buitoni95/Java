public class Carro {
    private String marca;
    private String modelo;
    private String ano;
    private boolean ligado;

    public Carro(String marca, String modelo, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }
    public void ligar(){
        this.ligado = true;
        System.out.println("Carro ligado!");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Carro desligado!");
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Ligado: " + this.ligado);
    }
}
