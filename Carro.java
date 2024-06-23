package Fila;

public class Carro{
    String valor;
    Carro proximo;

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }
    public Carro getProximo(){
        return proximo;
    }
    public void setProximo(Carro proximo){
        this.proximo = proximo;
    }
}

