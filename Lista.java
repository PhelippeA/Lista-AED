package ExProposto1;

import java.util.*;

public class Lista {
    private Professor inicio, fim, aux, ant;
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

    public void OrdenaLista(Professor p) 
    {
        if(inicio==null)
            inicio = p;
        if(fim==null)
            fim = p;
        while(p.matricula < p.Prox.matricula){

        }       
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
            ant = null;

            int Achou = 0;

            while (aux != null) {
                if (aux.Num == Valor) {
                    Achou++;

                    if (aux == inicio) {
                        inicio = aux.Prox;

                        aux = inicio;

                        Tamanho--;
                    } else if (aux == fim) {
                        ant.Prox = null;

                        fim = ant;

                        aux = null;

                        Tamanho--;
                    } else {
                        ant.Prox = aux.Prox;

                        aux = aux.Prox;

                        Tamanho--;
                    }

                } else {
                    ant = aux;
                    aux = aux.Prox;
                }
            }

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
