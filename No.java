package Arvore;

public class No {
    int valor;
    No esquerda;
    No direita;
    
    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
    public No getEsquerda(){
        return this.esquerda;
    }
    public void setEsquerda(No esquerda){
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
    
}
