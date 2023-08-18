import java.util.ArrayList;
public class Zoologico {
    private int capacidade;
    private ArrayList<Animal> animais;

    public Zoologico(int capacidade){
        this.animais = new ArrayList<>();
        this.capacidade = capacidade;
    }

    public void adicionar_animal(Animal animal){
        if (animais.size() == capacidade){
            System.out.println("Zoológico cheio");
        }
        else{
            this.animais.add(animal);
        }
    }
    public void mostrar_animais(){
        for(Animal animal: this.animais){
            animal.mostrarInfo();
        }
        }
    }

