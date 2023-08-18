import java.util.*;

public class tarefas {
    Map<Integer, String> tarefas = new HashMap<>();

    public void adicionar(String tarefa){
        Random gerador_id = new Random();
        int id = gerador_id.nextInt(10000000);
        while(tarefas.containsKey(id)){
        id = gerador_id.nextInt(10000000);
        }
        tarefas.put(id, tarefa);
    }

    public void remover(int id){
        if(tarefas.containsKey(id)){
            tarefas.remove(id);
            System.out.println("Tarefa com ID " + id + " removida com sucesso");
        }
        else{
            System.out.println("ID" + id + " não encontrado");
        }
    }

        public void print_tarefas(){
        for(Map.Entry<Integer, String> t: tarefas.entrySet()){
            System.out.println(t.getKey() + " - " + t.getValue());
        };
    }
}



