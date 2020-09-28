package ExProposto1;

class Elemento 
{
    public int Num, matricula, telefone;
    public String email, nome;
    public Elemento Prox;

    public Elemento(int matricula, int telefone, String email, String nome) 
    {
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
        Num = 0;
        Prox = null;
    }
}


 














