package Arvore;
public class Main{
    public static void main(String[] args) {
        No raiz = inserir(null, 8);
        raiz = inserir(raiz, 5);
        raiz = inserir(raiz, 15);
        raiz = inserir(raiz, 2);
        raiz = inserir(raiz, 1);
        raiz = inserir(raiz, 3);
        raiz = inserir(raiz, 6);
        raiz = inserir(raiz, 7);
        raiz = inserir(raiz, 11);
        raiz = inserir(raiz, 13);
        raiz = inserir(raiz, 19);
        raiz = inserir(raiz, 21);
        raiz = remove(raiz);
        raiz = remove(raiz);
        buscar(raiz, 13);
    }
    public static No inserir(No raiz, int valor) {
            No novo = new No();
            
            novo.setValor(valor);
            //árvore não existe
            if(raiz == null){
                raiz = novo;
                return raiz;
            }
            No subraiz = null;
            No aux = raiz;
            while (aux != null) {
                subraiz = aux;
                if(novo.valor <aux.valor){
                    aux = aux.esquerda;
                } else{
                    aux = aux.direita;
                }
            }
            if (novo.valor < subraiz.valor){
                subraiz.esquerda = novo;
            } else{
                subraiz.direita = novo;
            }
            return raiz;
       }
    public static No remove(No raiz){
        if (raiz == null){
            return null;
        }
        if (raiz.esquerda == null){
            return raiz.direita;
        }
        No maior = raiz.direita;
        No anterior = null;
        while (maior.direita != null){
            anterior = maior;
            maior = maior.direita;
        }
        if (anterior != null){
            anterior.direita = maior.direita;
            maior.esquerda = raiz.esquerda;
        }
        maior.direita = raiz.direita;
        return maior;   
    }
    public static int buscar(No raiz, int valor){
            if (raiz == null) {
                return 0;
            }
            if (valor == raiz.valor) {
                return raiz.valor;
            }
            if (valor < raiz.valor) {
                return buscar(raiz.esquerda, valor);
            }
            return buscar(raiz.direita, valor);
        }
    }

