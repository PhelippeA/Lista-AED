
import java.util.*;

public class Lista 
{
    private Professor inicio, fim, aux;
    public int Tamanho;
    Scanner s = new Scanner(System.in);

    public Lista() {
        inicio = null;
        fim = null;
        Tamanho = 0;
    }

    public Professor InserirNovoProfessor() 
    {
        var p = new Professor();
        System.out.print("Informe os dados do professor\nNome: ");
        p.nome = s.nextLine();
        System.out.print("Email: ");
        p.email = s.nextLine();
        System.out.print("Matrícula: ");
        p.matricula = Integer.parseInt(s.nextLine());
        System.out.print("Telefone: ");
        p.telefone = Integer.parseInt(s.nextLine());

        return p;
    }
    public Professor ListaDeTeste()
    {
        Professor a = new Professor();
        Professor b = new Professor();
        a.matricula = 10;
        b.matricula = 14;
        
        a.Ant = b;
        b.Prox = a;

        return a;
    }

    public void OrdenaLista(Professor p) 
    {
        if(inicio==null){
            inicio = fim = p;
            return;
        }
        
        aux = ListaDeTeste();
        
        do{
            if(p.matricula < aux.matricula)
                break;
            aux = aux.Prox;
        }while(aux.Prox != null);
        p.Prox = aux.Prox;
        aux.Prox.Ant = p;
        p.Ant = aux;
        aux.Prox = p;
    }             

    public int Menu() {
        Scanner S = new Scanner(System.in);
        int op;

        System.out.println("Escolha a opção desejada");
        System.out.println("");
        op = Integer.parseInt(S.nextLine());

        S.close();
        return op;

    }

    public void InserirFim(int Valor) {
        // Elemento Novo=new Elemento();
        // Novo.Num=Valor;

        // if(inicio==null){
        // inicio=Novo;
        // fim=Novo;
        // } else {
        // fim.Prox=Novo;
        // fim=Novo;
        // }
        // Tamanho++;
    }

    public void MostraLista() {
        Scanner S = new Scanner(System.in);

        if (inicio == null) {
            System.out.println("A Lista não possui nenhum elemento...\n\n");

            S.nextLine();
        } else {
            aux = inicio;

            while (aux != null) {
                System.out.printf("%1$6d\n", aux.Num);
                aux = aux.Prox;
            }

            S.nextLine();
        }
        S.close();
    }

    public void RetiraElemento(int Valor) {
        Scanner S = new Scanner(System.in);

        if (inicio == null) {
            System.out.println("A Lista não possui nenhum elemento...\n\n");

            S.nextLine();
        } else {
            aux = inicio;
            // Ant = null;

            int Achou = 0;

            // while (aux != null) {
            //     if (aux.Num == Valor) {
            //         Achou++;

            //         if (aux == inicio) {
            //             inicio = aux.Prox;

            //             aux = inicio;

            //             Tamanho--;
            //         } else if (aux == fim) {
            //             Ant.Prox = null;

            //             fim = Ant;

            //             aux = null;

            //             Tamanho--;
            //         } else {
            //             Ant.Prox = aux.Prox;

            //             aux = aux.Prox;

            //             Tamanho--;
            //         }

            //     } else {
            //         Ant = aux;
            //         aux = aux.Prox;
            //     }
            // }

            if (Achou == 0) {
                System.out.printf("\nO Valor %1$d não foi encontrado na lista...\n", Valor);
            } else {
                System.out.printf("\nO valor %1$d foi encontrado %2$d vez(es) e removido...\n", Valor, Achou);
            }
        }
        S.close();
    }

    public void ApagaLista() {
        inicio = null;
    }
}
