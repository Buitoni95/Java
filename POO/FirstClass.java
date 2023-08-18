public class FirstClass{
    public static void main(String[] args){
        System.out.println("Hello world");

        Animal animal1 = new Animal("amicao", "cachorro", "latido",1 );
        Animal animal2 = new Animal("miau", "gato", "miado",2 );
        Animal animal3 = new Animal("pocoto", "cavalo", "relincho",3 );
        Animal animal4 = new Animal("pocoto", "cavalo", "relincho",3 );
        Zoologico zoologico = new Zoologico(3);
        System.out.println("Foi instanciado");
        zoologico.adicionar_animal(animal1);
        zoologico.adicionar_animal(animal2);
        zoologico.adicionar_animal(animal3);
        System.out.println("Animais adicionados");
        zoologico.mostrar_animais();
        System.out.println("Tentar adicionais mais animais");
        zoologico.adicionar_animal(animal4);


        animal1.emitirSom();
        System.out.println(animal1.getIdade());

        Carro nissan_march = new Carro("Nissan","March","2020");
        nissan_march.ligar();
        nissan_march.desligar();
        nissan_march.mostrarInfo();
    }
}