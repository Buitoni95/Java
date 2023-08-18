public class Animal {
    private String nome;
    private String tipo;
    private String som;
    private int idade;

   
    public Animal(String nome, String tipo, String som, int idade){
        this.nome = nome;
        this.tipo = tipo;
        this.som = som;
        this.idade = idade;

    }
    public void emitirSom (){
        System.out.println("auauau");
    }
//////////////////////////////////////////////
    public void setSom(String som){
        this.som = som;
    }
    public String getSom(){
        return  this.som;
    }
//////////////////////////////////////////////
    public int setIdade(){
        return this.idade;
    }
    public int getIdade(){
        return this.idade;
    }
//////////////////////////////////////////////
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
//////////////////////////////////////////////
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;   
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo:" + this.tipo);
        System.out.println("Som: " + this.som);
        System.out.println("Idade: " + this.idade);

    }
    public void aumentarIdade(int idade){
        this.idade = this.idade + idade;
    }

    
}
