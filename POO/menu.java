import java.util.*;

public class menu {
    public static void main(String[] args){
    
    tarefas lista_tarefa = new tarefas();
    Scanner input = new Scanner(System.in);
    String desc_tarefa;
    String opcao;
    int id;
    do{
        do{
            
                System.out.println("*********************************");
                System.out.println("1 - Adicionar tarefa            *");
                System.out.println("2 - Visualizar tarefas          *");
                System.out.println("3 - Remover tarefa              *");
                System.out.println("4 - Sair                        *");
                System.out.println("*********************************");
                System.out.print("Digite uma das opções: ");
                opcao = input.nextLine();
                
                if(opcao !="1" && opcao !="2" && opcao !="3" && opcao != "4"){
                    System.out.println("Opção invalida, digite novamente");
                }
                }while(opcao !="1" && opcao !="2" && opcao != "3" && opcao != "4");
            switch(opcao){
            case "1":{
                System.out.print("Digite a descrição da tarefa: ");
                desc_tarefa = input.next();
                //System.out.println("Gerando ID da tarefa: ");
                //
                lista_tarefa.adicionar(desc_tarefa);
                break;
            }
            case "3":{
                System.out.print("Digite o ID da tarefa: ");
                id = input.nextInt();
                lista_tarefa.remover(id);
                break;
                
            }
            case "2":{
                lista_tarefa.print_tarefas();
                break;
            }
            case "4":{
                System.out.println("Saindo...");
                
                break;
            }
            }
        }while(opcao != "4");
        input.close();
    }
}
