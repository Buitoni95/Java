import java.util.*;
public class classroom {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Marcos", 15);
        Aluno aluno2 = new Aluno("Lais", 16);
        Aluno aluno3 = new Aluno("Felipe", 17);
        Escola escola = new Escola(2);
        escola.adicionar_aluno(aluno1);
        escola.adicionar_aluno(aluno2);
        escola.mostrarAlunos();
        escola.adicionar_aluno(aluno3);


    }
    
}
class Aluno{
    private String nome;
    private int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}

class Escola{
    private int capacidade;
    private ArrayList<Aluno> alunos;
        
    public Escola(int capacidade){
        this.capacidade = capacidade;
        this.alunos = new ArrayList<>();
    }
    public void adicionar_aluno(Aluno aluno){
        if (this.alunos.size() == capacidade){
            System.out.println("Escola sem vaga!");
        }
        else{
            alunos.add(aluno);
        }
            
    }
    public void mostrarAlunos(){
        for(Aluno aluno:alunos){
            aluno.mostrarInfo();
        }
    }
}
