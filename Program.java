package ExProposto1;

public class Program
{    
    public static void main(String[] args) 
    { 
        var MinhaLista = new Lista();
        
        MinhaLista.InserirFim(81);
        MinhaLista.InserirFim(13);
        MinhaLista.InserirFim(27);
        MinhaLista.InserirFim(90);
        
        MinhaLista.MostraLista();
        
        System.out.printf("Tamanho da Lista: %1$d\n\n",MinhaLista.Tamanho);
                
        MinhaLista.RetiraElemento(13);
        
        MinhaLista.MostraLista();
        
        System.out.printf("Tamanho da Lista: %1$d\n\n",MinhaLista.Tamanho);
        
        MinhaLista.ApagaLista();
        
        MinhaLista.MostraLista();
    }
} 