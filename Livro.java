package Pilha;
public class Livro {
    private String nome;
    Livro proximo;

    public String getNome() {
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public Livro getProximo(){
        return proximo;
    }

    public void setProximo(Livro proximo){
        this.proximo = proximo;
    }

}
