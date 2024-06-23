package Pilha;
public class Pilha{

    public static void main (String args[]){
        Livro topo = new Livro();
        empilhar (topo,"A menina que roubava livros");
        empilhar (topo,"Quem é você Alasca?");
        empilhar (topo,"A garota do lago");
        empilhar (topo,"A rainha vermelha");
        empilhar (topo,"O pequeno príncipe");
        empilhar (topo,"Jogos Vorazes");
        desempilhar(topo);
        Exibir (topo.getProximo());
        desempilhar(topo);
        Exibir (topo.getProximo());

    }
    
    //Eu quero adicionar o livro na pilha, considerando o seu nome l=topo
    public static void empilhar (Livro topo, String nome) { 

        //declarando o meu topo
        Livro novoLivro = new Livro();
        // novo livro aponta para o livro anterior
        novoLivro.setNome(nome); 
        if(topo.getProximo() == null){
           topo.setProximo(novoLivro); 
            return;
        }
        //livro aponta para outro livro, sem relação com o topo
        novoLivro.setProximo(topo.getProximo());
        //topo aponta para o novo livro
        topo.setProximo(novoLivro); 
    }
    
    public static String desempilhar(Livro topo){ 

            if (topo.getProximo() != null){
                // O meu lixo é onde o topo(livro é o meu topo) está apontando 
                Livro lixo = topo.getProximo();
                topo.setProximo(topo.getProximo().getProximo());
                lixo.setProximo(null);
                System.out.println("Livro removido:"+lixo.getNome());
                return lixo.getNome();
            }
            return null;
        }
        

    //exibir toda a minha pilha de livros
    public static void Exibir(Livro livro){
        //se a pilha de livros estiver vazia, não retorne nada
        if (livro == null){
            return;
        }
        System.out.println(livro.getNome());
        //se tiver algum livro, precisa exibir o nome do livro
        Exibir(livro.getProximo());
    }

}