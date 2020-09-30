
public class Program
{    
    public static void main(String[] args) 
    { 
        var mL = new Lista();
        int op = mL.Menu();
        
        switch(op)
        {
            case 1:
                mL.OrdenaLista(mL.InserirNovoProfessor());
                break;
        }
        
        mL.InserirFim(81);
        mL.InserirFim(13);
        mL.InserirFim(27);
        mL.InserirFim(90);
        
        mL.MostraLista();
        
        System.out.printf("Tamanho da Lista: %1$d\n\n",mL.Tamanho);
                
        mL.RetiraElemento(13);
        
        mL.MostraLista();
        
        System.out.printf("Tamanho da Lista: %1$d\n\n",mL.Tamanho);
        
        mL.ApagaLista();
        
        mL.MostraLista();
    }
} 